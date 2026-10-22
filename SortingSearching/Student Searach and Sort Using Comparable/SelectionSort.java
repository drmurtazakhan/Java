public class SelectionSort
{	public static void  selectionSort(Comparable[] array)
	{
		int minPos = 0;
		Comparable temp;
		for(int i = 0; i < array.length - 1; i++)
		{
			minPos = i;
			for(int k = i + 1; k < array.length; k++)
			{
				if(array[k].compareTo(array[minPos]) < 0)
				minPos = k;
			}
			temp = array[minPos];
			array[minPos] = array[i];
			array[i] = temp;
		}
	}
}
