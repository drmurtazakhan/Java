 import java.util.*;
 import ccj.*;

public class FileReader1
{  public static void main(String[] args)
   {  
      
      System.out.print("Enter data file name (e.g tf1.txt) : ");
      String filename=Console.in.readWord();
      TextInputStream in=new TextInputStream(filename);
      
      while()
      {
      String line=readline(in);
      printLine(line);
      in.readLine();
      }
   }   
   
   public static String readline(TextInputStream in)
   {
   String line=in.readLine();     
   return line;
   }  
   public static void printWord()
   {
   
   
   } 
   
   public static void printLine(String line)
   {
   System.out.println(line);
   }
   
      
} // end of class FileReader


   
