class Student
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
	static String standing(Student s) // method
	{
		if (s.getGPA() <= 2.0)
		return "Under Warning";
		else
		return "Good Standing";
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

public class TestInheritence
{
	
	 public static void main (String[] args)
	 {
	 	Student s1 = new Student("991234" , 3.05);
	 	RA r1= new RA("995678" , 3.25 , 15);
	 	s1.print();
	 	System.out.println(Student.standing(s1));
	 	r1.print();
	 	System.out.println(Student.standing(r1));
	 	
	 	Student s2=r1; // upcasting
	 	System.out.println(s2.getClass());
	 	System.out.println(r1.getClass());
	 	
	 	System.out.println(r1 instanceof Student);
	 	System.out.println(r1 instanceof RA);
	 	System.out.println(s2 instanceof Student);
	 	System.out.println(s2 instanceof RA);
	 	
	 	
	 	Student s3 = new Student("994434" , 3.00);;
	 	
	 	System.out.println(s3 instanceof Student);
	 	System.out.println(s3 instanceof RA);
	 	
	 	System.out.println(s3 instanceof Object);
	 	
	 }
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
