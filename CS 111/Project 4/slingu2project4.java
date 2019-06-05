/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Course Name: CS 111
 * Assignment: Project 4
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Create A WAV file according to the user input. 
 */ 
  
  
import java.util.*;
import java.awt.*;
import java.io.*;
import java.lang.String;



//MAIN FUNCTION



public class slingu2project4
{
  public static void main (String[] args)
  {
    System.out.println("Begin Program");
    System.out.println("");
 
    // put your Java Program here 
    String input;
    input = SimpleInput.getString ("Enter the note for the song to  be created.");
    
    //displaying what user has inputed
    System.out.println ("User Input: " + input);
 
    
    int inputLength = input.length();
    System.out.println ("User Input length: " + inputLength);
 
    //CREATING empty sound files to store the music files
    Sound s3 = new Sound (0);
    Sound finalwav = new Sound (0);
    
    //For loop to run through each character at a time
    for (int i = 0 ; i < inputLength ; i++)
    {
      //New silence sound for 1/8 sec
      Sound sSilence  = new Sound (2756);
      
      //locating and modifying the character at the position of the i value in the for loop
      char ch = input.charAt(i);
      System.out.println ("Character at position: " + i + " is " + ch);
      double freq = getFreqForNote (ch);
      Sound s1 = createSineWave (freq, 5000);
      Sound s2;
      
      //if statements to add a silence based on the dot. 
      if (input.regionMatches(i, ".", 0, 1))
        {
           s2 = joinSounds (s1,sSilence);
        }
      else
        {
           s2 = s1;
        }
     
      
      s3 = modifysound (s2);
     
      System.out.println ("The frew of note " + ch + " is " + freq);
      
      //joining all the sound files through the loop
      finalwav = joinSounds (finalwav, s3);

      
      
    }
 
    finalwav.explore();

 
     //code needed to write/save a created sound to the file system
    String fname = FileChooser.pickAFile();
    finalwav.write (fname);
    
 
 
    System.out.println("");
    System.out.println("End Java Exection");
  }

//end of main code
  

  
 
  
  
  
 //Method to check to the amplitudes of the samples are within the boundaries
  //Sound s is passed through the parameter 
  //Once the amplitudes of the sound file is verified/changed then it is returned as a sound file. 

  
  
  public static Sound modifysound ( Sound s )
  {
    SoundSample  arr[] = s.getSamples();
    
    // loop through all sample in the sound sample array
    int i;
    for ( i = 0 ; i < s.getLength() ; i++ )
    {
      int ampl;
      ampl = arr[i].getValue();

      
      
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
  
return s;


}
  
  
  
  
  
  //METHOD TO CREATE A SINE WAVE through frequency
  //Parameters : Double Frequency and the Integer Amplitude
  //The return value is the sound file
  
 public static Sound createSineWave (double freq, int maxAmplitude)
  {
   //initialising the new sound for 1/8 th of a sec
    Sound s = new Sound (2756);
    double samplingRate = s.getSamplingRate();
    double rawValue = 0;
    int value = 0;
    double interval = 1.0 / freq;
    double samplesPerCycle = interval * samplingRate;
    double maxValue = 2 * Math.PI;
 
    SoundSample[] ssarr = s.getSamples();
    int index;
 
    for (int i = 0 ; i < s.getLength()  ; ++i )
    {
      rawValue = Math.sin ((i / samplesPerCycle) * maxValue);
 
      value = (int) (maxAmplitude * rawValue);
 
      ssarr[i].setValue(value);
    }
 
    return s;
  }
 
 
 
 
 
 
 
 
 //METHOD TO GET THE FREQUENCY OF THE NOTE
 //Parameters are the char note that the input has entered
 //Return is the double frequency that has been calculated based on the char note. 
 
  public static double getFreqForNote (char ch)
  {
    String noteRepresentation = "78!9@a#bc$d%ef^g&A*BC(D)EF_G+H"; 
 
    int x;
    int y;  /* represented as H in the above string */
 
    x = noteRepresentation.indexOf(ch);
    if (x == - 1)
      return 0;
 
    y = noteRepresentation.indexOf('H');
 
    System.out.println ("Note " + ch + " is at pos " + x);
    System.out.println ("H is at pos " + y);
    
    
 
    double freq;
    double exp;
    exp = (x - y) / 12.0;
 
    freq = 440.0 * Math.pow (2.0, exp);
 
    return freq;
  } 
  
  
  
  
  
  
  
  //METHOD TO COMBINE TWO SOUND FILES
  //Parameters: 2 sound files to be combined
  //Result is one combined sound file. 
  
   public static Sound joinSounds ( Sound s1 , Sound s2 )
  {
    int l1 = s1.getLength() ;
    int l2 = s2.getLength();
    int l3 = l1 + l2;
    
    // l3 is the total number of samples in the two original sounds
    Sound sResult = new Sound ( l3 );
     
    // get the SoundSample Array
    SoundSample  arr1[] = s1.getSamples();
    SoundSample  arr2[] = s2.getSamples();
    SoundSample  arr3[] = sResult.getSamples();
    
    // copy the first sound into the sound result
    int i;
    for ( i = 0 ; i < l1 ; i++ )
    {
      int amp1 = arr1[i].getValue();
      int modi = i;
      arr3[modi].setValue ( amp1 );
    }
    
    // copy the second sound into the sound result
    for ( i = 0 ; i < l2 ; i++ )
    {
      int amp1 = arr2[i].getValue();
      int modi = i + l1;
      arr3[modi].setValue ( amp1 );
    }
    
    return sResult;
  }
  
}




//END OF CODE :)





