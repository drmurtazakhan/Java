public class TestPassArraybyReference
{	public static void main ( String[] args ) 
	{
		int[] ar1 =  { 1, 2, 3, 4, 5, 6, 7, 8 };    
		ArrayOps.print( ar1 );		
		System.out.println("Average "+ArrayOps.average( ar1 ));
		ArrayOps.square( ar1 );
		ArrayOps.print( ar1 );
	}

}   
class ArrayOps
{
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
	public static void square(int[] x )
	{
		for ( int i=0; i<x.length; i++)
		x[i]=x[i]*x[i];
	}  
	public static double average(int[] x )
	{
		double sum=0.0;
		for ( int i=0; i<x.length; i++)
		sum+=x[i];
		return sum/x.length;		
	}
	
}