class QuickSort extends Thread
{
	public void run()
	{
		int[] a = ArrayUtil.randomIntArray(10000, 500);
		QuickSort.sort(a);
		System.out.println("Quick Sort Terminated");		
	}
	public static int partition(int[] a, int left, int right, int pivot)
	{
		do
		{
			while(a[left] < pivot)
			left++;
			while(a[right] > pivot)
			right--;
			if(left < right)
			{
				swap(a, left, right);
                left++;
                right--;
            }
            else if(left == right)
            left++;
          }while(left <= right);
          return right;
      }
      public static void quickSort(int[] a, int from, int to)
      {
      	if (to <= from)
      	return;
      	int left = from; 
      	int right = to;
      	int pivot = a[(from + to)/2];
      	int newRight = partition(a, left, right, pivot);
      	int newLeft = newRight + 1; 
      	if(from < newRight)
      	quickSort(a, from, newRight);
      	if(newLeft < to)
      	quickSort(a, newLeft, to);      	
      }
      public static void sort(int[] a)
      {
      	quickSort(a, 0, a.length - 1);
      }
      public static void swap(int[] a, int i, int j)
      {
      	int temp = a[i];
      	a[i] = a[j];
      	a[j] = temp;
      }
} 

class InsertSort extends Thread
{
	public void run()
	{
		int[] b = ArrayUtil.randomIntArray(10000, 500);
		InsertSort.sort(b);
		System.out.println("Insertion Sort Terminated");		
	}
	public static void sort(int[] b)
	{
		int current, i, j;
		for (i = 1; i < b.length; i++)
		{
			current = b[i];
			for (j = i; j>0 && current < b[j-1]; j--)
			b[j] = b[j-1];
			b[j] = current;
		}
	}
} 

public class SortingAlgorithmThreads
{
	public static void main(String args[])
	{		
		InsertSort i = new InsertSort();
		i.start();
		QuickSort q = new QuickSort();
		q.start();				
	}
}