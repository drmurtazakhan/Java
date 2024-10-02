// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ

import java.io.*;
public class gcdByRecursionUserInput
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter first number: ");		
		int a=Integer.parseInt(stdin.readLine());
		System.out.println();
		System.out.print("Enter second number: ");		
		int b=Integer.parseInt(stdin.readLine());
		System.out.println();
		System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
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
		
	