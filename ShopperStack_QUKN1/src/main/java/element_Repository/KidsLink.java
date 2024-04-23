package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsLink extends BasePage{
	
	@FindBy(xpath="//a[@id='kids']")
	private WebElement kids;
	
	@FindBy(xpath="//a[text()='Boys Clothing']")
	private WebElement boysClothing;
	
	@FindBy(xpath="//a[text()='Girls Clothing']")
	private WebElement girlsClothing;
	
	@FindBy(xpath="//a[@href='/sub-category/boys-tshirt']")
	private WebElement boysTshirts;
	
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/452/542/l3vxbbk0/kids-t-shirt/c/i/a/-original-imagewpmbghzh5dx.jpeg?q=50']")
	private WebElement greenTshirt;
	
	@FindBy(xpath="//a[@href='/sub-category/girls-top']")
	private WebElement girlTops;
	
	@FindBy(xpath="//a[@href='/sub-category/girls-tshirt']")
	private WebElement girlTshirts;
	
	@FindBy(xpath="//a[@href='/sub-category/girls-jeans']")
	private WebElement girlJeans;
	
	@FindBy(xpath="//button[@id='Add To Cart']")
	private WebElement addToCart;
	
	
	public WebElement getAddToCart() {
		return addToCart;
	}



	public WebElement getGreenTshirt() {
		return greenTshirt;
	}



	public WebElement getKids() {
		return kids;
	}



	public WebElement getBoysClothing() {
		return boysClothing;
	}



	public WebElement getGirlsClothing() {
		return girlsClothing;
	}



	public WebElement getBoysTshirts() {
		return boysTshirts;
	}



	public WebElement getGirlTops() {
		return girlTops;
	}



	public WebElement getGirlTshirts() {
		return girlTshirts;
	}



	public WebElement getGirlJeans() {
		return girlJeans;
	}



	public KidsLink(WebDriver driver) {
		super(driver);
	}

	public void boysClothing()
	{
		getBoysClothing().click();
	}
	
	public void girlsClothing()
	{
		getGirlsClothing().click();
	}
	
	public void boysTshirts()
	{
		getBoysTshirts().click();
	}
	
	public void girlTops()
	{
		getGirlTops().click();
	}
	
	public void girlJeans()
	{
		getGirlJeans().click();
	}
	
	public void girlTshirt()
	{
		getGirlTshirts().click();
	}
}
