package chat.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import chat.controller.ChatbotController;

public class ChatFrame
{
	private ChatbotController baseController;
	private ChatPanel appPanel;

	public ChatFrame(ChatbotController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new ChatPanel(baseController);
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this
	}
}
