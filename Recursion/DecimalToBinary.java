import java.io.*;
public class DecimalToBinary
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter a decimal Number : ");
		int x=Integer.parseInt(stdin.readLine());
		System.out.println("Binary: "+dec2binRecursive(x,""));				
		System.out.println("Binary: "+dec2binIterative(x));				
	}
	// recursive, initially ans="";
	public static String dec2binRecursive(int n, String ans)
	{
		if ( n < 1 )
		return ans;
		else // n>=1
		{
			ans=n%2+ans;
			return dec2binRecursive(n/2,ans);
		}		
	}
	// iterative
	public static String dec2binIterative(int n)
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