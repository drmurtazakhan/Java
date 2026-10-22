import java.io.*;
public class BinarySearchMajor2 {  
   public static int binarySearch(int[] a, 
      int from, int to, int v) {
      if (from > to)
         return -1;         
      int mid = (from + to) / 2;
      int diff = a[mid] - v;
      if (diff == 0) // a[mid] == v
         return mid;
      else if (diff < 0) // a[mid] < v 
         return binarySearch(a, mid + 1, to, v);
      else
         return binarySearch(a, from, mid - 1, v);
   }
  public static int search(int[] a, int v) {
      return binarySearch(a, 0, a.length - 1, v);
   }
public static void main(String[] args) throws IOException {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
   
     int[] a={10, 5, 7, 18, 12, 6, 13, 22};
     
     ArrayUtil.print(a);
     System.out.println("Enter number to search for:");
     int n = Integer.parseInt(console.readLine());
     int j = search(a, n);
     System.out.println("Found in position " + j);
   }
} 
