/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Manipulating a picture using text and saving it
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab5
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
   
   //Getting the height of the image and saving it in i
   int i= p.getHeight ();
   
   //Adding message to the picture
   p.addMessage ("Modified by Srinivas Lingutla -  CS 111 - Lab 5   :)    ", 20,i-20);
   
   //Displaying the picture
   p.show ();
   
   //Saving the filename as filename2
   String filename2;
   filename2 = FileChooser.pickAFile ();
   p.write (filename2);
   
  }
  
  public int getHeight (Picture p)
  {
    return p.getHeight();
  }

  
}
   
   