/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Course Name: CS 111
 * Assignment: Lab 10
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Modification of Sound Files
 */ 
  
  
  //importing Color
  import java.awt.Color;



public class slingu2lab10
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");
   
   // declare an integer variable to store a number given by the user.
 int value;
 
 // ask the user for a number within a range of values 1-300
 value = SimpleInput.getIntNumber ("Please enter an integer value between 1 and 300.", 1,300);
 
 // display the value entered by the user
 System.out.println ("The user entered: " + value);
 
 // put your Java Program here
    String filename;
    filename = FileChooser.pickAFile();
    Sound s;
    s = new Sound (filename);
    
    //Calling upon the method to modify the sound file and pass on the 2 parameters
    modifySound ( s,value );
    
    //
    s.explore();
    
  


    System.out.println("");
    System.out.println("End Java Exection");
  }
  
  public static void modifySound ( Sound s, int v )
  {
    SoundSample  arr[] = s.getSamples();
    
    // loop through all sample in the sound sample array
    int i;
    
    //For loop to go through each amplitude and change it accordingly
    for ( i = 0 ; i < s.getLength() ; i++ )
    {
      int ampl;
      ampl = arr[i].getValue();
      ampl = ampl * v;
      ampl = ampl/100;
      arr[i].setValue ( ampl );
      
      
      //If statements to check whether the amplitude is with in the boundaries
       if (ampl > 32767)  
       {  
         ampl = 32767; 
       } 
       
        if (ampl < -32768)  
       {  
          ampl = -32768; 
        } 
    }
  }
 
  }
//End of code


 
 
 
 
 
 
 
 
 
 
 
 
 