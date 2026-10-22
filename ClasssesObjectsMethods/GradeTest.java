import java.io.*;
public class GradeTest
{	
	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Name : ");
		String name=stdin.readLine();
		
		System.out.print("Enter Department : ");
		String dept=stdin.readLine();
		
		System.out.print("Enter GPA : ");
		double gpa=Double.parseDouble(stdin.readLine());
		
		Grade s1= new Grade(name, dept, gpa);
		
		
				
		System.out.println("Grade  : "+s1.getGrade());		
		System.out.println("Remark :  "+s1.getRemark());		
	
	}
}
class Grade
{
	private String name;
	private String department;
	private double GPA;
	private String grade;
	private String remark;
	
	public Grade(String hisName, String hisDepartment, double hisGPA)
	{
		name=hisName;
		department=hisDepartment;
		GPA=hisGPA;
		gradingSystem();
	}
	
	public void gradingSystem()
	{
		if (GPA==4.0)
		{
			grade="A+";
			remark="Exceptional";
		}
		else if(GPA>=3.75)
		{
			grade="A";
			remark="Excellent";
		}
		else if(GPA>=3.5)
		{
			grade="B+";
			remark="Superior";
		}
		else if(GPA>=3.0)
		{
			grade="B";
			remark="Very Good";
		}
		else if(GPA>=2.5)
		{
			grade="C+";
			remark="Avove Average";
		}
		else if(GPA>=2.0)
		{
			grade="C";
			remark="Good";
		}
		else if(GPA>=1.5)
		{
			grade="D+";
			remark="High Pass";
		}
		else if(GPA>=1.0)
		{
			grade="D";
			remark="Pass";
		}
		else
		{
			grade="F";			
			remark="Fail";
		}
	}
	
	public String getGrade() // accessor
	{
		return grade;
	}
	public String getRemark() // accessor
	{
		return remark;
	}
}

