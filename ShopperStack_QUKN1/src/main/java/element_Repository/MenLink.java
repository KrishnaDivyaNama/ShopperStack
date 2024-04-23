package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenLink extends BasePage {
	
	@FindBy(xpath="//a[@id='men']")
	private WebElement men;
	
	@FindBy(xpath="//a[text()='Topwear']")
	private WebElement topWear;
	
	@FindBy(xpath="//a[text()='BottomWear']")
	private WebElement bottomWear;
	
	@FindBy(xpath="//a[text()='Indian & Festive Wear']")
	private WebElement festiveWear;
	
	@FindBy(xpath="//div[@class='menu_dropDown__nH+UF']/..//a[@href='/sub-category/men-tshirt']")
	private WebElement tshirts;
	
	@FindBy(xpath="//div[@class='menu_dropDown__nH+UF']/..//a[@href='/sub-category/men-jeans']")
	private WebElement jeans;
	
	@FindBy(xpath="//div[@class='menu_dropDown__nH+UF']/..//a[@href='/sub-category/men-kurta']")
	private WebElement kurthas;
	
	
	public WebElement getMen() {
		return men;
	}

	public WebElement getTopWear() {
		return topWear;
	}

	public WebElement getBottomWear() {
		return bottomWear;
	}

	public WebElement getFestiveWear() {
		return festiveWear;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getJeans() {
		return jeans;
	}

	public WebElement getKurthas() {
		return kurthas;
	}
	
	public MenLink(WebDriver driver) {
		super(driver);
	}
	
	public void topwear()
	{
		getTopWear().click();
	}
	
	public void bottomWear()
	{
		getBottomWear().click();
	}
	
	public void festiveWear()
	{
		getFestiveWear().click();
	}
	
	public void tshirts()
	{
		getTshirts().click();
	}
	
	public void jeans()
	{
		getJeans().click();
	}
	
	public void kurthas()
	{
		getKurthas().click();
	}
	
}
