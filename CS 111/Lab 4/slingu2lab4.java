/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Creating a hexagon withing an hexagon which is within an hexagon within an hexagon.....
 */ 
  
  
  //importing Color
  import java.awt.Color;

public class slingu2lab4
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("");
   
   //Allowing the user to choose a pciture
   String filename;
   filename = FileChooser.pickAFile ();
   Picture p;
   p = new Picture ( filename );
   
   //Creating a turtle t1
   Turtle t1;
   t1 = new Turtle ( p );
   t1.setPenWidth(3);
   
   //Calling upon the method of drawHexagon and passing the following parameters
   drawHexagon (t1,20,20,20);
   
   //Displaying the picture
   p.show ();
   
   System.out.println ("");
  System.out.println ("End Java Execution");
  
  }
  
  //Creating a method to draw hexagon
  public static void drawHexagon (Turtle t, int width, int initial_length, int number_of_times)
  {
      int i=0;
      
      //Creating a while loop for the number of times the hexagon should be repeated
    while (number_of_times>0)
    {
          
         //Creating a while loop for drawing the hexagon
         while (i<6)
         {
            t.forward (initial_length);
            t.turn (60);
            i++;
         } 
         
       //Repositioning the turtle for the next hexagon  
       t.penUp ();
       t.turn (240);
       t.forward (width);
       t.turn (120);
       t.penDown ();
       
       //Implementing the variables according to the requirement
       initial_length = initial_length + 15;
       number_of_times--;
       i=0;  
    }
    
  }
   
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  