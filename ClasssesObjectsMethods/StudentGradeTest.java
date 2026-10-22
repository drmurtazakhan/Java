import java.io.*;
class StudentGrade
{
	int idNumber;
	double gpa;
	
	public StudentGrade(int idNumber, double gpa)
	{
		this.idNumber = idNumber;
		this.gpa = gpa;
	}
	public void print()
	{
		System.out.println(idNumber+"\t"+gpa);
	}
	public static double average(StudentGrade[] studentList)
    {
    	double sum = 0;
    	for (int i=0; i<studentList.length; i++)
    	sum += studentList[i].gpa;
    	return sum/studentList.length;
    }   
}	

public class StudentGradeTest
{
	static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		int size,id;
		double gpa;
        System.out.print("Enter number of students: ");
        size = Integer.parseInt(stdin.readLine());
        StudentGrade[] students = new StudentGrade[size];
        
        for (int i=0; i<size; i++)
    	{
    		System.out.print("ID  : ");
    		id = Integer.parseInt(stdin.readLine());
    		System.out.print("GPA : ");
    		gpa = Double.parseDouble( stdin.readLine());
    		StudentGrade s = new StudentGrade(id, gpa);
    		students[i] =s;
    	}
                
        double average = StudentGrade.average(students);
        System.out.println("The Average GPA is "+average);
    }
}
