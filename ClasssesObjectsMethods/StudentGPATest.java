import java.io.*;
class StudentGPA
{	int idNumber;
	double gpa;
	String name;
	public StudentGPA(int idNumber, String name, double gpa)
	{	this.idNumber = idNumber;
		this.name=name;
		this.gpa = gpa;
	}
	public static double average(StudentGPA[] studentList)
    {  	double sum = 0;
    	for (int i=0; i<studentList.length; i++)
    	sum += studentList[i].gpa;
    	return sum/studentList.length;
    }   
    public String toString()
    {  	return idNumber+"\t"+name+"\t"+gpa;
    }
}	

public class StudentGPATest
{
	static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		int size,id;
		double gpa;
		String name;
        System.out.print("Enter number of students: ");
        size = Integer.parseInt(stdin.readLine());
        StudentGPA[] students = new StudentGPA[size];
        
        for (int i=0; i<size; i++)
    	{	System.out.println("\nEnter data for Record #: "+(i+1));
    		System.out.print("Enter Name : ");
    		name=stdin.readLine();
    		System.out.print("Enter ID  : ");
    		id = Integer.parseInt(stdin.readLine());
    		System.out.print("Enter GPA : ");
    		gpa = Double.parseDouble( stdin.readLine());
    		StudentGPA s = new StudentGPA(id,name,gpa);
    		students[i] =s;
    	}
    	System.out.println("----------------------------------------------------");
        for (int i=0; i<size; i++)
    	System.out.println(students[i]);    	
        double average = StudentGPA.average(students);
        System.out.println("Average GPA is "+average);
    }
}
