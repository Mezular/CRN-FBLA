/*
Cosmic Intruders
Authors: James, Nick, Jon

The class representing the player ship
*/
import java.awt.Image;
import javax.swing.ImageIcon;
public class PlayerShip
{
    private int mid;
    private int hp;
    private int x; //the player's x coordinate
    private int y; //the player's y coordinate
	private Image sprite;
    private final int l = 96; //the player sprite's length
    private final int h = 108; //the player sprite's height
    public PlayerShip(int windowLength, int windowHeight)
    {
		sprite = new ImageIcon("GameApp".getClass().getResource("/player.png")).getImage();
        mid = (windowLength - l)/2;
		y = windowHeight - 150;
        x = mid;
		hp = 10;
    }
    public void setX(int value)
    {
        x = value;
    }
    public void setY(int value)
    {
        y = value;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Image getSprite()
    {
        return sprite;
    }
	public void hit() //when the player gets hit
    {
		hp--;
    }
}
