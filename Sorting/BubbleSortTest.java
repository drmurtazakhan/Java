import java.util.Random;
class BubbleSort
{
	
	public static void sort(int[] a)
	{
		int n = a.length;
		for (int pass=1; pass < n; pass++) // count how many times
		{
			// This next loop becomes shorter and shorter
			for (int i=0; i < n-pass; i++)
			{
				if (a[i] > a[i+1])
				{
					// exchange elements
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			} 
		}
	}	   	
} 

public class BubbleSortTest
{
	public static void main(String[] args)
	{
		int[] a = randomIntArray(10, 100);
		print(a);
		BubbleSort.sort(a);
		print(a);
	}

   public static int[] randomIntArray(int length, int n) {
      int[] a = new int[length];
      Random generator = new Random();
      
      for (int i = 0; i < a.length; i++)
         a[i] = generator.nextInt(n);
      
      return a;
   }	
	
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }	
}