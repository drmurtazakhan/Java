abstract class Student
{
	private String id;
	private double gpa;
	public Student(String id, double gpa) // constructor
	{
		this.id = id;
		this.gpa = gpa;
	}
	public double getGPA()
	{
		return gpa;
	}
	public void print()
	{
		System.out.println(id);
		System.out.println(gpa);
	}
}

class RA extends Student
{
	private int workload;
	public RA(String id, double gpa, int workload)
	{
		super(id,gpa);
		this.workload=workload;
	}
	public void print()
	{
		super.print();
		System.out.println(workload);
	}				
}

public class TesAbstractClassInheritence
{	
	 public static void main (String[] args)
	 {
	 	
	 	RA r1= new RA("995678" , 3.25 , 15);
	 	r1.print();	 	
	 }
}
