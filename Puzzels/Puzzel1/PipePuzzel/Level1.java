
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private int i = 0;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
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
        
        addObject(new SolidWall(),1,i);
        addObject(new SolidWall(),3, i+2);
        addObject(new SolidWall(),5, i);
        addObject(new SolidWall(),7, i+2);
        addObject(new SolidWall(),9, i);
        addObject(new SolidWall(),11, i+2);
       i++;
      }
      
    }
    
    public void addPlayer()
    {
        addObject(new Player(), 0,0);
    }
}
