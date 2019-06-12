
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8, 8, 60);
        setBackground("images/cell.png");
        addCP();
        addCables();
    }
    
    public void addCables()
    {
       addObject(new BentCable(), 0, 1);
       addObject(new StraightCable(), 1, 1);
       addObject(new StraightCable(), 2, 1);
       addObject(new BentCable(), 3, 1);
       addObject(new StraightCable(), 3, 2);
       addObject(new StraightCable(), 3, 3);
       addObject(new BentCable(), 3, 4);
       addObject(new StraightCable(), 4, 4);
       addObject(new StraightCable(), 5, 4);
       addObject(new StraightCable(), 6, 4);
       addObject(new BentCable(), 7, 4);
       addObject(new StraightCable(), 7, 5);
       addObject(new StraightCable(), 7, 6);
    }
    
    public void addCP()
    {
       addObject(new ConnectionPoint(), 0, 0); 
       addObject(new ConnectionPoint(), 7, 0);
       addObject(new ConnectionPoint(), 0, 7);
       addObject(new ConnectionPoint(), 7, 7);
    }
}
