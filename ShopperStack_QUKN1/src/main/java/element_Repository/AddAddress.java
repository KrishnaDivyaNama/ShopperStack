package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Library.SelectClassUtility;

public class AddAddress extends BasePage{
	
	
	public AddAddress(WebDriver driver) 
	{
		super(driver);
	
	}
	
	SelectClassUtility select = new SelectClassUtility();
	@FindBy(xpath="//input[@id='Home']")
	private WebElement home;
	
	@FindBy(xpath="//input[@id='Office']")
	private WebElement office;
	
	@FindBy(xpath="//input[@id='Other']")
	private WebElement other;
	
	@FindBy(xpath="//input[@id='Name']")
	private WebElement NameTextField;
	
	@FindBy(xpath="//input[@id='House/Office Info']")
	private WebElement House_Office_Number;
	
	@FindBy(xpath="//input[@id='Street Info']")
	private WebElement StreetInfo;
	
	@FindBy(xpath="//input[@id='Landmark']")
	private WebElement Landmark;
	
	@FindBy(xpath="//select[@id='Country']")
	private WebElement country;
	
	@FindBy(xpath="//select[@id='State']")
	private WebElement state;
	
	@FindBy(xpath="//select[@id='City']")
		private WebElement city;
	
	@FindBy(xpath="//input[@id='Pincode']")
	private WebElement Pincode;
	
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement Phone_Number;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement add_address;

	
	public WebElement getHome() {
		return home;
	}

	public WebElement getOffice() {
		return office;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getNameTextField() {
		return NameTextField;
	}

	public WebElement getHouse_Office_Number() {
		return House_Office_Number;
	}

	public WebElement getStreetInfo() {
		return StreetInfo;
	}

	public WebElement getLandmark() {
		return Landmark;
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

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getPhone_Number() {
		return Phone_Number;
	}

	public WebElement getAdd_address() {
		return add_address;
	}
	
	public void perfomAddAddress()
	{
		getAdd_address().click();
	}
	public void selectCountry()
	{
		select.selectDropDownByVisibleText(country, "India");
	}
	public void selectState()
	{
		select.selectDropDownByVisibleText(state, "Maharastra");
	}
	public void selectCity()
	{
		select.deselectDropDownByVisibleText(city, "Thane");
	}

}
