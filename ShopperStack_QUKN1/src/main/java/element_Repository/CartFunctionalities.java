package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartFunctionalities extends BasePage{
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//div[@class='cart_quantity__Eg+qv']/svg[@id='decrease']")
	private WebElement decreaseQuantity;
	
	@FindBy(xpath="//div[@class='cart_quantity__Eg+qv']//svg[@id='increase']")
	private WebElement increaseQuantity ;
	
	@FindBy(xpath="//button[text()='Remove from cart']")
	private WebElement RemoveFromCart;
	
	@FindBy(xpath="//span[text()='Buy Now']")
	private WebElement BuyNow;
	
	@FindBy(xpath="//span[text()='Continue Shopping']")
	private WebElement ContinueShopping;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement RemoveProduct;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelRemoving;
		
	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getDecreaseQuantity() {
		return decreaseQuantity;
	}



	public WebElement getIncreaseQuantity() {
		return increaseQuantity;
	}



	public WebElement getRemoveFromCart() {
		return RemoveFromCart;
	}

	public WebElement getBuyNow() {
		return BuyNow;
	}

	public WebElement getContinueShopping() {
		return ContinueShopping;
	}

	public WebElement getRemoveProduct() {
		return RemoveProduct;
	}

	public WebElement getCancelRemoving() {
		return cancelRemoving;
	}

	public CartFunctionalities(WebDriver driver) {
		super(driver);
	}
	
	public void buyNow()
	{
		getCartIcon().click();
		getBuyNow().click();
	}
	public void RemoveProduct()
	{
		getRemoveFromCart().click();
		getRemoveProduct().click();
	}
	
	public void CancelRemoving()
	{
		getRemoveFromCart().click();
		getCancelRemoving().click();
	}

}
