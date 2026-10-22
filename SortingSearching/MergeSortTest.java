
class MergeSort
{
	public static void merge(int[] a,  int from,  int mid, int to)
	{
		int n = to - from + 1;
		int[] b = new int[n];
		int i1 = from;
		int i2 = mid + 1;
		int j = 0;  // next open position in b
		while (i1 <= mid && i2 <= to)
		{
			if (a[i1] < a[i2])
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
		while (i2 <= to)
		{
			b[j] = a[i2];
			i2++;
			j++;
		}
		for (j = 0; j < n; j++)
		a[from + j] = b[j];
	}
	public static void mergeSort(int[] a, int from, int to)
	{
		//System.out.println("from "+from+ " to "+to);
		if (from == to) return;
		int mid = (from + to) / 2;
		//System.out.println("from "+from+ " mid "+mid);
		mergeSort(a, from, mid);
		//System.out.println("mid+1 "+(mid+1)+ " to "+to);
		mergeSort(a, mid + 1, to);
		//System.out.println("mid+1= "+(mid+1) +" to= "+to);
		
		//System.out.println("Merge: "+"from "+from+" to "+to);
		merge(a, from, mid, to);
	}
	public static void sort(int[] a)
	{
		mergeSort(a, 0, a.length - 1);
	}
} 
public class MergeSortTest
{
	public static void main(String[] args)
	{
		//int[] a = ArrayUtil.randomIntArray(8, 50);
		int[] a = {26, 33, 35, 29, 19, 12};
		ArrayUtil.print(a);
		MergeSort.sort(a);
		ArrayUtil.print(a);
	}
} 

