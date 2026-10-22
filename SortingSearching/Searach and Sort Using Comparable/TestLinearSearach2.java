import java.io.*;
public class TestLinearSearach2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		Student2[] s = new Student2[5];
		s[0] = new Student2(995001, "Ibrahim", 3.5);
		s[1] = new Student2(966000, "Ahmad", 3.0);
		s[2] = new Student2(977000, "Umer", 2.4);
		s[3] = new Student2(212134, "Usman", 2.5);
		s[4] = new Student2(205489, "Khalid", 2.5);
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);
		
		System.out.print("\nEnter name to search for:");
		Comparable v = new Student2(console.readLine());
		int j = linearSearch(s, v);
		if (j != -1)
		System.out.println("Found in position " + (j+1));
		else
		System.out.println("Not found");
	}
	public static int linearSearch(Comparable[] array, Object key)
	{
		for(int k = 0; k < array.length; k++)
		if(array[k].compareTo(key)==0)
		return k;
		return -1;
	}
}