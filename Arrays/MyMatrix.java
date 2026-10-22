import java.io.*;
public class MyMatrix
{
    public static void main(String[ ] args) throws IOException
    {
    	InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
    	    	 	
    	int [][] a = new int[3][3];
    	
    	
    	System.out.println("Enter elements of matrix :");			
    	for (int i=0; i<a.length; i++)
    	for (int j=0; j<a[i].length; j++)
    	{
    		System.out.print("row "+(i+1)+" col "+(j+1)+": ");			
    		a[i][j]=Integer.parseInt(stdin.readLine());
    	}
    	    	    	
    	int count = countOdd(a);
    	System.out.println("Number of Odd Elements in the given Matrix are: "+count);			
    	
    }
    	
    	static int countOdd(int[][] a)
    	{
    		int oddCount=0;
    		for (int i=0; i<a.length; i++)
    		for (int j=0; j<a[i].length; j++)
    		if (a[i][j]/2*2!=a[i][j])
    		oddCount=oddCount+1;
    		return oddCount;			
    	}   	
    
}