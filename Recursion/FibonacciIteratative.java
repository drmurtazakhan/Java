import java.io.*;
public class FibonacciIteratative
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
		int prv1=1;
		int prv2=1;
		int current=1;
		for (int i = 3; i <= n; i++)
		{
			current=prv1+prv2;
			prv1=prv2;
			prv2=current;
		}
		return current;
		
	}
}