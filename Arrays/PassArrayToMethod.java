public class PassArrayToMethod
{
	public static void main ( String[] args ) 
	{
		int[] ar1 =  { -20, 19, 1, 5, -1, 27, 19, 5 };    
		
		/* call the print() method to print array elements*/
		ArrayOps.print(ar1 );
		
		/* call the findMax() method to find max value element */
		int max=ArrayOps.findMax(ar1);   
		System.out.println("The max value element in the array is "+max);    
	}

}    

class ArrayOps
{
	/* the parameter x refers to passed arry*/
	public static void print( int[] x ) 
	{
		for ( int i=0; i<x.length; i++)
		System.out.print( x[i] + " " );
		System.out.println();
	}
	public static int findMax(int[] x )
	{
		int max=x[0];
		for ( int i=1; i<x.length; i++)
		max=Math.max(max,x[i]);
		return max;
	}  
}