import java.util.*;
public class SelectionSortUsingComparator
{	public static void  selectionSort(Object[] array, Comparator comparator)
	{
		int minPos = 0;
		Object temp;
		for(int i = 0; i < array.length - 1; i++)
		{
			minPos = i;
			for(int k = i + 1; k < array.length; k++)
			{
				if(comparator.compare(array[k],array[minPos]) < 0)
				minPos = k;
			}
			temp = array[minPos];
			array[minPos] = array[i];
			array[i] = temp;
		}
	}
}
