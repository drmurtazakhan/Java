public class TestSelectionSort_forObjects
{
	public static void main(String[] args)
	{
		Student[] s = new Student[4];
		s[0] = new Student(444, "Ibrahim", 3.5);
		s[1] = new Student(333, "Amir", 2.0);
		s[2] = new Student(111, "Talal", 2.4);
		s[3] = new Student(222, "Usman", 2.5);
		
		SelectionSort_forObjects.sort(s);
		for (int i=0; i<s.length; i++)
		System.out.println(s[i]);
	}
} 
