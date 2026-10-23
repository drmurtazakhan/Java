package mak2000.discretemath;
import java.util.*;
import java.io.*;
public class MathUtil
{
	
   //factorial of integer
	public static int fact(int n)
	{	
		if (n<0)
		{
			System.out.println("input should be positive integer");
			System.exit(0);
		}
		int ans=1;	
		for (int k=n; k>1; k--)
		{
			ans=ans*k;
		}
		return ans;			
	}

/*
 * number of permutation of n objects taken r at a time
 */	
	public static int permut(int n,int r)
	{	
		return MathUtil.fact(n)/(MathUtil.fact(n-r));			
	}
	
/*
 * clock-wise cycle index 0 to n-1
 * Example n=4
 * 0 1 2 3
 * 1 2 3 0
 * 2 3 0 1
 * 3 0 1 2
 */	
	public static int[][] cycleCW0toN_1(int n)
	{	
		int[][] a = new int[n][n];
		
		for (int i=0; i<n; i++)
		{
			int k=0;
			for (int j=i; j<(i+n); j++)
			{
				a[i][k]=j%n;
				k++;
			}

		}
		
		return a;			
	}
	
/*
 * counter-clock-wise cycle index 0 to n-1
 * Example n=4
 * 0 1 2 3
 * 3 0 1 2
 * 2 3 0 1
 * 1 2 3 0
 */	
	public static int[][] cycleCCW0toN_1(int n)
	{	
		int[][] a = new int[n][n];
		
		for (int j=0; j<n; j++)
		{
			a[0][j]=j;
		}
		
		for (int i=0; i<n-1; i++)
		{
			int k=0;
			for (int j=i; j<(i+n); j++)
			{
				a[n-1-i][k]=(j+1)%n;
				k++;
			}

		}
		
		return a;			
	}

		/** method to check if an integer x is power of n*/
		public static boolean isPowerOfn(int x, int n)
		{
		  if(x == 0)
		    return false;
		  while(x != 1)
		  {   
		   if(x%n != 0)
		      return false;
		    x = x/n;     
		  }
		  return true;
		} 
	
}

