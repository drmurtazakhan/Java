import java.util.Random;

public class Selectionsort_int_Test {
	
   public static void main(String[] args) {
      int[] a = {2, 10, 8, 12, 4};
      print(a);
      sort(a);
      print(a);
   }	
   
   public static void sort(int[] a) {
      for (int n = 0; n < a.length - 1; n++) {
         int minPos = minimumPosition(a, n);
         if (minPos != n)
         swap(a, minPos, n);
      }
   }
   
   public static int minimumPosition(int[] a, int from) {
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i] < a[minPos]) minPos = i;
      return minPos;
   }
   
   public static void print(int[] a){
	
		for (int i = 0; i < a.length; i++)
		System.out.print(a[i]+" ");
		System.out.println();
   }
   
   public static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
} 
 
