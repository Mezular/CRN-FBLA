/*
Cosmic Intruders
Authors: James, Nick, Jon

The panel displaying the processes of the game
*/

import javax.swing.JPanel;
public class GamePanel extends JPanel
{
	public GamePanel()
	{
	}
	@Override
    protected void paintComponent(Graphics g) 
    {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
    }
}
