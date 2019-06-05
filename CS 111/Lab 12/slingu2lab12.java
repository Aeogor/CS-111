/*Name: Srinivas C Lingutla
 * Netid: slingu2
 * Course Name: CS 111
 * Assignment: Lab 12
 * Day and Time: Monday, 12:00 PM - 12:50 PM
 * Description: Combining Sound Files
 */ 
  
  
  //importing Color
  import java.awt.Color;
  import java.io.File;



public class slingu2lab12
{
  public static void main (String[] args)
  {
   System.out.println ("Begin Java Execution");
   System.out.println ("NETID: slingu2\nNAME: Srinivas C Lingutla\n\n");

   System.out.println ("Pick a forground sound file");
   
   
      String filename;
    filename = FileChooser.pickAFile();
    
    //Deciding the folder name
    System.out.println (filename);
    int index = filename.lastIndexOf(File.separatorChar);
    System.out.println ("Last Index of Separator Char: " + index);
    String folderName = filename.substring( 0, index+1 );
    System.out.println (folderName);
    
    //Initializing the sound samples required 
     String f1name = folderName + "we.wav";
     Sound s1;
    s1 = new Sound (f1name);
     
     String f2name = folderName + "united.wav";
      Sound s2;
    s2 = new Sound (f2name);
     
     
     String f3name = folderName + "justice.wav";
      Sound s3;
    s3 = new Sound (f3name);
     
     
     String f4name = folderName + "to.wav";
      Sound s4;
    s4 = new Sound (f4name);
     
     
     
     String f5name = folderName + "establish.wav";
      Sound s5;
    s5 = new Sound (f5name);
     
     
     
     String f6name = folderName + "the.wav";
      Sound s6;
    s6 = new Sound (f6name);
     
    
     String f7name = folderName + "people.wav";
      Sound s7;
    s7 = new Sound (f7name);
     
    
    //empty sound sample for the silence between each word. 
     int numSamples = (int) (11050 * 0.5);
     Sound silence = new Sound (numSamples);
    
    
   //Sound samples used for combining sound samples with silence samples
      
     Sound array0 = combinesound (s1,silence);
      Sound array1 = combinesound (s2,silence);
     Sound array2 = combinesound (s3,silence);
      Sound array3 = combinesound (s4,silence);
      Sound array4 = combinesound (s5,silence);
      Sound array5 = combinesound (s6,silence);
      
      
      //Method to combine sound samples with other sound samples
      Sound array6 = combinesound (array0, array1);
      Sound array7 = combinesound (array6, array2);
      Sound array8 = combinesound (array7, array3);
      Sound array9 = combinesound (array8, array4);
      Sound array10 = combinesound (array9, array5);
      Sound array11 = combinesound (array10,s7);
 
      //Exploring the sound sample 
      array11.explore ();
     
    System.out.println("");
    System.out.println("End Java Exection");
  }
    
   //Method to join two sound samples
  public static Sound combinesound (Sound s1, Sound s2)
  {
    //initialising intergers to get the length of the sound samples
    int len1 = s1.getLength();
    int len2 = s2.getLength();
    //CCreating a new sound sample with the lenth of the combined two
    int len3 = len1 + len2;
    Sound result = new Sound (len3);
    
   SoundSample[] arr1;
   SoundSample[] arr2;
   SoundSample[] arr3;

   // the getSamples method will allocate space for
   //   the array and initialize the values in the array
   arr1 = s1.getSamples();
   arr2 = s2.getSamples();
   arr3 = result.getSamples();

   int i;
   // copy the values from the first sound parameter
   for ( i = 0 ; i < len1 ; i++)
      {
       // access the amplitude from s1
       SoundSample ss1;
       ss1 = arr1[i];
       int ampl1 = ss1.getValue();
       
       // store the amplitude in the result sound
       SoundSample ss3;
       ss3 = arr3[i];
       ss3.setValue(ampl1);
       arr3[i] = ss3;
      }
   
   // copy the values from the second sound parameter
   for ( i = 0 ; i < len2 ; i++)
      {
       // access the amplitude from s2
       SoundSample ss2;
       ss2 = arr2[i];
       int ampl2 = ss2.getValue();
       
       // store the amplitude in the result sound
       SoundSample ss3;
       int i2 = i + len1;
       ss3 = arr3[i2];
       ss3.setValue(ampl2);
       arr3[i] = ss3;
      }
   
   
   return result;
  }
}

 
  
//End of code

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    