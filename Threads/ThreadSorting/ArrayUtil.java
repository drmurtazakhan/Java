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
public static void swap(String[] a, int i, int j) {
      String temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }   
public static void print(int[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
   }
public static void print(String[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
   }   
   
}