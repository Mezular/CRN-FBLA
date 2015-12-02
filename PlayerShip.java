/*
Cosmic Intruders
Authors: James, Nick, Jon

The class representing the player ship
*/

public class PlayerShip
{
    private int hp;
    private int x; //the player's x coordinate
    private int y; //the player's y coordinate
    private final int l = 96; //the player sprite's length
    private final int h = 108; //the player sprite's height
    public PlayerShip(int windowLength, int windowHeight)
    {
        x = (windowLength - l)/2;
	y = (windowHeight - l)/2;
	hp = 5;
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
    public void hit() //when the player gets hit
    {
	hp--;
    }
    public int getL()
    {
        return l;
    }
    public int getH()
    {
        return h;
    }
    
}

