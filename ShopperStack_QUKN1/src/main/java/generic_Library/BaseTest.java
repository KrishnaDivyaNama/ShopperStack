package generic_Library;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import element_Repository.BasePage;
import element_Repository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements FrameWorkConstants {

	/**
	 *
	 * @author Afshan
	 *
	 **/

	public WebDriver driver;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	public BasePage base_Page;
	public LoginPage login_page;
	public UtilityMethods utility_Methods = new UtilityMethods();
	public DataUtility data_Utility = new DataUtility();

	@BeforeSuite(alwaysRun = true)
	public void extentReportSetUp() {
		sparkReporter = new ExtentSparkReporter("./Reports/" + utility_Methods.getCurrentTime() + ".html");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		Reporter.log("Execution Started", true);  
	}

	@Parameters("Browser")
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser(@Optional("Firefox") String browser) throws IOException, InvaidBrowserNameException, InterruptedException {
		if (browser.equals("Firefox")) 
		{
			driver = new FirefoxDriver();
			Reporter.log("Firefox Browser Launched", true);
		}
			else if (browser.equals("Chrome")) 
			{
			driver = new ChromeDriver();
			Reporter.log("Chrome Browser Launched", true);
		} 
			else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
			Reporter.log("Edge Browser Launched", true);
		}else {
			
			throw new InvaidBrowserNameException(browser);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait_Time));
		driver.get(data_Utility.getDataFromProperties(url_Key));
		Thread.sleep(3000);
	}

	@BeforeMethod(alwaysRun = true)
	public void performingLogin(Method method) throws IOException, InterruptedException {

		test = reports.createTest(method.getName());
		base_Page = new BasePage(driver);
		base_Page.getLoginButton().click();
		Thread.sleep(3000);
		LoginPage login_Page = new LoginPage(driver);
		login_Page.performLogin(data_Utility.getDataFromProperties(email_Key),data_Utility.getDataFromProperties(password_Key));
		Reporter.log("Performing Login", true);
		Thread.sleep(3000);
	}

	@AfterMethod(alwaysRun = true)
	public void performingLogout() throws InterruptedException {
		Thread.sleep(3000);
		base_Page.performLogout();
		Reporter.log("Performing Logout", true);
	}

	@AfterClass(alwaysRun = true)
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Closing Browser", true);
	}

	@AfterSuite(alwaysRun = true)
	public void extentReportFlush() {
		reports.flush();
		Reporter.log("Execution Ended", true);
	}
}

/*
 *!! -------------------_ Custom Exceptions _---------------------------!!
 */

@SuppressWarnings("serial")
class InvaidBrowserNameException extends Exception{
	
	public InvaidBrowserNameException(String browser) {
		super("Invalid Browser Name ('"+browser+"') : Unable To Find a Browser To Launch On The Name Specified - Enter a Valid Browser Name - Example ('Chrome' or 'Edge')");
	}
}