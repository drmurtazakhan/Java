import java.io.*;
public class AnyBase2Decimal
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.println("Enter number (e.g., 1011) :");
		int n=Integer.parseInt(stdin.readLine());
		System.out.println("Enter base :");
		int b=Integer.parseInt(stdin.readLine());
		System.out.println("Decimal Equivalent is "+toDecimal(n,b));
		
	}
	
	public static int toDecimal(int n, int b)
	{
	   int result=0;
	   int multiplier=1;
	      
	   while(n>0)
	   {
	      result=result+ n%10*multiplier;
	      multiplier*=b;
	      n/=10;
	   }
	      
	   return result;
	}
}
		
	