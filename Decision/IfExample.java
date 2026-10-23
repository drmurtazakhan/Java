import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException; 
class IfExample  {
	public static void main(String[]args) throws IOException {
	 	int number;
	  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in ) );
	        System.out.print("Enter a number: ");
		String input = stdin.readLine(); 
		number= Integer.parseInt(input);   
		if (number % 2 == 0 )
	 	 System.out.println("The number is even");
	 	 int delay=15;
	 	 delay = (delay<10)? 10 : delay;
	 	 System.out.println("delay"+delay);
	}
}
