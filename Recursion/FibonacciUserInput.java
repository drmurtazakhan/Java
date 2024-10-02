// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ

import java.io.*;
public class FibonacciUserInput
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Which term of Fibonacci sequence do you want to compute : ");
		int num=Integer.parseInt(stdin.readLine());
		int fib=fibonacci(num);
		System.out.println(num+" term of fibonacci sequence is: "+fib);				
	}
	public static int fibonacci(int n)
	{
		if (n==1 || n==2)
		return 1;
		else
		return ( fibonacci(n-1)+fibonacci(n-2) );
	}
}