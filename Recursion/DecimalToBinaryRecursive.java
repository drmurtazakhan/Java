import java.io.*;
public class DecimalToBinaryRecursive
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter an integer : ");
		int x=Integer.parseInt(stdin.readLine());
		System.out.println("Binary of "+x+" is "+dec2bin(x,"") );				
	}
	public static String dec2bin(int n, String ans)
	{
		if ( n < 1 )
		return ans;
		else // n>=1
		{
			ans=n%2+ans;						
			return dec2bin(n/2,ans);
		}		
	}
}