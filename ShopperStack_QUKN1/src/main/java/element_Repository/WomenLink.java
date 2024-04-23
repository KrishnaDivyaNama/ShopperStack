package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenLink extends BasePage{
	public WomenLink(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@id='women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Indian & Fusion Wear']")
	private WebElement indianFusionwear;
	
	@FindBy(xpath="//a[text()='Western Wear']")
	private WebElement westernWear;
	
	@FindBy(xpath="//a[text()='Kurtas & Suits']")
	private WebElement kurthas;
	
	@FindBy(xpath="//a[text()='Tshirts']")
	private WebElement Tshirt;
	
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/832/832/k3uhhu80/shirt/g/z/b/xl-81tk2271-selvia-original-imafmvw4yn7mbhvh.jpeg?q=70']")
	private WebElement product_image;
	
	@FindBy(xpath="//button[@id='Add To Cart']")
	private WebElement add_to_cart;
	
	public WebElement getProduct_image() {
		return product_image;
	}


	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}


	public WebElement getWomen() {
		return women;
	}


	public WebElement getIndianFusionwear() {
		return indianFusionwear;
	}


	public WebElement getWesternWear() {
		return westernWear;
	}


	public WebElement getKurthas() {
		return kurthas;
	}


	

	public WebElement getTshirt() {
		return Tshirt;
	}


	public void performAddToCart() throws InterruptedException
	{
		Thread.sleep(2000);
		getWomen().click();
		Thread.sleep(2000);
		getTshirt().click();
		Thread.sleep(2000);
		getProduct_image().click();
		Thread.sleep(2000);
		getAdd_to_cart().click();
		Thread.sleep(2000);
		
		
	}
	

}
