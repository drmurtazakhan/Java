import java.util.Arrays;
import java.io.*;
public class TestStandardSort2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		Student2[] s = new Student2[5]; 
		
		s[0] = new Student2(977000, "Umer", 2.4);
		s[1] = new Student2(966000, "Ahmad", 3.0);		
		s[2] = new Student2(205489, "Khalid", 2.5);
		s[3] = new Student2(995001, "Osman", 3.5);						
		s[4] = new Student2(212134, "Ibrahim", 2.5);
		
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);
		
		Arrays.sort(s);
		System.out.println("-----------------------------");
		for (int i = 0; i < s.length; i++)
		System.out.println(s[i]);

		
	}
	

}