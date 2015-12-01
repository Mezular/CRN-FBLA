/*
Cosmic Intruders
Authors: James, Nick, Jon

The main class controlling the overall application.
*/
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class Application
{
	public static void main(String[] args)
	{
		JFrame gameWindow = new JFrame(); //create the game window
		GamePanel panel = new GamePanel(); //create the game panel
		gameWindow.setSize(1024, 576);
		gameWindow.add(panel, BorderLayout.CENTER);
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setLocationRelativeTo(null); //set the window to appear centered in the screen
		gameWindow.setTitle("Cosmic Intruders");
		gameWindow.setVisible(true);
	}
}
