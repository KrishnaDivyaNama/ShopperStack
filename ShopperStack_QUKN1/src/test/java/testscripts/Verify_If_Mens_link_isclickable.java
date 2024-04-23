package testscripts;

import org.testng.annotations.Test;


import generic_Library.BaseTest;

public class Verify_If_Mens_link_isclickable extends BaseTest {
	
	@Test
	public void wishListTestCase() throws InterruptedException
	{
		
		base_Page.getMenLink().click();
		utility_Methods.takeScreenshot(driver);
	}
}
