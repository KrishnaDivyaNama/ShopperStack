package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethod extends BasePage {
	

	public PaymentMethod(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='34209']")
	private WebElement select_Address;
	@FindBy(xpath="//input[@value='Net Banking']")
	private WebElement NetBanking ;
	
	@FindBy(xpath="//input[@value='COD']")
	private WebElement CashOnDelivery;
	
	@FindBy(xpath="//button[text()='Clear Selection']")
	private WebElement ClearSelection;
	
	@FindBy(xpath="//button[text()='Add Card']")
	private WebElement AddCard ;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement Proceed;
	
	@FindBy(xpath="(.//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	private WebElement IDHC;
	
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement ICD;
	
	@FindBy(xpath="//input[@class='PrivateSwitchBase-input css-1m9pwf3'][@value='TBI']")
	private WebElement TBI;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@id='User ID']")
	private WebElement userID;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='Submit']")
	private WebElement NetBankingSubmit;
	
	@FindBy(xpath="//button[text()='Pay Now']")
	private WebElement payNow;
	
	

	public WebElement getSelect_Address() {
		return select_Address;
	}

	public WebElement getNetBanking() {
		return NetBanking;
	}

	public WebElement getCashOnDelivery() {
		return CashOnDelivery;
	}


	public WebElement getClearSelection() {
		return ClearSelection;
	}


	public WebElement getAddCard() {
		return AddCard;
	}


	public WebElement getProceed() {
		return Proceed;
	}


	public WebElement getIDHC() {
		return IDHC;
	}


	public WebElement getICD() {
		return ICD;
	}


	public WebElement getTBI() {
		return TBI;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getUserID() {
		return userID;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getNetBankingSubmit() {
		return NetBankingSubmit;
	}


	public WebElement getPayNow() {
		return payNow;
	}


}
