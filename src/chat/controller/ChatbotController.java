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
		String response = "Talking to you";
		
		while(stupidBot.lengthChecker(response))
		{
			response = chatView.collectResponse("What do you want to chat about today?");
		}		
	}	
}
