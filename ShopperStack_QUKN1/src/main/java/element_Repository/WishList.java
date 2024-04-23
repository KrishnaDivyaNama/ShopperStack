package element_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishList {
	
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	private WebElement AddToCart;
	
	@FindBy(xpath="//button[text()='remove from wishlist?']")
	private WebElement RemoveFromWishlist;

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getRemoveFromWishlist() {
		return RemoveFromWishlist;
	}
	
	
}
