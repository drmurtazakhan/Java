import java.io.*;
public class MaxofArraybyRecursion
{
	public static void main (String[] args) throws IOException
	{
		SIZE=5;
		int[] a = {2,4,3,7,5};
		
		int max=FindMax(a,0);
		System.out.println("Maximum "+num+" is "+fact);				
	}
	public static int FindMax(a,n)
	{
		if (a.length=n-1)
		return max;
		else if (n==0)
		max=a[0];
		else if (n>0)
		{
			if (a[n+1]>a[n]);
			max=a[n+1];
			n=n+1;
			if (n<a.length-1)
			FindMax(a,n);
		}			
	}
}