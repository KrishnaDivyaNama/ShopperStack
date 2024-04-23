package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatBot extends BasePage
{

	public ChatBot(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='chatbot-items']")
	private WebElement chatbot;
	
	@FindBy(xpath="//input[@id='chat_input']")
	private WebElement ChatInput;
	
	@FindBy(xpath="//span[@class='chat_send_arrow']//*[name()='svg']")
	private WebElement enter;
	
	public WebElement getChatbot() {
		return chatbot;
	}

	public WebElement getChatInput() {
		return ChatInput;
	}

	public WebElement getEnter() {
		return enter;
	}
	
	
	

}
