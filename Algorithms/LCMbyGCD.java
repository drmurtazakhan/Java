import java.io.*;
public class LCMbyGCD
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.println("Enter first number :");
		int a=Integer.parseInt(stdin.readLine());
		System.out.println("Enter second number :");
		int b=Integer.parseInt(stdin.readLine());
		System.out.println("GCD of "+a+" and"+b+ " is "+gcd(a,b));
		System.out.println("LCM of "+a+" and"+b+ " is "+a*b/gcd(a,b));
	}
	public static int gcd(int a, int b)
	{
		if (a>b)
		return gcd (b,a);
		else if (b%a==0)
		return a;
		else 
		return gcd(a,b%a);	
	}
}
		
	