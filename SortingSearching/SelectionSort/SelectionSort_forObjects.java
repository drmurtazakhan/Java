public class SelectionSort_forObjects
{
	public static int minimumPosition(Comparable[]  a, int from)
	{
		int minPos = from;
		for (int i = from + 1; i < a.length; i++)
		if (a[i].compareTo(a[minPos]) < 1) minPos = i;
		return minPos;
	}
	
	public static void sort(Comparable[] a)
	{
		Comparable temp=null;
		for (int i = 0; i < a.length - 1; i++)
		{
			int minPos = minimumPosition(a, i);
			if (minPos != i)
			{
				temp=a[minPos];
				a[minPos]=a[i];
				a[i]=temp;			
			}
		}
	}
} 
