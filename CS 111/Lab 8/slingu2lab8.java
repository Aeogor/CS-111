/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Rotation of pictures by 90,180,270
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab8
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
 
 // ask the user for a number within a range of values
 value = SimpleInput.getIntNumber ("Please enter an integer value between 1 and 3.", 1,3);
 
 // display the value entered by the user
 System.out.println ("The user entered: " + value);
 
 //If statements to select the correct method as per the user
 if (value == 1)
 {
 
   //initialising a picture
   Picture p2;
   p2 = rotate90(p);
 
   p2.explore();
   
      //Saving the rotated picture
   String filename2;
   filename2 = FileChooser.pickAFile ();
   p2.write (filename2);
 
 }
 else if (value == 2)
 {
    Picture p2;
    p2 = rotate180(p);
 
    p2.explore();
    
       //Saving the rotated picture
   String filename2;
   filename2 = FileChooser.pickAFile ();
   p2.write (filename2);
    
 }
 else if (value == 3)
 {
    Picture p2;
    p2 = rotate270(p);
 
    p2.explore();
    
       //Saving the rotated picture
   String filename2;
   filename2 = FileChooser.pickAFile ();
   p2.write (filename2);
    
 }
 
 
 
  }

public static Picture rotate90(Picture p)
{
  Picture result;
  Pixel pix;
  int x;
  int y;
    
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  // create the "blank canvas" for the result
  result = new Picture ( height, width );
    
  for ( x = 0 ; x < width ; x++ )
  {
    for ( y = 0 ; y < height ; y++ )
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the rotated pixel
      int modX;
      int modY;
      modX = height - 1 - y;
      modY = x;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
  return result;
}







public static Picture rotate180(Picture p)
{
  Picture result;
  Pixel pix;
  int x;
  int y;
    
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  // create the "blank canvas" for the result
  result = new Picture ( width, height );
    
  for ( x = 0 ; x < width ; x++ )
  {
    for ( y = 0 ; y < height ; y++ )
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the rotated pixel
      int modX;
      int modY;
      modX = width - 1 - x;
      modY = height -1-y;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
  return result;
}





public static Picture rotate270(Picture p)
{
  Picture result;
  Pixel pix;
  int x;
  int y;
    
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  // create the "blank canvas" for the result
  result = new Picture ( height, width );
    
  for ( x = 0 ; x < width ; x++ )
  {
    for ( y = 0 ; y < height ; y++ )
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the rotated pixel
      int modX;
      int modY;
      modX = y;
      modY = width -1-x;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
  return result;
}
    
   
}
 
 
 
 
 
 
 
 