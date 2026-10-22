import java.util.Random;

class SelectSort {
   public static int minimumPosition(int[] a, int from) {
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i] < a[minPos]) minPos = i;
      return minPos;
   }
   public static void sort(int[] a) {
      for (int n = 0; n < a.length - 1; n++) {
         int minPos = minimumPosition(a, n);
         if (minPos != n)
            ArrayUtil.swap(a, minPos, n);
      }
   }
} 
public class SelectSortTest {
   public static void main(String[] args) {
     int[] a = ArrayUtil.randomIntArray(10, 50);
      ArrayUtil.print(a);
      SelectSort.sort(a);
      ArrayUtil.print(a);
   }
} 
