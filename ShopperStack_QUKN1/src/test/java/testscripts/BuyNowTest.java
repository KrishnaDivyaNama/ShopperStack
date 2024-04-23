package testscripts;

import org.testng.annotations.Test;

import element_Repository.CartFunctionalities;
import generic_Library.BaseTest;

public class BuyNowTest extends BaseTest{
	
	@Test
	public void Verify_BuyNow() throws InterruptedException
	{
		CartFunctionalities buyNow = new CartFunctionalities(driver);
		buyNow.buyNow();
		Thread.sleep(2000);
		
	}
}
