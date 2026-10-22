import java.io.*;
class Student implements Comparable {
     private int iDNumber;
     private String name;
     private double gPA;
   
     public Student(int iDNumber, String name, double gPA) {
     	this.iDNumber = iDNumber;
     	this.name = name;
     	this.gPA = gPA;
     }
   	
	  	
   public String toString() {
       return iDNumber+"\t"+name+"\t"+gPA;
   }
public int compareTo(Object other) {
           Student s = (Student) other;
           if (iDNumber < s.iDNumber)
           return -1;
           else if (iDNumber > s.iDNumber)
           return 1;
           else
           return 0;           
   }    
} 

public class ComparableSearch2 {
   public static int binarySearch(Comparable[] a, 
      int from, int to, Comparable v) {
      if (from > to)
         return -1;
      int mid = (from + to) / 2;
      int diff = a[mid].compareTo(v);
      if (diff == 0) // a[mid] == v
         return mid;
      else if (diff < 0) // a[mid] < v 
         return binarySearch(a, mid + 1, to, v);
      else
        return binarySearch(a, from, mid - 1, v);
   }   
   public static int search(Comparable[] a, Comparable v) {
      return binarySearch(a, 0, a.length - 1, v);
   }
public static void main(String[] args) throws IOException {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
      Student[] s = new Student[4];
      s[0] = new Student(955000, "Ibrahim", 3.5);
      s[1] = new Student(966000, "Amir", 2.0);
      s[2] = new Student(977000, "Talal", 2.4);
      s[3] = new Student(988000, "Usman", 2.5);
for (int i = 0; i < s.length; i++)
             System.out.println(s[i]);
      System.out.print("\nEnter ID Number to search for:");
      Comparable v = new Student(Integer.parseInt(console.readLine()));
      int j = search(s, v);
      if (j != -1)
         System.out.println("Found in position " + (j+1));
      else
         System.out.println(v + " not found");
   }} 
