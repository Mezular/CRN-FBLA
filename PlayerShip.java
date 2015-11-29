/*
Cosmic Intruders
Authors: James, Nick, Jon

The class representing the player ship
*/

public class PlayerShip
{
    private int mid;
    private int x; //the player's x coordinate
    private int y; //the player's y coordinate
    private int l; //the player sprite's length
    private int h; //the player sprite's height
    public PlayerShip(int windowLength)
    {
        mid = (windowLength - l)/2;
        x = mid;
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
}
