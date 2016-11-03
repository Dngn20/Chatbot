package chat.controller;

import chat.view.ChatViewer;
import chat.model.Chatbot;

public class ChatbotController
{
	private Chatbot stupidBot; 
	private ChatViewer chatView;
	
	public ChatbotController() 
	{
		stupidBot= new Chatbot("Bob");
		chatView = new ChatViewer();
	}
	
	public void start()
	{
		String response = "Hello";
		
		while(stupidBot.lengthChecker(response))
		{
			chatView.displayMessage(useChatbotCheckers(response));
			response = chatView.collectResponse("What do you want to chat about today?");
		}		
	}	
	private String useChatbotCheckers(String input)
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
		
		if(answer.length() == 0)
		{
			answer +="Sorry, I don't know about " + input;
		}
			
		return answer;
	}	

}	
	

