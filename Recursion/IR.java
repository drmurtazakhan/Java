import java.io.*;
public class IR
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter value of x : ");
		double x=Double.parseDouble(stdin.readLine());
		System.out.print("Enter value of y : ");
		double y=Double.parseDouble(stdin.readLine());
		double p=power(x,y);
		System.out.println(x+" power "+y+" is "+p);				
	}
	public static double power(double a, double b)
	{
		if (b==0)
		return 1;
		else
		return a * power(a,b-1);
	}
}