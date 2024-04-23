package testscripts;

import org.testng.annotations.Test;

import element_Repository.ChatBot;
import generic_Library.BaseTest;

public class ChatBotTest extends BaseTest{
	
	@Test
	public void verify_chatBot() throws InterruptedException 
	{
		ChatBot chatbot = new ChatBot(driver);
		chatbot.getChatbot().click();
		chatbot.getChatInput().click();
		Thread.sleep(2000);
		chatbot.getChatInput().sendKeys("Delivery issues");
		Thread.sleep(2000);
		chatbot.getEnter().click();
		Thread.sleep(2000);
	}

}
