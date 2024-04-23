package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddAddress;
import generic_Library.BaseTest;

public class AddAddressTest extends BaseTest{
	
	@Test
	public void verify_AddAddress() throws InterruptedException
	{
		
		base_Page.myProfile();
		AddAddress address = new AddAddress(driver);
		address.perfomAddAddress();
		Thread.sleep(200);
		address.getHome().click();
		address.getNameTextField().sendKeys("Shreya");
		address.getHouse_Office_Number().sendKeys("1984");
		address.getStreetInfo().sendKeys("Meena Bazaar");
		address.getLandmark().sendKeys("opp to HDFC bank");
		Thread.sleep(200);
		address.selectCountry();
		address.selectState();
		address.selectCity();
		Thread.sleep(200);
		address.getPincode().sendKeys("432101");
		address.getPhone_Number().sendKeys("4587962145");;
		Thread.sleep(200);
		address.getAdd_address().click();
		Thread.sleep(200);
		utility_Methods.takeScreenshot(driver);
		Thread.sleep(200);
	}

}
