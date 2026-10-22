import java.io.*;
public class TestBinarySearach
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		Student[] s = new Student[5]; 
		// data should be sorted according to key field
		s[0] = new Student(205489, "Khalid", 2.5);
		s[1] = new Student(212134, "Usman", 2.5);
		s[2] = new Student(966000, "Ahmad", 3.0);
		s[3] = new Student(977000, "Umer", 2.4);
		s[4] = new Student(995001, "Ibrahim", 3.5);						
		
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);
		
		System.out.print("\nEnter ID Number to search for:");
		Comparable v = new Student(Integer.parseInt(console.readLine()));
		int j = search(s, v);
		if (j != -1)
		System.out.println("Found in position " + (j+1));
		else
		System.out.println("Not found");
	}
	
	public static int search(Comparable[] a, Comparable v)
	{
		return binarySearch(a, 0, a.length - 1, v);
	}
	public static int binarySearch(Comparable[] a, int from, int to, Comparable v)
	{
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
}