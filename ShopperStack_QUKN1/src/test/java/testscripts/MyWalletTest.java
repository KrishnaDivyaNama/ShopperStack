package testscripts;

import org.testng.annotations.Test;

import element_Repository.MyWalletPage;
import generic_Library.BaseTest;

public class MyWalletTest extends BaseTest {
	
	@Test
	public void addMoney() throws InterruptedException
	{
		base_Page.getAccountButton().click();
		Thread.sleep(2000);
		base_Page.getMyWallet().click();
		MyWalletPage wallet = new MyWalletPage(driver);
		wallet.getAddMoney();
		Thread.sleep(2000);
		wallet.getUseCoupon();
		Thread.sleep(2000);
		wallet.getViewTransaction();
		Thread.sleep(2000);
		utility_Methods.takeScreenshot(driver);
		
	}
	

}
