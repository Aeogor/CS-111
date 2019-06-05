/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Creating a collage of pictures according to the flag of the country and posterizing to match the colors. 
 */ 
  
  
  //importing Color and file
  import java.awt.Color;
  import java.io.File;



public class slingu2project3
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");
   
   //Allowing the user to choose a pciture

   
   
     String filename;
    filename = FileChooser.pickAFile();
    
    //Deciding the folder name
    System.out.println (filename);
    int index = filename.lastIndexOf(File.separatorChar);
    System.out.println ("Last Index of Separator Char: " + index);
    String folderName = filename.substring( 0, index+1 );
    System.out.println (folderName);
    
    String f1name = folderName + "bread.jpg";
    
    
    //getting the Picture 1 and manupilating it
    Picture p1;
    p1 = new Picture ( f1name );   // use the picture selected by pickAFile()
    p1 = crop (p1,1,1,400,800);
    p1 = posterization1 (p1);
    
    // get the second picture from the file system, reduce it, crop it, posterize it
    String f2name = folderName + "eiffel.jpg";
    Picture p2;
    p2 = new Picture ( f2name );
      p2 = reducepicture (p2,6.7,4.5);
       p2 = crop (p2,1,1,400,800);
       p2 = posterization2 (p2);
   
    
    // get the third picture from the file system and then reduce it, crop it, posterize it
    String f3name = folderName + "perfume.jpg";
    Picture p3;
    p3 = new Picture ( f3name );
 
    p3 = reducepicture (p3, 1.87, 1);
    p3 = crop (p3,1,1,400,800);
    p3 = posterization3 (p3);
 

     
   //Creating picture result and calling upon the function of makecollage
     
   Picture result;
   result = makeCollage (p1,p2,p3);
   
   //displaying the picture
   result.explore();
     
  }
  
  
 
  //A Method to reduce the size of the picture p
  public static Picture reducepicture ( Picture p, double sizex, double sizey )
{
  //initialising the variables  
  Picture result;
  Pixel pix;
  int x;
  int y;
    
  //obtaining the width and the height
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  // determine the size of the resulting picture
  int rWidth = (int)(width / sizex);
  int rHeight = (int)(height / sizey);
  
  // create the "blank canvas" for the result
  result = new Picture ( rWidth , rHeight );
    
  for ( x = 0 ; x < rWidth ; x = x + 1 )
  {
    for ( y = 0 ; y < rHeight ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      int originalX;
      int originalY;
      originalX = (int)(x*sizex);
      originalY = (int)(y*sizey);
      pix = p.getPixel (originalX, originalY );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the mikrrored pixel
      
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( x, y );
      pix2.setColor (pixColor);
     
    }
  }
  //returning the reduced picture
  return result;
}

  
 
  
  //A method to combine the three pictures 
  public static Picture makeCollage ( Picture p , Picture p2 , Picture p3)
{
  Picture result;
  Pixel pix;
  int x;
  int y;
    
  // get widths and heights
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  int w2 = p2.getWidth();
  int h2 = p2.getHeight();
  
  
  int w3 = p3.getWidth();
  int h3 = p3.getHeight();
  
 
  
  // create the "blank canvas" for the result
  result = new Picture ( 1200 , 800 );
    
  // copy picture one onto the result canvas
  for ( x = 0 ; x < width ; x = x + 1 )
  {
    for ( y = 0 ; y < height ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the mikrrored pixel
      int modX;
      int modY;
      modX = x;
      modY = y;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
   
  
  // copy picture two onto the result canvas
  for ( x = 0 ; x < w2 ; x = x + 1 )
  {
    for ( y = 0 ; y < h2 ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      pix = p2.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the mikrrored pixel
      int modX;
      int modY;
      modX = width + x;
      modY = y;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
  
  
    // copy picture three onto the result canvas
  for ( x = 0 ; x < w3 ; x = x + 1 )
  {
    for ( y = 0 ; y < h3 ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      pix = p3.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the mikrrored pixel
      int modX;
      int modY;
      modX = width + w2 + x;
      modY = y;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
  //Returning the finished collage
  return result;
}


  
 
  
  
  
  
//A method to crop the pictures into the the right size 

public static Picture crop ( Picture p , int startX,  int startY, int endX, int endY   )
                             
{
  Picture result;
  Pixel pix;
  int x;
  int y;
  
  //Obtaining the width and the height of the pictures
  int width;
  width = p.getWidth();
  System.out.println ( "The width of the picture is: " + width);
    
  int height;
  height = p.getHeight ();
  System.out.println ( "The height of the picture is: " + height);
  
  // create the "blank canvas" for the result
  result = new Picture ( endX - startX , endY - startY );
  
  //For loop to determine the pixels
  for ( x = startX ; x < endX ; x = x + 1 )
  {
    for ( y = startY ; y < endY ; y = y + 1 )
    {
      // access the pixel at a specified corredinate location
      pix = p.getPixel (x, y );
      Color pixColor = pix.getColor();
          
      // determine the location in the result of the mikrrored pixel
      int modX;
      int modY;
      modX = x - startX;
      modY = y - startY;
      
      // store the color into a pixel in the result
      Pixel pix2;
      pix2 = result.getPixel( modX, modY );
      pix2.setColor (pixColor);
    }
  }
  // returning the cropped picture
  return result;
}




// A method to posterize the first picture
public static Picture posterization1 ( Picture p)
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
      
     

        
      // store these new red, green and blue amounts back into the pixel
     pix.setRed(0);
     pix.setGreen(0);
     pix.setBlue(grayAmount);
        

      
    }

  
  }
 
 return p;
  }



// A method to posterize the second picture
public static Picture posterization2 ( Picture p)
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
      grayAmount = (int)(red * 0.9 + green *1.2 + blue *0.6) ;
      
     

        
      // store these new red, green and blue amounts back into the pixel
     pix.setRed(grayAmount);
      pix.setGreen(grayAmount);
      pix.setBlue(grayAmount);
        

      
    }

  
  }
 
 return p;
  }





// A method to posterize the third picture
public static Picture posterization3 ( Picture p)
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
      
     

        
      // store these new red, green and blue amounts back into the pixel
     pix.setRed(grayAmount);
      pix.setGreen(0);
      pix.setBlue(0);
        

      
    }

  
  }
 
 return p;
  }


}

     
     
     
     
     
     
     
     
     
     
     
     
     
     
  
   