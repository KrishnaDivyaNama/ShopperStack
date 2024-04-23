package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import generic_Library.BaseTest;

public class TC01_Test extends BaseTest {

	@Test
	public void addToCartTestCase() throws InterruptedException {

		System.out.println("Test Case 01");
		test.log(Status.PASS, "Test Case 01");
		Reporter.log("Execution",true);
	
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver), "Test Case 01");
	}
}
