import java.io.*;
public class gcdNonRecursve
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.println("Enter first number :");
		int a=Integer.parseInt(stdin.readLine());
		System.out.println("Enter second number :");
		int b=Integer.parseInt(stdin.readLine());
		System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
	}
	public static int gcd(int a, int b)
	{
		int r;
		do
		{
			r = b % a;
			b = a;
			a = r;
		}
		while ( r!=0);
		return b;			
	}
}
		
	