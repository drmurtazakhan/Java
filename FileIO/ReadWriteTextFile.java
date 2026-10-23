import java.io.*;

public class ReadWriteTextFile {

   public static void main(String[] args) {

      int count = 0;

      String line;
      String inFile="storylines.txt";
      String outFile="story.txt";
      try {

         BufferedReader  in = new BufferedReader(new FileReader(inFile));

         PrintWriter  out = new PrintWriter(new FileWriter(outFile, true));
     
         while (in.ready()) {

            line = in.readLine();

            if (line != null) {

                  count++;
                  out.println(line);

            }

         }

         System.out.println(count+" lines have been appended to "+ outFile );

         in.close();

         out.close();

      }

      catch(FileNotFoundException e) {

         System.out.println("Sorry, one or both files could not be found");

      }

      catch(IOException e) {

         System.out.println("Error handling files");

      }

   }

}
