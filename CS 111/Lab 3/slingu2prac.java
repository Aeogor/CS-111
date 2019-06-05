/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: 
 */ 
  
  
  //importing Color
  import java.awt.Color;
  import java.io.File;


public class slingu2prac
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");
   
   //Allowing the user to choose a pciture
   String filename;
   filename = FileChooser.pickAFile ();
   Picture p;
   p = new Picture ( filename );
   
   p.explore();
  }}