public class TestSelectionSort
{
	public static void main(String[] args)
	{
		Student[] s = new Student[5];
		s[0] = new Student(995001, "Ibrahim", 3.5);
		s[1] = new Student(966000, "Ahmad", 3.0);
		s[2] = new Student(977000, "Umer", 2.4);
		s[3] = new Student(212134, "Usman", 2.5);
		s[4] = new Student(205489, "Khalid", 2.5);
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);		
		SelectionSort.selectionSort(s);
		System.out.println("\nSorted by IDs");
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);		
	}	
}