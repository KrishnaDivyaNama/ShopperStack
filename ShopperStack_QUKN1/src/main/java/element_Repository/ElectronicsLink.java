package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsLink extends BasePage{

	@FindBy(xpath="//a[@id='electronics']")
	private WebElement Electronic;
	
	@FindBy(xpath="//a[@href='/sub-category/camera']")
	private WebElement Camera;
	
	@FindBy(xpath="//a[@href='/sub-category/watch']")
	private WebElement watch;
	
	@FindBy(xpath="//a[@href='/sub-category/laptop']")
	private WebElement laptops;
	
	
	
	public WebElement getElectronic() {
		return Electronic;
	}



	public WebElement getCamera() {
		return Camera;
	}



	public WebElement getWatch() {
		return watch;
	}



	public WebElement getLaptops() {
		return laptops;
	}



	public ElectronicsLink(WebDriver driver) {
		super(driver);
	}
	
	public void electronic()
	{
		getElectronic().click();
	}

	public void camera()
	{
		getCamera().click();
	}
	
	public void watch()
	{
		getWatch().click();
	}
	
	public void laptops()
	{
		getLaptops().click();
	}
}
