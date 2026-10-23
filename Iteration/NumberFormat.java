import java.io.BufferedReader;
import java.io.InputStreamReader;
public class NumberFormat {
   public static void main(String[] args) throws java.io.IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		boolean inputOk = false;
      do {
      	try {
          	     String inputLine = stdin.readLine();
                    int n = Integer.parseInt(inputLine.trim());
                    inputOk = true;
              }
             catch(NumberFormatException e) {
                   System.out.println("Input Error.  Try again.");
            }
      } while (!inputOk);
   }
}
