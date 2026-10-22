class MergeSort
{	public static void mergeSort(int[] a,int from,int to)
	{	System.out.println("from "+from+ " to "+to);
		if (from == to) return;
		int mid = (from + to) / 2;
		mergeSort(a, mid + 1, to); // recursive call to split right part
		mergeSort(a, from, mid);   // recursive call to split left part
		
	}
	public static void sort(int[] a)
	{	mergeSort(a, 0, a.length - 1);
	}
} 
public class checkSplitofArrayinMergeSort
{	public static void main(String[] args)
	{	int[] a = {12, 5, 7, 11, 8, 6};
		MergeSort.sort(a);
	}
} 

