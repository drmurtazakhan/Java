import java.io.*;
import java.util.Arrays;
public class SearchAllIndices
{
	public static int[] search(int[] x, int v)
	{
		int[] y = new int[x.length];
		for (int i=0; i<x.length; i++)
		{
			if (x[i]==v)
			y[i]=1;
		}
		return y;
    }
   public static void main(String[] args) throws IOException
   {
   		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
   		int[] a = ArrayUtil.randomIntArray(10, 13);
   		int[] b = new int[a.length];
   		System.out.println("Input Array: ");
   		ArrayUtil.print(a);
   		System.out.print("Enter number to search for:");
   		int n = Integer.parseInt(console.readLine());
   		b= search(a, n);
   		System.out.println("Output Array: ");
   		ArrayUtil.print(b);   		
   	}
} 
