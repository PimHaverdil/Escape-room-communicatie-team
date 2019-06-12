import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConnectionPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConnectionPoint extends Actor
{
    public ConnectionPoint()
    {
        setImage("images/ConnectionPoint.png");
    }
    
    /**
     * Act - do whatever the ConnectionPoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Connected();
    }  
    
    public boolean Connected()
    {
        if (Cable.getCount() >= 11)
        {
            if (isTouching(StraightCable.class) || isTouching(BentCable.class))
            {
               setImage("images/ConnectionPointAttached.png");
               return true;
            } else
            {
               return false;
            }
        } else
        {
          return false;   
        }
    }
}
