// This java program uses ArrayUtil.class 

class QuickSort extends Thread
{
	int[] qArray;
	public QuickSort(int[] a)
	{
		qArray=a;
	}		
	public void run()
	{
		
		QuickSort.sort(qArray);
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
	int[] b;
	public InsertSort(int[] a)
	{
		b=a;
	}
	public void run()
	{
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

public class SortingAlgorithmThreads2
{
	public static void main(String args[])
	{		
		int[] a=randomArray();
		InsertSort i = new InsertSort(a);
		i.start();
		QuickSort q = new QuickSort(a);
		q.start();
				
	}
	public static int[] randomArray()
	{
		int[] a =ArrayUtil.randomIntArray(10000, 10000);
		return a;
	}
	
		
}