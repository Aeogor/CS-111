/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Duplication of pictures
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab9
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
   
   // declare an integer variable to store a number given by the user.
 int value;
 
 // ask the user for a number within a range of values 1-10
 value = SimpleInput.getIntNumber ("Please enter an integer value between 1 and 10.", 1,10);
 
 // display the value entered by the user
 System.out.println ("The user entered: " + value);
 
 
 
 Picture p2;
 p2 = duplicate (p,value);
 
 
 // display the picture p2 in the explore mode
    p2.explore();
    
     //save the picture onto the file system
    String filename2;
    filename2 = FileChooser.pickAFile();
    p.write ( filename2 );

    System.out.println("");
    System.out.println("End Java Exection");
  }   // end of main method
 
 
 
 
 
 public static Picture duplicate ( Picture p, int value )
{
  Picture result;
  Pixel pix;
  int x;
  int y;
    
  //obtaining the width of the picture
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  //Obtaining the height of the picture
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  // create the "blank canvas" for the result
  result = new Picture ( width , (height*value) );
  
  for (int z=0; z<value; z++)
  {
    
    for ( x = 0 ; x < width ; x = x + 1 )
    {
      for ( y = 0 ; y < height ; y = y + 1 )
      {
        // access the pixel at a specified corredinate location
        pix = p.getPixel (x, y );
        Color pixColor = pix.getColor();
          
      // determine the location in the result of the mirrored pixel
      int modX;
      int modY;
      modX = x;
      modY = y;
      
      // store the color into a pixel in the result
      Pixel pix2;
     
      
      
       // determine location of nth pixel position and storing it
      modX = x;
      modY = (height * z) + y;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
   
  
}
  return result;
 }
 
}

//end of program
 
 
 
 
 
 
 