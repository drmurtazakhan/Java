import java.io.*;
import java.util.Arrays;
public class LinearSearch {
   public static int search(int[] a, int v) {
      for (int i = 0; i < a.length; i++) {
         if (a[i] == v)
            return i;
      }
      return -1;
   }
public static void main(String[] args) throws IOException {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
      int[] a = ArrayUtil.randomIntArray(20, 100);
      ArrayUtil.print(a);
      System.out.println("Enter number to search for:");
      int n = Integer.parseInt(console.readLine());
      int j = search(a, n);
      if (j != -1)
         System.out.println("Found in position " + j);
      else
         System.out.println(n + " not found");
   }
} 
