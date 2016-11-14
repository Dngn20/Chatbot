package chat.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import chat.controller.ChatbotController;

public class ChatFrame extends JFrame
{
	private ChatbotController baseController;
	private ChatPanel appPanel;

	public ChatFrame(ChatbotController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new ChatPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("ChatBot");
		this.setSize(new Dimension (600, 400));
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
