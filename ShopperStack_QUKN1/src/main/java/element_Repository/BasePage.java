package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Library.SelectClassUtility;

public class BasePage {
	
	/**
	*
	*@author Afshan
	*
	**/
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(xpath = "//a[@id='kids']")
	private WebElement kidsLink;
	
	public WebElement getKidsLink() {
		return kidsLink;
	}

	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountButton;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myaddress;
	
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement wishList;
	
	@FindBy(xpath="//li[text()='My Orders']")
	private WebElement myOrders;
	
	@FindBy(xpath="//li[text()='My Likes']")
	private WebElement myLikes;
	
	@FindBy(xpath = "//li[text()='My Wallet']")
	private WebElement myWallet;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutButton;
	

	
	
	public WebElement getMyaddress() {
		return myaddress;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}
	
	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getMyOrders() {
		return myOrders;
	}

	public WebElement getMyLikes() {
		return myLikes;
	}

	public WebElement getMyWallet() {
		return myWallet;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void performLogout() {
		
		getAccountButton().click();
		getLogoutButton().click();

	}
	
	public void myProfile() {
		getAccountButton().click();
		getMyProfile().click();
		getMyaddress().click();
	}
	
	public void wishList()
	{
		getAccountButton().click();
		getWishList().click();
	}
	
	public void myOrders()
	{
		getAccountButton().click();
		getMyOrders().click();
	}
	
	public void myLikes()
	{
		getAccountButton().click();
		getMyLikes().click();
	}
	
	public void myWallet()
	{
		getAccountButton().click();
		getMyWallet().click();
	}
	
}
