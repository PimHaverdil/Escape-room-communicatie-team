
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private int i = 0;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 12, 60);
        setBackground("images/cell.png");
        addWalls();
        addPlayer();
        Greenfoot.setSpeed(30);
    }
    
    public void addWalls()
    { 
      while(i < 10)
      {
        
       i++;
      }
      
    }
    
    public void addPlayer()
    {
        addObject(new Player(), 0,0);
    }
}
