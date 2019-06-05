/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 - 12:50 PM
 * Description: Creating a star and then rotating it 10 times by 36 degrees making it look like a spiralgraph style design
 */ 
  
  
  //importing Color
  import java.awt.Color;

public class slingu2lab3
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
   
   //Creating a turtle
   Turtle t1;
   t1 = new Turtle ( p );
   t1.setPenWidth(3);
   
t1.turnRight ( );


   //Creating a loop for the star to turn
   int n=0;
   while (n<10)
   {
          t1.turn (36); 
          n++;
          int i=0;
    //Creating a loop to create a 5-sided star      
   while (i<5)
   {
    
    t1.forward (200);
    t1.turn (144);
    
    i++;
   }

   }
   
   //displaying the star
   p.show ();
  
  
  System.out.println ("");
  System.out.println ("End Java Execution");
  }
  
  
  
  
}