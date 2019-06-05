import  java.awt.Color;

public class picture
{
 public static void main (String[] args)
 {
   System.out.println ("Begin Java Execution");
   System.out.println ("");
   
  //Creating  in a picture through pickAFile
  Picture p;
  String filename;
  filename = FileChooser.pickAFile ();
  p = new Picture ( filename );
  
  //Creating a turtle living in a pic
  Turtle t1;
  t1 = new Turtle (p);
  
  //save a pictureafter editing through pickAFile
  String filename2;
  filename2 = FileChooser.pickAFile();
  
  p.write (filename2 );
  
  
  //show the picture
  p.show();
  
  System.out.println ("");
  System.out.println ("End Java Execution");
 }
  
  
}