package testscripts;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

import element_Repository.MyProfilePage;
import generic_Library.BaseTest;
//import generic_Library.SelectClassUtility;

public class MyProfileTest extends BaseTest{
	
	@Test
	public void performEditProfile() throws InterruptedException, ElementClickInterceptedException
	{
		base_Page.getAccountButton().click();
		base_Page.getMyProfile().click();
		Thread.sleep(2000);
		MyProfilePage Profile = new MyProfilePage(driver);
		Profile.editProfile();
		utility_Methods.takeScreenshot(driver);
	
		Profile.getSubmit();
		Thread.sleep(2000);
		utility_Methods.acceptAlert(driver);
		//SelectClassUtility dropdown = new SelectClassUtility();
		//dropdown.selectDropDownByValue(Profile.getCountry(), "USA");
		
	}

	
}
