package element_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyLikes {
	
	@FindBy(xpath="//select[@id='Category']")
	private WebElement Category;
	
	@FindBy(xpath="//select[@id='Category Type']")
	private WebElement CategoryType;
	
	@FindBy(xpath="//button[@id='Submit']")
	private WebElement submit;

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getCategoryType() {
		return CategoryType;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
