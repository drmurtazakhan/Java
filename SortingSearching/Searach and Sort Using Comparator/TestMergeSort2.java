public class TestMergeSort2
{
	public static void main(String[] args)
	{
		Student3[] s = new Student3[5];
		Student3 stuObject = new Student3();
		s[0] = new Student3(995001, "Ibrahim", 3.5);
		s[1] = new Student3(966000, "Ahmad", 3.0);
		s[2] = new Student3(977000, "Umer", 2.4);
		s[3] = new Student3(212134, "Usman", 2.5);
		s[4] = new Student3(205489, "Khalid", 2.5);
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);		
		MergeSortUsingCompartor.mergeSort(s,stuObject);
		System.out.println("\nSorted by name");
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);		
	}	
}