import java.io.*;
public class CheckWithinRange
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.println("Enter  number :");
		int num=Integer.parseInt(stdin.readLine());
		
		int rangeStart=43104275;
		int rangeEnd=43110568;
		
		if (num >= rangeStart && num <= rangeEnd )
		{
			System.out.println("Inside range");
		}
			
		else
		{
			System.out.println("Outside range");	
		}
			
				
		
		/*
		System.out.println("Enter first number :");
		int a=Integer.parseInt(stdin.readLine());
		System.out.println("Enter second number :");
		int b=Integer.parseInt(stdin.readLine());
		System.out.println("GCD of "+a+" and"+b+ " is "+gcd(a,b));
		System.out.println("LCM of "+a+" and"+b+ " is "+a*b/gcd(a,b));
		*/
	}
}
		
	