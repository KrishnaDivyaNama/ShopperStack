package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends LoginPage{
	
	

	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	
	@FindBy(xpath="//div[text()='User email , does not exist']")
	private WebElement alert;
	
	@FindBy(xpath="//span[@class='MuiTouchRipple-root css-w0pj6f']")
	private WebElement resetLink;
	
	@FindBy(xpath="//div[@id='ipwz153']")
	private WebElement toasterMessage;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getAlert() {
		return alert;
	}

	public WebElement getResetLink() {
		return resetLink;
	}

	public WebElement getToasterMessage() {
		return toasterMessage;
	}

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	public void forgotPassword()
	{
		getForgotPassword().click();
		getEmail().sendKeys();
		getProceed().click();
		getResetLink().click();
		String msg = getToasterMessage().getText();
		System.out.println(msg);
		
	}
	

}
