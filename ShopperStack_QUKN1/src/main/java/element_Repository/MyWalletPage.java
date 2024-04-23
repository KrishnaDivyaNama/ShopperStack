package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWalletPage extends BasePage{
	
	
	@FindBy(xpath="//button[text()='Add Money']")
	private WebElement addMoney;
	
	@FindBy(xpath="//button[text()='Use Coupon']")
	private WebElement useCoupon;
	
	@FindBy(xpath="//button[@id='Verify']")
	private WebElement verify;
	
	@FindBy(xpath="//input[@id='Coupon Code']")
	private WebElement couponCode;
	
	@FindBy(xpath="//button[text()='View Transactions']")
	private WebElement viewTransaction;
	
	public WebElement getAddMoney() {
		return addMoney;
	}
	
	public WebElement getUseCoupon() {
		return useCoupon;
	}

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getCouponCode() {
		return couponCode;
	}

	public WebElement getViewTransaction() {
		return viewTransaction;
	}

	public MyWalletPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void addMoney()
	{
		getAddMoney().click();
	}
	
	public void useCoupon()
	{
		getUseCoupon().click();
	}
	
	public void verify()
	{
		getVerify().click();
	}
}
