/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Posterization
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2project2a
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");


    // Selecting a picture
    String filename;
    filename = FileChooser.pickAFile();
    Picture p1;
    p1 = new Picture ( filename );   // use the picture selected by pickAFile()
    
    //get my second picture
    filename = FileChooser.pickAFile();
    Picture p2;
    p2 = new Picture ( filename );   // use the picture selected by pickAFile()
    
    
    
    // call a method to perform the picture modification
    Picture modifyPicture;
    modifyPicture = superImpose ( p1, p2, p3 );
    
   
    
    // display the PICTURE
    modifyPicture.explore();
    
    // save the picture onto the file system
    //String filename2;
    //filename2 = FileChooser.pickAFile();
    //p.write ( filename2 );

    System.out.println("");
    System.out.println("End Java Exection");
  }   // end of main method
  
public static Picture superImpose ( Picture p1, Picture p2, Picture p3 )
{
  Pixel pix1;
  Pixel pix2;
  Pixel pix3;
  int x;
  int y;
    
  int width1;
  width1 = p1.getWidth();
  System.out.println ( "The width of the picture is: " + width1);
    
  int height1 = p1.getHeight ();
  System.out.println ( "The height of the picture is: " + height1);
  
  int width2;
  width2 = p1.getWidth();
  System.out.println ( "The width of the picture is: " + width2);
    
  int height2 = p1.getHeight ();
  System.out.println ( "The height of the picture is: " + height2);
  
  if (width1==width2 && height1==height2)
  {
// create my third image to store the superimposed result
  //Picture p3 = new Picture ( width1, height1 );
    
  for ( x = 0 ; x < width1 ; x = x + 1 )
  {
    for ( y = 0 ; y < height1 ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      pix1 = p1.getPixel ( x, y );
      pix2 = p2.getPixel ( x, y );
      pix3 = p3.getPixel ( x, y );
       
      int redAmount=pix1.getRed();
      int greenAmount= pix1.getGreen();
      int blueAmount=pix1.getBlue();
      int grayAmount1,grayAmount2;
      
       grayAmount1 = (int)(redAmount * 0.299 + greenAmount *.587 + blueAmount *0.114) ;
        
      // access the amount of red, green and blue at that pixel
      redAmount = pix1.getRed();
      greenAmount = pix1.getGreen();
      blueAmount = pix1.getBlue();
      
      pix1.setRed(grayAmount1);
      pix1.setGreen(0);
      pix1.setBlue(0);
      
      
      int r2 = pix2.getRed();
      int g2 = pix2.getGreen();
      int b2 = pix2.getBlue();
      
      grayAmount2 = (int)(r2 * 0.299 + g2 *.587 + b2 *0.114) ;
      
      pix3.setRed(0);
      pix3.setGreen(grayAmount2);
      pix3.setBlue(grayAmount2);
        
      // manipulate the red, green and blue amounts
      //redAmount = (redAmount + r2)/2;
      //greenAmount = (greenAmount + g2)/2;
      //blueAmount = (blueAmount + b2)/2;
        
      // store these new red, green and blue amounts back into the pixel
      pix3.setRed(grayAmount1);
      pix3.setGreen(grayAmount2);
      pix3.setBlue(grayAmount2);
    }
  }
    
  // use the return statement to send p3 back to main()
return p3;
  }
  else
  {
    System.out.println ("The pictures are not of same size");
    

    
 
  }
  

return p3;
}
}

 // end of Template class
















