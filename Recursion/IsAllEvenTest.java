import java.io.*; 
public class IsAllEvenTest
{
	public static void main(String args[]) throws IOException
	{
		int[] a={6,8,10,4};
		int n=a.length-1;
		System.out.println(allEven(a, n ));
	}
	public static boolean allEven(int[] a, int n)
	{
		if (n==0 && (a[n]/2*2==a[n]))
			return true;
		else if (!(a[n]/2*2==a[n]))
			return false;
		else
			return allEven(a, n-1);
		
	}
}
		
	