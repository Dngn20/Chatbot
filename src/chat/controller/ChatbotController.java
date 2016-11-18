package chat.controller;

import chat.view.ChatViewer;
import chat.model.Chatbot;
import chat.view.ChatFrame;

public class ChatbotController
{
	private Chatbot stupidBot; 
	private ChatViewer chatView;
	private ChatFrame baseFrame;
	
	public ChatbotController() 
	{
		stupidBot= new Chatbot("Bob");
		chatView = new ChatViewer();
		baseFrame = new ChatFrame(this);
	}
	
	public void start()
	{
//		String response = "Hello";
//		
//		while(stupidBot.lengthChecker(response))
//		{
//			chatView.displayMessage(useChatbotCheckers(response));
//			response = chatView.collectResponse("What do you want to chat about today?");
//		}		
	}	

	public String useChatbotCheckers(String input)
	{
		String answer ="";
				
		if(stupidBot.contentChecker(input))
		{
			answer += "\nYou know my specail secret\n";
		}
		if(stupidBot.memeChecker(input))
		{
			answer += "\nI can has memes?\n";
		}
		
		if(!stupidBot.lengthChecker(answer))
		{
			answer +="Sorry, I don't know about " + input;
		}
		int canBeRandom = (int) (Math.random() * 7);
		if(canBeRandom % 2 == 0)
		{
			answer += randomTopicGenerator();
		}
		return answer;
	}	
	
	private String randomTopicGenerator()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 7);
		
		switch(random)
		{
			case 0:
				randomTopic = "Did you know you have a face?";
				break;
			case 1:
				randomTopic = "I like to talk to you";
				break;
		}
			return randomTopic; 
	}
}	

