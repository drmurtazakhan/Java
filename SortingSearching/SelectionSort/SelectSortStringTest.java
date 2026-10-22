import java.util.Random;
class SelectSortString {
   public static int minimumPosition(String[] a, int from) {
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i].compareTo(a[minPos]) < 0 ) minPos = i;
      return minPos;
   }
   public static void sort(String[] a) {
      for (int n = 0; n < a.length - 1; n++) {
         int minPos = minimumPosition(a, n);
         if (minPos != n)
            ArrayUtil.swap(a, minPos, n);
      }
   }
} 
public class SelectSortStringTest {
   public static void main(String[] args) {
     String[] a = {"Majed", "Ahmad", "Ali", "Zahid"};
      ArrayUtil.print(a);
      SelectSortString.sort(a);
      ArrayUtil.print(a);
   }
} 
