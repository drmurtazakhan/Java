class InsertSort
{	public static void sort(int[] a)
	{	int current, i, j;
		for (i = 1; i < a.length; i++)
		{	current = a[i];
			for (j = i; j>0 && current < a[j-1]; j--)
			a[j] = a[j-1];
			a[j] = current;
			ArrayUtil.print(a);
		}
	}
} 
public class InsertSortStepTest
{	public static void main(String[] args)
	{	//int[] a = {28,	16,	20,	18,	12, 24};
		  //int[] a = {8,	2, 6, 14, 10, 12, 7};
		  int[] a = {16,3,10,11,10,15,7};
		InsertSort.sort(a);		
	}
}