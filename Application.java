/*
Cosmic Intruders
Authors: James, Nick, Jon

The main class controlling the overall application.
*/
import javax.swing.JFrame;
public class Application
{
	static void main()
	{
		JFrame gameWindow = new JFrame(); //create the game window
		gameWindow.setLocationRelativeTo(null); //set the window to appear centered in the screen
		gameWindow.setVisible(true);
	}
}
