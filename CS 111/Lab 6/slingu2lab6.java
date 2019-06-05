/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Manipulating a picture using text and saving it
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab6a
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