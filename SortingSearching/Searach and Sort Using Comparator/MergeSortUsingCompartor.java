import java.util.*;
class MergeSortUsingCompartor
{
	private static void merge(Object[] array,int leftLowIndex,
	int leftHighIndex,int rightLowIndex,int rightHighIndex, Comparator comparator)
	{
		int low = leftLowIndex;
		int index = leftLowIndex;
		Object[] tempArray = new Object[array.length];
		while(leftLowIndex <= leftHighIndex && rightLowIndex <= rightHighIndex)
		{
			if(comparator.compare(array[leftLowIndex], array[rightLowIndex]) < 0)
			tempArray[index++] = array[leftLowIndex++];
			else
			tempArray[index++] = array[rightLowIndex++];
		}
		while(leftLowIndex <= leftHighIndex)
		tempArray[index++] = array[leftLowIndex++];

		while(rightLowIndex <= rightHighIndex)
		tempArray[index++] = array[rightLowIndex++];

		for(int k = low; k <= rightHighIndex; k++)
		array[k] = tempArray[k];
	}
	
	public static void mergeSort(Object[] array, Comparator comparator)
	{
		mergeSort(array, 0, array.length - 1, comparator);
	}
	
	private static void mergeSort(Object[] array, int low, int high, Comparator comparator)
	{
		if(high > low)
		{
			int mid = (low + high)/2;
			mergeSort(array, low, mid, comparator);
			mergeSort(array, mid + 1, high, comparator);
			merge(array, low, mid, mid + 1, high, comparator);
		}
	}
}