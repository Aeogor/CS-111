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
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");
   
   //Allowing the user to choose a pciture
   String filename;
   filename = FileChooser.pickAFile ();
   Picture p;
   p = new Picture ( filename );
   
   blacktogreen (p);
   
   p.explore ();
   
    //Saving the filename as filename2
   String filename2;
   filename2 = FileChooser.pickAFile ();
   p.write (filename2);
   
   
  }
  
  public static void blacktogreen ( Picture p)
  {
  
  Pixel pix;
  int x,y,width;

  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
    
  x = 0;
  while ( x < width )
  {
    y = 0;
    while ( y < height)
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      
      //initialising the individual amount of colors in each pixel
      int redAmount;
      int greenAmount;
      int blueAmount;
    
        
      // getting the amount of red, green and blue at that pixel
      redAmount = pix.getRed();
      greenAmount = pix.getGreen();
      blueAmount = pix.getBlue();
      
        // manipulate the green amounts
      greenAmount = (int)(redAmount * 0.299 + greenAmount *.587 + blueAmount *0.114) ;
      
      // manipulate the red and blue amounts
      redAmount=0;
      blueAmount=0;
        
        
      // store these new red, green and blue amounts back into the pixel
;      pix.setRed(redAmount);
      pix.setGreen(greenAmount);
      pix.setBlue(blueAmount);
        
      y = y + 1;
      
    }
    x = x + 1;
  
  }
  }
}
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  