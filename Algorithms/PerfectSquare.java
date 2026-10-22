import java.io.*;
class PerfectSquare
{	public static void main(String [] s) throws IOException
	{	InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter an integer : ");
		int x=Integer.parseInt(stdin.readLine());		
		System.out.println(checkPerfectSquare(x));
		System.out.println(checkPerfectSquare2(x));
	}
	public static boolean checkPerfectSquare(int n)
	{	int x=(int)Math.sqrt(n);
		double xx=(double) x;
		double y=Math.sqrt(n);
		return	xx==y;		
	}
	public static boolean checkPerfectSquare2(int n)
	{	double x=Math.sqrt(n);
		double y=Math.round(x);
		return	x==y;		
	}
}
