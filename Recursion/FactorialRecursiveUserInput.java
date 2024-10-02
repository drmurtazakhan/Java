// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ

import java.io.*;
public class FactorialRecursiveUserInput
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter an Integer Number : ");
		int num=Integer.parseInt(stdin.readLine());
		int fact=factorial(num);
		System.out.println("Factorial of "+num+" is "+fact);				
	}
	public static int factorial(int n)
	{
		if (n==0)
		return 1;
		else
		return n * factorial(n-1);
	}
}