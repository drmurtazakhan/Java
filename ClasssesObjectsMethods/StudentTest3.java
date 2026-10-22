import java.io.*;
class Student
{
	private String name;
	private double totalQuizMark;
	private int quizCount;

	public Student(String n)
	{	name=n;		
	}
	public void addMarks(double quizMark)
	{
		totalQuizMark=totalQuizMark+quizMark;
		quizCount++;		
	}
	public double computeAvg()
	{
		return totalQuizMark/quizCount;		
	}
}

public class StudentTest3
{	public static void main(String args[]) throws IOException
	{		
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter name of student? ");
			String name=stdin.readLine();
			System.out.print("Enter number of Quizzes student took? ");
			int n=Integer.parseInt(stdin.readLine());
			Student s1 = new Student (name);
			for (int i=0; i<n; i++)
			{	System.out.print("Enter marks in Quiz#"+(i+1)+" ");
				double marks=Integer.parseInt(stdin.readLine());
				s1.addMarks(marks);
			}
			System.out.println("Average is "+s1.computeAvg());						
	}
}