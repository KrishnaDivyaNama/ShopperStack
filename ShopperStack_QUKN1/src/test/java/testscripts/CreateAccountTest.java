package testscripts;

import org.testng.annotations.Test;

import generic_Library.SignupTest;

public class CreateAccountTest extends SignupTest
{

	@Test
	public void CreateAccount() throws InterruptedException
	{
		//element_Repository.CreateAccount register = new element_Repository.CreateAccount();
	
		Thread.sleep(2000);
		utility_Methods.takeScreenshot(driver);
		Thread.sleep(2000);
	}
}
