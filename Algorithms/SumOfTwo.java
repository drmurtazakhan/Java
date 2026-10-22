import java.io.*;
class SumOfTwo
{	public static void main(String [] s) throws IOException
	{	int a[]={5, 4, 9, 7, 12, 20};
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter an integer : ");
		int x=Integer.parseInt(stdin.readLine());		
		System.out.println(checkSumOfTwo(a,x));
	}
	public static boolean checkSumOfTwo(int a[],int x)
	{	for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)		
			if(x==a[i]+a[j]) 
			return true;
		}
		return false;
	}
}
