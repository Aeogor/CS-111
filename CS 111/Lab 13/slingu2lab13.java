/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Course Name: CS 111
 * Assignment: Lab 13
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Modifying the first and last 3 seconds of the sound file
 */ 
  
  
  //importing Color
  import java.awt.Color;


//main function
public class slingu2lab13
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");

   System.out.println ("Pick a sample sound file");
   

    
    // put your Java Program here
    String filename = FileChooser.pickAFile();
    Sound s = new Sound (filename);
    int length = s.getLength();
    
    //Displaying the length, sampling rate and time of the selected file
    System.out.println ("S1 Length: " +  s.getLength());
    System.out.println ("S1 Sampling Rate: " +  s.getSamplingRate());
    System.out.println ("S1 Time: " +  s.getLength()/s.getSamplingRate());
    double SamplingRate = s.getSamplingRate();
    
    //initialising the first 3 time periods for dividing the sound file
    double t0 = 0;
    double t1 = 1*SamplingRate;
    double t2 = 2*SamplingRate;
    double t3 = 3*SamplingRate;
    
    //initialising the last 3 time periods for dividing the sound file
    double t4 = length - (3*SamplingRate);
    double t5 = length - (2*SamplingRate);
    double t6 = length - (1*SamplingRate);
    double t7 = length;

    //passing through the paramenters to divide the sound file.
    Sound s1 = makeSoundByte ( s , t0, t1 );
    Sound s2 = makeSoundByte ( s , t1, t2 );
    Sound s3 = makeSoundByte ( s , t2, t3 );
    Sound s4 = makeSoundByte ( s , t3, t4 );
    Sound s5 = makeSoundByte ( s , t4, t5 );
    Sound s6 = makeSoundByte ( s , t5, t6 );
    Sound s7 = makeSoundByte ( s , t6, t7 );
    
    //Passing through the modify volume parameter to change the amplitude of the sound accordingly
    
    //first 3 seconds
    modifyvolume ( s1 , 25 );
    modifyvolume ( s2 , 50 );
    modifyvolume ( s3 , 75);
    
    //last 3 seconds
    modifyvolume ( s7 , 25 );
    modifyvolume ( s6 , 50 );
    modifyvolume ( s5 , 75 );
    
      
      //Method to combine sound samples with other sound samples
      Sound array1 = joinsounds (s1, s2);
      Sound array2 = joinsounds (array1, s3);
      Sound array3 = joinsounds (array2, s4);
      Sound array4 = joinsounds (array3, s5);
      Sound array5 = joinsounds (array4, s6);
      Sound array6 = joinsounds (array5, s7);
 
      //Exploring the sound sample 
      array6.explore ();
      
     //code needed to write/save a created sound to the file system
    String fname = FileChooser.pickAFile();
    array6.write (fname);
    
  }

  
  
  
  
  
  
  
  
  
    
   //Method to divide the sound sample according to the parameters 
  public static Sound makeSoundByte ( Sound s1,  double startindex, double endindex )
  {
    int l1 = s1.getLength() ;
    
    //Changing the parameters from double to integer
    int startIndex = (int)startindex;
    int endIndex = (int)endindex;
    
    int l3 = endIndex - startIndex;
    
    // l3 is the total number of samples in the finall sounds
    Sound sResult = new Sound ( l3 );
     
    // get the SoundSample Array
    SoundSample  arr1[] = s1.getSamples();
    SoundSample  arr3[] = sResult.getSamples();
    
    // copy the first sound into the sound result
    int i;
    for ( i = startIndex  ; i < endIndex ; i++ )
    {
      int amp1 = arr1[i].getValue();
      int modi = i - startIndex;
      arr3[modi].setValue ( amp1 );
     
    }
    
    //returning the result
    return sResult;
  }
  
  
  
  
  
  
  
  
  
  
     
     //method to modify the decrease the amplitude to the new percentage passed through the parameter 
   public static void modifyvolume ( Sound s , int v)
  {
    SoundSample  arr[] = s.getSamples();
    
    // loop through all sample in the sound sample array
    int i;
    for ( i = 0 ; i < s.getLength() ; i++ )
    {
      int ampl;
      ampl = arr[i].getValue();
      ampl = ampl*v;
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
   
 
   
   
   
   
   
   
   
   
     
     //Method to join the two sound samples that were passed through the parameters
 public static Sound joinsounds ( Sound s1 , Sound s2 )
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
     
     
     
     
     
     
     
     
     
     
    
    
    
    
    
    
    
    
    
    
    
    
    