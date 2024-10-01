import java.util.Random;

class InsertSort
{
	public static void sort(int[] a)
	{
		int current, i, j;
		for (i = 1; i < a.length; i++)
		{
			current = a[i];
			for (j = i; j>0 && current < a[j-1]; j--)
			a[j] = a[j-1];
			a[j] = current;
		}
	}	
} 
public class InsertSortTest
{
	public static void main(String[] args)
	{
		int[] a = randomIntArray(10, 100);
		print(a);
		InsertSort.sort(a);
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