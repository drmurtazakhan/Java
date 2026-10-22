import java.io.*;
public class MatrixAddition
{
    public static void main(String[ ] args) throws IOException
    {
    	InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
    	
    	System.out.println("Addition of Two Matrices");
    	System.out.println("------------------------");
    	
    	System.out.print("Enter Number of rows : ");
    	int row = Integer.parseInt(stdin.readLine());
    	System.out.print("Enter Number of columns : ");
    	int col = Integer.parseInt(stdin.readLine());
    	
    	double [][] a = new double[row][col];
    	double [][] b = new double[row][col];
    	double [][] c = new double[row][col];
    	
    	System.out.println("Enter elements of first matrix :");			
    	for (int i=0; i<a.length; i++)
    	for (int j=0; j<a[i].length; j++)
    	{
    		System.out.print("row "+(i+1)+" col "+(j+1)+": ");			
    		a[i][j]=Double.parseDouble(stdin.readLine());
    	}
    	
    	System.out.println("Enter elements of second matrix :");			
    	for (int i=0; i<a.length; i++)
    	for (int j=0; j<a[i].length; j++)
    	{
    		System.out.print("row "+(i+1)+" col "+(j+1)+": ");			
    		b[i][j]=Double.parseDouble(stdin.readLine());
    	}
    	
    	c = FindMatrixSum(a,b);
    	System.out.println("Sum of two matrices :");			
    	for (int i=0; i<a.length; i++)
    	{
    		for (int j=0; j<a[i].length; j++)
    		System.out.print(c[i][j]+"\t");
    		System.out.println();
    	}
    }
    	
    	static double[][] FindMatrixSum(double[][] a, double [][] b)
    	{
    		double [][] sumArray = new double[a.length][a[0].length];
    		for (int i=0; i<a.length; i++)
    		for (int j=0; j<a[i].length; j++)
    		sumArray[i][j]=a[i][j]+b[i][j];    
    		return sumArray;			
    	}   	
    
}