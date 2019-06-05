//Importing Color 
import java.awt.Color;

/* Name:                      Srinivas C Lingutla
 * NetId:                     slingu2
 * Date and Time of Lab:      Monday, 12:00 - 12:50 PM
 * Description:               Creating turtles onto a picture to draw multifaceted objects
 */ 

public class slingu2project1 
{
 public static void main (String[] args)
 {
  System.out.println ( "Begin Java Execution" );
  System.out.println ( "" );
  
  //Allowing the user to select a picture
  String filename ;
  filename = FileChooser.pickAFile () ;
  
  //Creating a picture for the turtle to draw
  Picture p;
  p = new Picture ( filename );
  
  //Creating the turtle 1 (house) and setting its penwidth
  Turtle t1 ;
  t1 = new Turtle ( 1000,750, p);
  t1.setPenWidth (3);
  
  //Drawing the base of the house
  drawSquare (300,t1,5,Color.BLUE);
  
  t1.penUp ();
  t1.forward (300);
  t1.penDown ();
  
  //Drawing the roof of the house
  drawTriangle (300,t1,5);
  
  //Repositioning the turtle for the first window
  t1.turn ( 45);
  t1.penUp ();
  t1.forward (100);
  t1.turnRight ();
  t1.forward (30);
  t1.penDown ();
  
  
  //Drawing the first window
  drawWindow (t1);
  
  //Repositioning the turtle for the second window
  t1.turnRight ();
  t1.penUp ();
  t1.forward (180);
  t1.penDown ();
  
  //Drawing the second window
  drawWindow (t1);
  
  //Repositioning the turtle for the door 
  t1.penUp ();
  t1.forward (80);
  t1.turnLeft ();
  t1.forward (20);
  t1.penDown ();
  
  //Drawing the door
  drawRectangle (80,120,t1);
 

   //Creating a turtle 2  (Man) and setting its pen width
   Turtle t2;
   t2 = new Turtle (300,500,p);
   t2.setPenWidth (5);
   

//Drawing the head of the man
   
   drawOctogon (30,t2);
   
   
 //Repositioning the turtle
    t2.turn(135);
    t2.forward (30);
    t2.turn(-45);
    t2.forward(15);
    t2.turnRight();
    
   //Drawing the Right Leg
    t2.forward (120);
    t2.turn(35);
    t2.forward (50);
    t2.turn(60);
    t2.forward(55);
    t2.turnLeft();
    t2.forward(10);
    
    //Repositioning the turtle
    //t1.hide();
    t2.turn(180);
    t2.forward(10);
    t2.turnRight();
    t2.forward(55);
    t2.turn(-60);
    t2.forward(50);
    t2.turnRight();
    
    //Drawing left leg
    t2.forward (50);
    t2.turn(35);
    t2.forward(55);
    t2.turnLeft();
    t2.forward(10);
    
    //Drawing the right hand
    t2.backward(10);
    t2.turnLeft();
    t2.forward(55);
    t2.turn(-35);
    t2.forward(50);
    t2.turn(55);
    t2.forward(80);
    t2.turn(130);
    t2.forward(45);
    t2.turnLeft();
    t2.forward(45);
    
    //Drawing the left hand
    t2.backward(45);
    t2.turnLeft();
    t2.forward(45);
    t2.turn(-20);
    t2.forward(45);
    t2.turn(-75);
    t2.forward(45);
  
    //Creating turtle 3 (dog)   
    Turtle t3;
    t3 = new Turtle (600,700,p);
    t3.setPenWidth (5);
    t3.setPenColor (Color.RED);
    
    
    
    //drawing the head of the dog
   
    drawHexagon (20,60,t3);
    
    //Drawing the body of the dog
    t3.penUp ();
    t3.forward (15);
    t3.turnLeft ();
    t3.penDown();
    t3.forward (70);
    t3.turnLeft ();
    t3.forward (35);
    t3.turnLeft ();
    t3.forward (70);
    t3.turnLeft ();
    t3.forward (35);
    
    //drawing the legs and tail of the dog
    t3.turn (180);
    t3.forward (80);
    t3.penUp ();
    t3.turnRight ();
    t3.forward (15);
    t3.turnRight ();
    t3.penDown ();
    t3.forward (45);
    t3.turnLeft ();
    t3.forward (40);
    t3.turnLeft ();
    t3.forward (45);
    t3.penUp ();
    t3.turnRight ();
    t3.forward (15);
    t3.turnRight ();
    t3.penDown ();
    t3.forward (80);
    t3.turnLeft ();
    t3.forward (50);
    
    
    //displaying the picture
    
  p.show();
  
  System.out.println ("");
  System.out.println ("End Java Execution");
  
 }
  
 public static void drawSquare (int length, Turtle t, int thickness, Color pencolor)
 {
   int i=0;
   t.setPenWidth ( thickness );
   t.setPenColor ( pencolor );
   
   while (i<4)
   {
   t.forward ( length );
   t.turnRight ();
   i++;
   }
   
 }
 
 public static void drawRectangle (int width, int length,Turtle t)
 {
  
   
  t.forward (width);
  t.turnRight ();
  t.forward (length);
  t.turnRight ();
  t.forward (width);
  t.turnRight ();
  t.forward (length);
  
   
   
   
 }
 
 public static void drawTriangle (int length, Turtle t, int thickness)
 {
   t.setPenWidth ( thickness );
   
  
   t.turn (45);
   t.forward (213);
   t.turn (90);
   t.forward (213);
   
   }
 public static void drawWindow (Turtle t1)
 {
   drawSquare (30,t1,3, Color.CYAN);
  t1.forward (60);
  t1.turnRight ();
  t1.forward (60);
  t1.turnRight ();
  drawSquare (30,t1,3, Color.CYAN);
  t1.forward (60);
  t1.turnRight ();
  t1.forward (60);
   
 }
 
 public static void drawHexagon (int length, int degrees_turn,Turtle t)
 {
   
  int i=0;
    while (i<6)
    {
      t.forward (length);
     t.turn (degrees_turn);
     i++;
    } 
   
   
 }
 
 public static void drawOctogon (int length, Turtle t)
   {
   
  int i=0;
    while (i<8)
    {
      t.forward (length);
     t.turn (45);
     i++;
    } 
   
   
 }
 
 }
   

















