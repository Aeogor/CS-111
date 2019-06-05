import java.awt.Color;

//Name:    Srinivas C lingutla
//Net-id:  slingu2
//Day:     Monday
//Time:    12:00-12:50 pm

public class lab2slingu2
{
  public static void main (String[] args)
  {
    System.out.println("Begin Java Execution");
    System.out.println("");
    
    //Creating the world
    World w;
    w = new World ();
    
    //Creating the turtle
    Turtle t;
    t = new Turtle (w);
    t.setPenWidth (5);
    
    //creating letter S for Srinivas in red
    t.penUp ();
    t.setPenColor (Color.red);
   
    t.forward (100);
    t.penDown ();
    t.turnLeft ();
    t.forward (50);
    t.turnLeft ();
    t.forward (50);
    t.turnLeft ();
    t.forward (50);
    t.turnRight ();
    t.forward (50);
    t.turnRight ();
    t.forward (50);
    
    //creating letter C in green
    t.penUp ();
    t.setPenColor (Color.green);
    t.turn (180);
    t.forward (150);
    t.penDown ();
    t.turn (180);
    t.forward (50);
    t.turnRight ();
    t.forward (100);
    t.turnRight ();
    t.forward (50);
    t.penUp ();
    
    //creating letter L for Lingutla in blue
    t.setPenColor (Color.blue);
    t.forward (50);
    t.penDown ();
    t.turnRight ();
    t.forward (100);
    t.turnLeft ();
    t.forward (50);
    
    //making the turtle invisible
    t.setVisible (false);
    
    System.out.println ("");
    System.out.println ("End Java Execution");
    
    //display the world
    w.show() ;
    
  }
}