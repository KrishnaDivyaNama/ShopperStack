package testscripts;

import org.testng.annotations.Test;

import element_Repository.WomenLink;
import generic_Library.BaseTest;

public class AddToCart extends BaseTest{
	
	@Test
	public void perform_addTocart() throws InterruptedException
	{
		WomenLink women = new WomenLink(driver);
		Thread.sleep(2000);
		women.getAdd_to_cart();
		Thread.sleep(2000);
	}
}
