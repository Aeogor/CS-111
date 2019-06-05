/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Posterization
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab7
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
   
   //calling on a method with a parameter
   posterization (p);
   
   //Displaying the posterissed picture in an explore mode
   p.explore ();
  
  }
  
  //Method to posterize a picture
  public static void posterization ( Picture p)
  {
  
  //initialising the parameters to locate the pixel in the pictures  
  Pixel pix;
  int x,y,width;

  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
    
 for(x=0;x<width;x++)
 {
    for(y=0;y<height;y++)
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      
      //initialising the individual amount of colors in each pixel
      int red;
      int green;
      int blue;
      int grayAmount;
    
        
      // getting the amount of red, green and blue at that pixel
      red = pix.getRed();
      green = pix.getGreen();
      blue = pix.getBlue();
      
        // manipulate the gray amounts
      grayAmount = (int)(red * 0.299 + green *.587 + blue *0.114) ;
      
      if (grayAmount<43)
      {
        //set the current pixel to Violet Pink
        red =199;
        green=21;
        blue=133;
      }
      else if (grayAmount<85)
      {
        //set the current pixel to deep pink
        red =255;
        green=20;
        blue=147;
      }
      else if (grayAmount<128)
      {
        //set the current pixel to violet
        red =238;
        green=130;
        blue=238;
      }
      else if (grayAmount<171)
      {
        //set the current pixel to hot pink
        red =255;
        green=105;
        blue=180;
      }
      else if (grayAmount<213)
      {
        //set the current pixel to light pink
        red =255;
        green=182;
        blue=193;
      }
      else 
      {
        //set the current pixel to pink
        red =255;
        green=192;
        blue=203;
      }
      

        
      // store these new red, green and blue amounts back into the pixel
;      pix.setRed(red);
      pix.setGreen(green);
      pix.setBlue(blue);
        

      
    }

  
  }
  }
}
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  