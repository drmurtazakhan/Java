import java.io.*;
import java.util.Arrays;
public class BinarySearch {  
   public static int binarySearch(int[] a, int from, int to, int v) {
   	  if (from > to)
         return -1;         
      int mid = (from + to) / 2;
      int diff = a[mid] - v;
      if (diff == 0) // a[mid] == v
         return mid;
      else if (diff < 0) // a[mid] < v 
         return binarySearch(a, mid + 1, to, v);
      else				// a[mid] > v 
         return binarySearch(a, from, mid - 1, v);
   }
  public static int search(int[] a, int v) {
      return binarySearch(a, 0, a.length - 1, v);
   }
public static void main(String[] args) throws IOException {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
   
     int[] a=ArrayUtil.randomIntArray(20, 100);
     Arrays.sort(a);
     ArrayUtil.print(a);
     System.out.println("Enter number to search for:");
     int n = Integer.parseInt(console.readLine());
     int j = search(a, n);
     if (j==-1)
     System.out.println("Not Found ");
     else
     System.out.println("Found in position " + j);
   }
} 
