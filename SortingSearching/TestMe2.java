public class TestMe2
{
	public static void main(String args[])
	{
		int[] a = {12, 11, 8, 13, 4, 15};       
		int[] b = new int [a.length];
		int[] d = new int [a.length];
		int current,j;
		for (int i = 1; i < a.length; i++)
		{
			current = a[i];
			for (j = i; j>0 && current < a[j-1]; j--)
			a[j] = a[j-1];
			a[j] = current;			
			
		}
		int c1,c2;
		c1=c2=0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]/2*2==a[i])
			{
				b[c1]=a[i];
				c1++;
			}
			else
			{
				d[c2]=a[i];
				c2++;
			}
		}
		print(b); // printing
		print(d); // printing
			
	}
	public static void print(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		System.out.print(a[i]+" ");
		System.out.println();
	}
}
