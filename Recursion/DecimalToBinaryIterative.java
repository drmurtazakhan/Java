import java.io.*;
public class DecimalToBinaryIterative
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter an integer : ");
		int x=Integer.parseInt(stdin.readLine());
		System.out.println("Binary of "+x+" is "+dec2bin(x) );				
	}
	public static String dec2bin(int n)
	{
		String binary ="";
		while ( n >= 1 )
		{
			binary = n%2  + binary;
			n /= 2;
		}
		return binary;
	}
}