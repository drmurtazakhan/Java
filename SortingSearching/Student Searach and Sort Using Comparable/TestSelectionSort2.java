public class TestSelectionSort2
{
	public static void main(String[] args)
	{
		Student2[] s = new Student2[5];
		s[0] = new Student2(995001, "Ibrahim", 3.5);
		s[1] = new Student2(966000, "Ahmad", 3.0);
		s[2] = new Student2(977000, "Umer", 2.4);
		s[3] = new Student2(212134, "Usman", 2.5);
		s[4] = new Student2(205489, "Khalid", 2.5);
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);		
		SelectionSort.selectionSort(s);
		System.out.println("\nSorted by name");
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);		
	}	
}