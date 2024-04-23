package testscripts;

import org.testng.annotations.Test;

import element_Repository.KidsLink;
import generic_Library.BaseTest;

public class KidsLinkTest extends BaseTest{

	@Test
	public void perform_kidsLink() throws InterruptedException
	{
		base_Page.getKidsLink().click();
		KidsLink kidsLink = new KidsLink(driver);
		kidsLink.getBoysTshirts().click();
		Thread.sleep(2000);
		kidsLink.getGreenTshirt().click();
		Thread.sleep(1000);
		kidsLink.getAddToCart().click();
		
	}

}
