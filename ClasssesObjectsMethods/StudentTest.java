import java.io.*;
class Student
{
	private String name;
	private double totalQuizMark;
	private static final int NO_OF_QUIZ=4;

	public Student(String n)
	{
		name=n;		
	}
	public void addMarks(double quizMark)
	{
		totalQuizMark=totalQuizMark+quizMark;
	}
	public void displayRecord()
	{
		System.out.println("-----------------------------------------");
		System.out.println("Name of student: "+name);
		System.out.println("Total Quiz marks: "+totalQuizMark);
		System.out.println("Average Marks: "+totalQuizMark/NO_OF_QUIZ);
		System.out.println("-----------------------------------------");
	}
	
}

public class StudentTest
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader (reader);
		
		int studentCount;
		String studentName;
		double q1,q2,q3,q4;
				
		System.out.print("Enter Number of students: ");
		studentCount =Integer.parseInt(stdin.readLine());
		
		for (int k=1; k<=studentCount; k++)
		{
			System.out.print("Enter Name of studnt: ");
			studentName = stdin.readLine();
			
			System.out.print("Enter marks in Quiz 1: ");
			q1 = Double.parseDouble(stdin.readLine());
			
			System.out.print("Enter marks in Quiz 2: ");
			q2 = Double.parseDouble(stdin.readLine());
			
			System.out.print("Enter marks in Quiz 3: ");
			q3 = Double.parseDouble(stdin.readLine());
			
			System.out.print("Enter marks in Quiz 4: ");
			q4 = Double.parseDouble(stdin.readLine());
						
			Student s = new Student (studentName);
			s.addMarks(q1);
			s.addMarks(q2);
			s.addMarks(q3);
			s.addMarks(q4);
			s.displayRecord();		
		}		
	}
}