import java.util.Random;
class ArrayUtil {
	public static int[] randomIntArray(int length, int n) {
      int[] a = new int[length];
      Random generator = new Random();
      
      for (int i = 0; i < a.length; i++)
         a[i] = generator.nextInt(n);
      
      return a;
    }
	public static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
   
      
	public static void print(int[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
    }  
}

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
		int[] a = ArrayUtil.randomIntArray(10, 100);
		ArrayUtil.print(a);
		InsertSort.sort(a);
		ArrayUtil.print(a);
	}
}