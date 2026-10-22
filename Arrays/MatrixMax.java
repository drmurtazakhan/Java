import java.io.*; 
public class MatrixMax 
{
    public static void main(String[ ] args) throws IOException 
    {
    	InputStreamReader reader = new InputStreamReader(System.in); 
    	BufferedReader stdin = new BufferedReader(reader); 
        
        System.out.print("Enter Number of rows : "); 
        int row = Integer.parseInt(stdin.readLine()); 
        
        System.out.print("Enter Number of columns : "); 
        int col = Integer.parseInt(stdin.readLine()); 
        double [][] a = new double[row][col]; 
        
        System.out.println("Enter elements of matrix :");
        for (int i=0; i<a.length; i++) 
        for (int j=0; j<a[i].length; j++) 
        { 
        	System.out.print("row "+(i+1)+" col "+(j+1)+": ");
        	a[i][j]=Double.parseDouble(stdin.readLine()); 
        } 
        double max=FindMax(a);
        System.out.println("The maximum element of the matrix is: "+max);
    }
    public static double FindMax(double[][] a)
    {
    	double mymax=a[0][70];
    	for (int i=0; i<a.length; i++) 
        for (int j=0; j<a[i].length; j++) 
        { 
        	if (a[i][j]>mymax)
        	mymax=a[i][j];
        }
        return mymax;
    }
}
