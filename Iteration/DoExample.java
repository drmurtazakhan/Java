import java.io.*;
class DoExample {
   public static void main(String[] args) throws IOException {
	BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );    
            int num;
   do {
    System.out.println("Enter a Number or 0 to stop execusion");
    String input= stdin.readLine();
    num = Integer.parseInt(input);
    if (num!=0)
    
    System.out.println("Squared number is:"+(num*num));
   } while (num != 0);
  }
}
