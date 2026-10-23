 import java.util.*;
 import ccj.*;

public class FileReader
{  public static void main(String[] args)
   {  
      
      System.out.print("Enter data file name (e.g tf1.txt) : ");
      String filename=Console.in.readWord();
      TextInputStream in=new TextInputStream(filename);
      
      File f=new File();
      f.read(in);
      f.printLine();
      
   }   
      
} // end of class FileReader

class File
{
   public File()
   {
   line="";
   }
   public void read(TextInputStream in)
   {
   line=in.readLine();     
   }  
   public void printWord()
   {
   
   
   } 
   
   public void printLine()
   {
   System.out.println(line);
   }
   private String line;
 } // end of class file 
   
