import java.io.*;
public class FactorialIterative{
	public static void main (String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter an Integer Number : ");
		int num=Integer.parseInt(stdin.readLine());
		
		long fac=1;
		for (int i=num; i>1; i--){
			 fac=fac*i;
		}		
		System.out.println("Factorial of "+num+" is "+fac);				
	}
}