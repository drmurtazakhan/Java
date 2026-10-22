import java.io.*;

public class DecToBin{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter any positive integer number: ");
		
		int decimal = Integer.parseInt(stdin.readLine());
		
		MyStack theStack = new MyStack();
		
		
		while(decimal != 0){
			
			theStack.push(new Integer (decimal % 2));
			decimal /= 2;
		}
		
		System.out.println("The Binary Representation is: ");
		
		while(! theStack.isEmpty())
			System.out.print(theStack.pop());
		System.out.println();
	}
}