import java.io.*;
import java.util.Arrays;
public class StandardSearch {
   public static void main(String[] args) throws IOException {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));  
      int[] a = ArrayUtil.randomIntArray(20, 100);
      ArrayUtil.print(a);
      Arrays.sort(a);
      ArrayUtil.print(a);
      System.out.print("\nEnter n number to search for:");
      int j = Arrays.binarySearch(a, Integer.parseInt(console.readLine()));
      if (j != -1)    System.out.println("Found in position " + (j+1));
      else    System.out.println("element not found");
	  Student[] s = new Student[4];
      s[0] = new Student(977000, "Talal", 2.4);
      s[1] = new Student(988000, "Usman", 2.5);
      s[2] = new Student(999000, "Umar", 3.0);
      s[3] = new Student(955000, "Ibrahim", 3.5);
      Arrays.sort(s);
      for (int i = 0; i < s.length; i++)
         System.out.println(s[i]);
      System.out.print("\nEnter ID Number to search for:");
      Comparable v = new Student(Integer.parseInt(console.readLine()));
      j = Arrays.binarySearch(s, v);
      if (j != -1)
         System.out.println("Found in position " + (j+1));
      else
         System.out.println(v + " not found");
   }
} 
