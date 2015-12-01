/*
Cosmic Intruders
Authors: James, Nick, Jon

The panel displaying the processes of the game
*/

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
public class GamePanel extends JPanel
{
	public GamePanel()
	{
		setBackground(Color.black);
	}
	@Override
    protected void paintComponent(Graphics g) 
    {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
    }
}
