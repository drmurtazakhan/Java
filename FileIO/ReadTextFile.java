import java.io.*; 

public class ReadTextFile { 

      public static void main(String[] args) { 

         String line; 

         int count = 0; 

                      

         try { 

            FileReader reader = new FileReader("textFile.txt");            
            BufferedReader  in = new BufferedReader(reader);
            while (in.ready()) { 
                  line = in.readLine(); 
                  System.out.println(line); 
                  count++; 
            } 
            System.out.println("\n"+count + " lines have been read from textFile.txt" );
            in.close(); 
         } 
         catch(FileNotFoundException e) { 
            System.out.println("Input File not found"); 
         } 

         catch(IOException e) {
             System.out.println("Error reading from input file"); 
         } 

      } 

} 
