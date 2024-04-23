package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeautyLink extends BasePage{

	@FindBy(xpath="//a[@id='beautyProducts']")
	private WebElement beauty;
	
	@FindBy(xpath="//a[@href='/sub-category/lipstick']")
	private WebElement lipstick;
	
	@FindBy(xpath="//a[@href='/sub-category/mascara']")
	private WebElement mascara;
	
	@FindBy(xpath="//a[@href='/sub-category/kajal']")
	private WebElement kajal;
	
	public WebElement getBeauty() {
		return beauty;
	}

	public WebElement getLipstick() {
		return lipstick;
	}

	public WebElement getMascara() {
		return mascara;
	}

	public WebElement getKajal() {
		return kajal;
	}

	public BeautyLink(WebDriver driver) {
		super(driver);
	}
	
	public void beauty()
	{
		getBeauty().click();
	}
	
	public void lipstick()
	{
		getLipstick().click();
	}
	
	public void mascara()
	{
		getMascara().click();
	}
	
	public void kajal()
	{
		getKajal().click();
	}
}
