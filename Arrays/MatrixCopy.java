import java.io.*;
public class MatrixCopy
{
    public static void main(String[ ] args) throws IOException
    {
    	InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
    	    	 	
    	int [][] a = new int[3][2];
    	int [][] b = new int[2][3];
    	
    	System.out.println("Enter elements of matrix :");			
    	for (int i=0; i<a.length; i++)
    	for (int j=0; j<a[i].length; j++)
    	{
    		System.out.print("row "+(i+1)+" col "+(j+1)+": ");			
    		a[i][j]=Integer.parseInt(stdin.readLine());
    	}
    	 
    	for (int i=0; i<a.length; i++)
    	for (int j=0; j<a[i].length; j++)
    	{
    		
    		b[j][i]=a[i][j];
    	}
    	System.out.println("Matrix a ");			
    	for (int i=0; i<a.length; i++)
    	{
    		for (int j=0; j<a[i].length; j++)
    		System.out.print(a[i][j]+"\t");
    		System.out.println();
    	}
    	System.out.println("Matrix b ");			
    	for (int i=0; i<b.length; i++)
    	{
    		for (int j=0; j<b[i].length; j++)
    		System.out.print(b[i][j]+"\t");
    		System.out.println();
    	}
    }
}