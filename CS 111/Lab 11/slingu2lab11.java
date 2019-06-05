/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Course Name: CS 111
 * Assignment: Lab 11
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Combining two Sound Files
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab11
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");

   System.out.println ("Pick a forground sound file");
   
 // put your Java Program here
    String foreground;
    foreground = FileChooser.pickAFile();
    Sound s1;
    s1 = new Sound (foreground);
    
    
// put your Java Program here
    String background;
    background = FileChooser.pickAFile();
    Sound s2;
    s2 = new Sound (background);
    
    
    //Calling upon the method to modify the sound file and pass on the 2 parameters
    combinesound ( s1,s2 );

    
  


    System.out.println("");
    System.out.println("End Java Exection");
  }
  
  public static void combinesound ( Sound s1, Sound s2 )
  {
    SoundSample  arr1[] = s1.getSamples();
    SoundSample  arr2[] = s2.getSamples();
    
    // loop through all sample in the sound sample array
    int i,j=0;
    
    //For loop to go through each amplitude and change it accordingly  
   
    for ( i = 0 ; i < s1.getLength() ; i++ )
    {
      int ampl1, ampl2, ampl3;
      ampl1 = arr1[i].getValue();
     
     
     
      ampl2 = arr2[i%s2.getLength()].getValue();
      
      ampl3 = ampl1 + ampl2;
      
     
      //If statements to check whether the amplitude is with in the boundaries
       if (ampl3 > 32767)  
       {  
         ampl3 = 32767; 
       } 
       
        if (ampl3 < -32768)  
       {  
          ampl3 = -32768; 
        } 
      
      arr1[i].setValue ( ampl3 );
      
      
   
    }
    s1.explore();
  }
  }
  
//End of code


 
 
 
 
 
 
 
 
 
 
 
 
 