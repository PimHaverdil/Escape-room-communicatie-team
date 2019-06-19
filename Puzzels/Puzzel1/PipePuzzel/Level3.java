
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private int i, x, f, a, l, o;
    /**
     * Constructor for objects of class Level3.
     * 
     */
       public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(20, 14, 60);
        setBackground("images/cell.png");
        addWalls();
        addPlayer();
        Greenfoot.setSpeed(30);
        Counter counter = new Counter();
        addObject(counter, 1, 0);
        counter.setCount(Counter.score);
    }
    
    public void addWalls()
    { 
      while(i < 5)
      {
       addObject(new SolidWall(), 0 + i, 0);
       i++;
      }
      while(a < 12)
      {
       addObject(new SolidWall(), 0 , 2 + a);
       a++;
      }
      while(l < 12)
      {
       addObject(new SolidWall(), 2 , 1 + l);
       l++;
      }
      while(o < 16)
      {
        addObject(new SolidWall(), 2 + o, 12);
        o++;
      }
      while(x < 13)
      {
       addObject(new SolidWall(), 6 + x, 0);
       x++;
      }
      while(f < 14)
      {
       addObject(new SolidWall(), 20, 0 + f);
       f++;
      }
      addObject(new SolidWall(), 6, 1);
      addObject(new SolidWall(), 6, 2);
      addObject(new SolidWall(), 6, 3);
      addObject(new SolidWall(), 6, 4);
      addObject(new SolidWall(), 6, 5);
      addObject(new SolidWall(), 6, 6); 
      addObject(new SolidWall(), 5, 2);
      addObject(new SolidWall(), 4, 2);
      addObject(new SolidWall(), 3, 4);
      addObject(new SolidWall(), 4, 4);
      addObject(new SolidWall(), 6, 1);
      addObject(new SolidWall(), 3, 10);
      addObject(new SolidWall(), 4, 10);
      addObject(new SolidWall(), 5, 6);
      addObject(new SolidWall(), 4, 6);
      addObject(new SolidWall(), 4, 8);
      addObject(new SolidWall(), 5, 8);
      addObject(new SolidWall(), 6, 8);
      addObject(new SolidWall(), 6, 10);
      addObject(new SolidWall(), 6, 11);
      addObject(new SolidWall(), 7, 8);
      addObject(new SolidWall(), 8, 8);
      addObject(new SolidWall(), 8, 7);
      addObject(new SolidWall(), 9, 7);
      addObject(new SolidWall(), 10, 7);
      addObject(new SolidWall(), 11, 7);
      addObject(new SolidWall(), 12, 7);
      addObject(new SolidWall(), 10, 6);
      addObject(new SolidWall(), 10, 5);
      addObject(new SolidWall(), 12, 6);
      addObject(new SolidWall(), 12, 5);
      addObject(new SolidWall(), 12, 4);
      addObject(new SolidWall(), 12, 3);
      addObject(new SolidWall(), 11, 3);
      addObject(new SolidWall(), 10, 3);
      addObject(new SolidWall(), 9, 3);
      addObject(new SolidWall(), 8, 3);
      addObject(new SolidWall(), 8, 4);
      addObject(new SolidWall(), 8, 5);
      addObject(new SolidWall(), 8, 10);
      addObject(new SolidWall(), 9, 10);
      addObject(new SolidWall(), 10, 9);
      addObject(new SolidWall(), 10, 10);
      addObject(new SolidWall(), 13, 11);
      addObject(new SolidWall(), 12, 11);
      
      addObject(new SolidWall(), 12, 8);
      addObject(new SolidWall(), 12, 9);
      addObject(new SolidWall(), 13, 9);
      addObject(new SolidWall(), 14, 9);
      addObject(new SolidWall(), 15, 9);
      addObject(new SolidWall(), 16, 9);
      addObject(new SolidWall(), 17, 9);
      addObject(new SolidWall(), 18, 9);
      
      addObject(new SolidWall(), 17, 10);
      addObject(new SolidWall(), 18, 10);
      addObject(new SolidWall(), 18, 8);
      
      //Boss part
      addObject(new SolidWall(), 14, 1);
      addObject(new SolidWall(), 14, 2);
      addObject(new SolidWall(), 14, 3);
      addObject(new SolidWall(), 14, 4);
      addObject(new SolidWall(), 14, 5);
      addObject(new SolidWall(), 14, 6);
      addObject(new SolidWall(), 14, 7);
      
      addObject(new SolidWall(), 16, 2);
      addObject(new SolidWall(), 16, 3);
      addObject(new SolidWall(), 16, 4);
      addObject(new SolidWall(), 16, 5);
      addObject(new SolidWall(), 16, 6);
      addObject(new SolidWall(), 16, 7);
    }
    
    public void addPlayer()
    {
        addObject(new Player(), 0,1);
        addObject(new Boss(), 17, 4);
        addObject(new Door(), 5, 0);
        addObject(new Key(),18,1);
        addObject(new EnemyBoss(), 3, 7);
        addObject(new EnemyBoss(), 7, 11);
        addObject(new EnemyBoss(), 7, 2);
        addObject(new Door(), 5, 0);
    }
}
