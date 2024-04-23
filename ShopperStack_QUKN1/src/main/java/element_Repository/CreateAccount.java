package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends BasePage{

	@FindBy(xpath="//input[@id='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath="//span[@class='MuiIconButton-label']/input[@id='Female']")
	private WebElement female;
	
	@FindBy(xpath="//span[@class='MuiIconButton-label']/input[@id='Male']")
	private WebElement male;
	
	@FindBy(xpath="//span[@class='MuiIconButton-label']/input[@id='Other']")
	private WebElement other;
	
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='Email Address']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='Confirm Password']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//span[@class='MuiIconButton-label']/input[@id='Terms and Conditions']")
	private WebElement termsAndConditions;
	
	@FindBy(xpath="//button[@id='Register']")
	private WebElement register;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getTermsAndConditions() {
		return termsAndConditions;
	}

	public WebElement getRegister() {
		return register;
	}

	public CreateAccount(WebDriver driver) {
		super(driver);
	}

	public void register()
	{
		getFirstName().sendKeys("Krishna");
		getLastName().sendKeys("Nama");
		getFemale().click();
		getPhoneNumber().sendKeys("2984383484");
		getEmailAddress().sendKeys("krishnadivya9273@gmail.com");
		getPassword().sendKeys("KrishnaDivya");
		getConfirmPassword().sendKeys("KrishnaDivya");
		getTermsAndConditions().click();
		getRegister().click();
	}
}
