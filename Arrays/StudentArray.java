import java.io.*;
class Student
{	private String name;
	private int id;
	public Student(String name,int id)
	{	this.id = id;
		this.name = name;
	}		
	public static int findStudentIndex(Student[] s, String name)
	{	int index=-1;
		for (int i=0; i<s.length ; i++)
		if ( name.equals(s[i].name) )
		index=i;
		return index;
	}
	public String toString()
	{	return name+" "+id;
	}
}	
public class StudentArray
{	static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException
	{	Student[] s = new Student[4];
        s[0]=new Student("Majed",123);
        s[1]=new Student("Hashim",121);
        s[2]=new Student("Nasir",125);
        s[3]=new Student("Ali",124);
        for (int i=0; i<s.length ; i++)
        System.out.println(s[i]);
        System.out.print("Enter the name of student you are seraching: ");
        String name = stdin.readLine();
        int ind = Student.findStudentIndex(s,name);
        if (ind==-1)
        System.out.println(name+" is not found");
        else
        System.out.println(name+" is found at index "+ind);        
    }
}
