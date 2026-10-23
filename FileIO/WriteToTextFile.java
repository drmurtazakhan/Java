import java.io.*;

public class WriteToTextFile {

   public static void main(String[] args) {

      String name,ID;
      String outFile="out.txt";

      try {
      	
		 BufferedReader in =new BufferedReader (new InputStreamReader(System.in));
		 
		 System.out.println("Enter your name: ");
		 
		 name = in.readLine();
		 
		 System.out.println("Enter your ID: ");
		 
		 ID = in.readLine();
		 
		 FileWriter writer = new FileWriter(outFile,true);
			
         PrintWriter  out = new PrintWriter(writer);
                   
         out.println(name+"\t"+ID);
         
         out.close();
         
         }

      
      catch(FileNotFoundException e) {

      	System.out.println("File can not created");

      }

      catch(IOException e) {

         System.out.println("Error handling files");

      }

   }

}
