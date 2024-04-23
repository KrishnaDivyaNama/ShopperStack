package testscripts;

import org.testng.annotations.Test;

import element_Repository.CartFunctionalities;
import element_Repository.PaymentMethod;
import generic_Library.BaseTest;

public class PaymentTest extends  BaseTest{
	
	@Test
	public void perform_netbanking() throws InterruptedException
	{
		PaymentMethod netbanking = new PaymentMethod(driver);
		CartFunctionalities buyNow = new CartFunctionalities(driver);
		buyNow.buyNow();
		Thread.sleep(2000);
		netbanking.getSelect_Address().click();
		Thread.sleep(2000);
		netbanking.getProceed().click();
		Thread.sleep(2000);
		netbanking.getClearSelection().click();	
		Thread.sleep(2000);
		netbanking.getNetBanking().click();
		Thread.sleep(2000);
		netbanking.getProceed().click();
		Thread.sleep(2000);
		netbanking.getIDHC().click();
		Thread.sleep(2000);
		//netbanking.getNetBankingSubmit().click();
	}

}
