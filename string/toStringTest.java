class Student
{
	private String name;
	private int id;
	public Student (String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return(id+"-->"+name);
	}
	
}
public class toStringTest
{
	public static void main (String[] args)
	{
		Student s1=new Student("Ali",970321);
		Student s2=new Student("Abdullah",970321);
		String s=s1.toString()+s2.toString();
		System.out.println(s);
				
	}
}