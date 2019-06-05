/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Superimposing pictures to create a 3d effect. 
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2project2
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
    
    
    // calling a method to perform the picture modification
    superImpose ( p1, p2 );
    
    
    //End of the main function 
    System.out.println("");
    System.out.println("End Java Exection");
  }   
// end of main method
  
  //New method to modify annd combine two pictures
public static void superImpose ( Picture p1, Picture p2 )
{
  
  //initialising the pixels and points
  Pixel pix1;
  Pixel pix2;
  Pixel pix3;
  int x;
  int y;
    
  //accessing the width of the picture1
  int width1;
  width1 = p1.getWidth();
  System.out.println ( "The width of the picture is: " + width1);
    
  //Accessing the height of the picture1
  int height1 = p1.getHeight ();
  System.out.println ( "The height of the picture is: " + height1);
  
  //accessing the width of the picture2
  int width2;
  width2 = p2.getWidth();
  System.out.println ( "The width of the picture is: " + width2);
    
    //Accessing the height of the picture2
  int height2 = p2.getHeight ();
  System.out.println ( "The height of the picture is: " + height2);
  
  if (width1==width2 && height1==height2)
  {
 //create my third image to store the superimposed result
  Picture p3 = new Picture ( width1, height1 );
    
  for ( x = 0 ; x < width1 ; x = x + 1 )
  {
    for ( y = 0 ; y < height1 ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      pix1 = p1.getPixel ( x, y );
      pix2 = p2.getPixel ( x, y );
      pix3 = p3.getPixel ( x, y );
       
      //Accessing the colors
      int redAmount=pix1.getRed();
      int greenAmount= pix1.getGreen();
      int blueAmount=pix1.getBlue();
      int grayAmount1,grayAmount2;
      
      //Manupilating the gray amount 
      grayAmount1 = (int)(redAmount * 0.299 + greenAmount *.587 + blueAmount *0.114) ;
        
      // access the amount of red, green and blue at that pixel
      redAmount = pix1.getRed();
      greenAmount = pix1.getGreen();
      blueAmount = pix1.getBlue();
      
      //Editing the pixels
      pix1.setRed(grayAmount1);
      pix1.setGreen(0);
      pix1.setBlue(0);
      
       //Accessing the colors
      int r2 = pix2.getRed();
      int g2 = pix2.getGreen();
      int b2 = pix2.getBlue();
      
        //Manupilating the gray amount
      grayAmount2 = (int)(r2 * 0.299 + g2 *.587 + b2 *0.114) ;
 
      //Editing the pixels
      pix2.setRed(0);
      pix2.setGreen(grayAmount2);
      pix2.setBlue(grayAmount2);
      
 
        
      // store these new red, green and blue amounts back into the pixel
      pix3.setRed(grayAmount1);
      pix3.setGreen(grayAmount2);
      pix3.setBlue(grayAmount2);
      
   
    }
   
  }
    


//Displaying the modified picture    
 p3.explore ();

}
 else
  {
    //printing out the system error if the pictures are not of same size
   System.out.println ("Error: Select pictures of the same size");
   SimpleOutput.showError ("Error: Select pictures of the same size");
   System.exit (1);
    
  }
}
}
  





 // end of Template class
















