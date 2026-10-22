import java.io.*;
import java.util.StringTokenizer;
public class TestStudent{
	public static void main(String args []) throws IOException {
		Student s;
		String line;
		StringTokenizer st;
		BufferedReader stdin = new BufferedReader( new FileReader("stuinput.txt"));
	System.out.println("****************************************************");
	System.out.println("Stu_ID	Major1	Major2	Final	Total	Letter Grade");
	System.out.println("****************************************************");
		line = stdin.readLine();
		while (line !=null) {
			st = new StringTokenizer(line);
			if(st.countTokens()==1)
				s = new Student(Integer.parseInt(st.nextToken()));
			else
				s = new Student(  Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken()));
			System.out.println(s.id+"\t"+s.m1+"\t"+s.m2+"\t"+s.f+"\t"+
							s.totalMarks()+"\t"+s.letterGrade());
			line = stdin.readLine();
		}
	}
}
class Student{
	int id, m1, m2, f;
	public Student(int id, int m1, int m2, int f) {
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.f  = f;
	}
	public Student(int id) {
		this(id,0,0,0);
	}
	public int totalMarks() {
		return m1+m2+f;
	}
	public char letterGrade() {
		int t = totalMarks();
		if(t>=85)
			return 'A';
		else if(t>=75)
			return 'B';
		else if(t>=60)
			return 'C';
		else if(t>=50)
			return 'D';
		else if(t>0)
			return 'F';
		else
			return 'W';
	}
}			
