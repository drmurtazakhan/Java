import java.io.*;
class Student
{
	private String name;
	private double totalQuizMark;
	private int countQuiz;

	public Student(String n)
	{
		name=n;		
	}
	public void addMarks(double quizMark)
	{
		totalQuizMark=totalQuizMark+quizMark;
		countQuiz++;		
	}
	public double computeAvg()
	{
		return totalQuizMark/countQuiz;		
	}
	public int quizCount()
	{
		return countQuiz;
	}
	public String getName()
	{
		return name;
	}	
}

public class StudentTest2
{
	public static void main(String args[]) throws IOException
	{
		
			Student s1 = new Student ("Umer");
			Student s2 = new Student ("Abdullah");
			
			s1.addMarks(2.3);
			s1.addMarks(2.7);
			s1.addMarks(1.0);
			
			s2.addMarks(2.5);
			s2.addMarks(2.7);
			
			System.out.println(s1.getName()+" has taken "+s1.quizCount()+" quizes "+" his avg is "+s1.computeAvg());			
			System.out.println(s2.getName()+" has taken "+s2.quizCount()+" quizes "+" his avg is "+s2.computeAvg());			
	}
}