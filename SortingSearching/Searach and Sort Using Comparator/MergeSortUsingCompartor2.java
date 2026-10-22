import java.util.*;
class MergeSortUsingCompartor2
{
	public static void merge(Object[] a,  int low, int mid, int high, Comparator comparator)
	{
		int n = high - low + 1;
		Object[]b = new Object[n];
		int i1 = low;
		int i2 = mid + 1;
		int j = 0;  
		while (i1 <= mid && i2 <= high)
		{
			if (comparator.compare(a[i1],a[i2]) < 0)			
			{
				b[j] = a[i1];
				i1++;
			}
			else
			{
				b[j] = a[i2];
				i2++;
			}
			j++;
		}
		while (i1 <= mid)
		{
			b[j] = a[i1];
			i1++;
			j++;
		}
		while (i2 <= high)
		{
			b[j] = a[i2];
			i2++;
			j++;
		}
		for (j = 0; j < n; j++)
		a[low + j] = b[j];
	}
	private static void mergeSort(Object[] array, int low, int high, Comparator comparator)
	{
		if(high > low)
		{
			int mid = (low + high)/2;
			mergeSort(array, low, mid, comparator);
			mergeSort(array, mid + 1, high, comparator);
			merge(array, low, mid, high, comparator);
		}
	}
	public static void mergeSort(Object[] array, Comparator comparator)
	{
		mergeSort(array, 0, array.length - 1, comparator);
	}
}