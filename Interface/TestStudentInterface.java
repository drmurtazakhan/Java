interface I1
{
	String getName();
	int getID();
	
}

class Student implements I1
{
	String name;
	int id;
	public Student(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}	
}

public class TestStudentInterface
{
	public static void main(String args[])
	{
		I1 s1= new Student ("Omar", 208769);
		I1 s2= new Student ("Saeed",201769);
		System.out.println(s1.getName()+" "+s1.getID());
		System.out.println(s2.getName()+" "+s2.getID());
	}
}

