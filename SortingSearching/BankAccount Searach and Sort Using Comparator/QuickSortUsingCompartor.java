import java.util.*;
public class QuickSortUsingCompartor
{
	public static void quickSort(Object[] array, Comparator comparator)
	{
		quickSort(array, 0, array.length - 1, comparator);
	}
	private static void quickSort(Object[] array, int low,int high, Comparator comparator)
	{
		if(low < high)
		{
			int pivotIndex = partition(array, low, high, comparator);
			quickSort(array, low, pivotIndex - 1, comparator);
			quickSort(array, pivotIndex + 1, high, comparator);
		}
	}
	private static int partition(Object[] array, int firstIndex,int lastIndex, Comparator comparator)
	{
		int middleIndex = (firstIndex + lastIndex)/2;
		Object pivotValue = array[middleIndex];
		/* Temporarily place pivotValue into first position of current partition */
		swap(array, firstIndex, middleIndex);
		int pivotIndex = firstIndex;
		int index = firstIndex + 1;
		while(index <= lastIndex)
		{
			if(comparator.compare(array[index], pivotValue) < 0)
			{
				++pivotIndex;
				swap(array, pivotIndex, index);
			}
			index++;
		}
		// Return pivotValue to partition point
		swap(array, firstIndex, pivotIndex);
		return pivotIndex;
	}
	private static void swap(Object[] array, int firstIndex, int pivotIndex)
	{
		Object temp;
		temp = array[firstIndex];
		array[firstIndex] = array[pivotIndex];
		array[pivotIndex] = temp;
	}
}
