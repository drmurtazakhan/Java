class QuickSort
{	public static int partition(int[] a, int left, int right, int pivot)
	{	do
		{	while(a[left] < pivot)
			left++;
			while(a[right] > pivot)
			right--;
			if(left < right)
			{	swap(a, left, right);
                left++;
                right--;
            }
            else if(left == right)
            left++;
         }while(left <= right);
          return right;
     }
     public static void quickSort(int[] a, int from, int to)
     { 	if (to <= from)
      	return;
      	int left = from; 
      	int right = to;
      	int pivot = a[(from + to)/2];
      	int newRight = partition(a, left, right, pivot);
      	int newLeft = newRight + 1; 
      	ArrayUtil.print(a); // this step is added
      	if(from < newRight)
      	quickSort(a, from, newRight);
      	if(newLeft < to)
      	quickSort(a, newLeft, to);
      }
      public static void sort(int[] a)
      {	quickSort(a, 0, a.length - 1);
      }
      public static void swap(int[] a, int i, int j)
      {	int temp = a[i];
      	a[i] = a[j];
      	a[j] = temp;
      }
} 
public class QuickSortTest2
{	public static void main(String[] args)
	{	int[] a = {22,	20,	75,	45,	55,	85};
		//int[] a = {2,	4,	5,	6,	8,	10};
		QuickSort.sort(a);		
	}
} 