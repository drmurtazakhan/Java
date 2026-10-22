public class TestMe
{
	public static void main(String args[])
	{
		//int[] a = {22, 10, 17, 6, 8, 9};
		int[] a = {15, 10, 17, 7, 9, 11};
		int current,j;
		for (int i = 1; i < a.length; i++)
		{
			current = a[i];
			for (j = i; j>0 && current < a[j-1]; j--)
			a[j] = a[j-1];
			a[j] = current;
			print(a); // printing is here
		}		
	}
	public static void print(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		System.out.print(a[i]+" ");
		System.out.println();
	}
}
