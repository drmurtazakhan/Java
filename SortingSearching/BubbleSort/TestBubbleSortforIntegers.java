public class TestBubbleSortforIntegers
{	public static void main(String[] args)
	{	//int[] a = {23, 30, 33, 26, 16, 9};
		int[] a = {17, 23, 27, 20, 10, 4};
		//int[] a = {6,3,18,11,10,15,7};
		bubbleSort(a);
	}
	public static void bubbleSort(int[] array)
	{	int pass = 1;
		int temp;
		boolean sorted;
		do
		{	sorted = true;
			for(int m = 1; m <= array.length - pass; m++)
			{	if(array[m] < array[m-1]) 
				{	temp   = array[m-1];
					array[m-1] = array[m];
					array[m]   = temp;
					sorted = false; 			
				}
			}
			pass++;
			for (int i=0; i<array.length; i++) // to print array...
			System.out.print(array[i]+" ");    // after each pass 
			System.out.println();  // blank line
		}while(! sorted);
	}
}
