import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SentinelLoop {
   public static void main(String[] args) throws java.io.IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter data (Q to finish):");
      double sum = 0;
      int count = 0;
      boolean done = false;

      while (!done) {
         String inputLine = stdin.readLine();
         if (inputLine.equalsIgnoreCase("q"))
            done = true;
         else {
            double x = Double.parseDouble(inputLine);
            sum = sum + x;
            count++;
         }
      }
      
      if (count == 0) 
         System.out.println("No data");
      else 
         System.out.println("Average = " + sum/count);
   }
}
