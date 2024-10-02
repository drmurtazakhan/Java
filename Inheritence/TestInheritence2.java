class Student
{
	private long id;
	private double gpa;
	private String name;
	public Student(long id, String name, double gpa) // constructor
	{
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public double getGPA()
	{
		return gpa;
	}
	public void print()
	{
		System.out.print(id+" "+name+ " "+gpa);
	}
	
}

class  ResearchAssistant extends Student
{
	private int workload;
	public  ResearchAssistant(long id, String name, double gpa, int workload)
	{
		super(id,name,gpa);
		this.workload=workload;
	}
	public void print()
	{
		super.print();
		System.out.print(" "+workload);
	}				
}

public class TestInheritence2
{
	
	 public static void main (String[] args)
	 {
	 	Student s = new Student(991234,"Ahmed",1.95);
	    ResearchAssistant ra = new ResearchAssistant(995678,"Imran", 3.45, 15);
	    s.print();
	    System.out.println(standing(s));
	    ra.print();
	    System.out.println(standing(ra));
	 	
	 }
	 static String standing(Student s)
	 {
	 	if (s.getGPA() <= 2.0)
	 	return " Warning";
		else
		return " Good Standing";
	}

}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
