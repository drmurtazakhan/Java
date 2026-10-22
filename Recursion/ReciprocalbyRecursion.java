import java.io.*;
public class ReciprocalbyRecursion
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("input number ");
		double n=Double.parseDouble( stdin.readLine());
		double answer=f(n);
		System.out.println("sum of series for n is "+answer);
	}
	public static double f(double n)
	{
		if (n==1)
		return n;
		else
		return (1.0/n+f(n-1));
	}
}
		
		
