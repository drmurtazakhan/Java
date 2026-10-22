public class ArrayParameter2
{
	public static void main (String[] args)
	{
		int [] a={5, 8, 4, 7};
		int b=5;				
		fun(a,b);		
		System.out.println(b);
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+"\t");			
	}
	
	private static void fun(int[] x, int b)
	{
	    b=2;
		for (int i=0; i<4; i++)
			x[i]=x[i] + b++;		
	}
}
		
		