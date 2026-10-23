import java.io.*;
public class ParameterPassing
{	
	public static void modifyParameter(int n)
	{
		n=n+3;
		System.out.println("Inside method : "+n);		
	}
	public static void main (String[] args ) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		int n;
		System.out.print("Enter an integer: ");
		n=Integer.parseInt(stdin.readLine());
		
		System.out.println("Before invoking method : "+n);
		modifyParameter(n);
		System.out.println("After invoking method : "+n);
	}
}


