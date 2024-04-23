package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Library.SelectClassUtility;

public class MyProfilePage extends BasePage 
{
	SelectClassUtility dropdown = new SelectClassUtility();
	
	public MyProfilePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='Edit Profile   ']")
	private WebElement editProfile;
	
	@FindBy(xpath="//input[@id='First Name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement LastName;

	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1']")
	private WebElement DateOfBirth;
	
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//select[@id='Country']")
	private WebElement country;
	
	@FindBy(xpath="//select[@id='State']")
	private WebElement state;
	
	@FindBy(xpath="//select[@id='City']")
		private WebElement city;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit;
	
	public WebElement getEditProfile() {
	return editProfile;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getDateOfBirth() {
		return DateOfBirth;
	}

	
	
	public void editProfile() throws InterruptedException
	{
		getEditProfile().click();
		getFirstName().clear();
		Thread.sleep(2000);
		getFirstName().sendKeys("Krishna");
		Thread.sleep(2000);
		getLastName().clear();
		Thread.sleep(2000);
		getLastName().sendKeys("Nama");
		Thread.sleep(2000);
		//getDateOfBirth().clear();
		//getDateOfBirth().sendKeys("12/31/1986");
		getPhoneNumber().clear();
		getPhoneNumber().sendKeys("5463752938");
		dropdown.selectDropDownByValue(country, "USA");
		Thread.sleep(2000);
		dropdown.selectDropDownByVisibleText(state, "New York");
		Thread.sleep(2000);
		dropdown.selectDropDownByValue(city, "Cambridge");
		Thread.sleep(2000);
		try {
		   // WebElement element = driver.findElement(By.id("elementId"));
		    getSubmit().click();
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
		   // WebElement element = driver.findElement(By.id("elementId"));
		    getSubmit().click();
		}
		//getSubmit().click();		
	}
	
}

