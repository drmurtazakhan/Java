import java.util.StringTokenizer;
import java.io.*;
public class StudentTest4
{	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		boolean flag=false;
		String name;
		int id;	
		int iQuantity;		
		Student obj=null;
		StringTokenizer tok;
		System.out.println("Enter records, press Q or q to exit");						
		String line=stdin.readLine();
		if (line.equalsIgnoreCase("Q")) flag=true;
		while(!flag)
		{   tok = new StringTokenizer(line);
			name=tok.nextToken();
			id=Integer.parseInt(tok.nextToken());
			int count=0;
			double quizTotal=0.0;
			while (tok.hasMoreTokens( ))
			{
				quizTotal+=Double.parseDouble(tok.nextToken());
				count++;
			}			
			obj= new Student(name, id, quizTotal,count);							
			System.out.println("Average: "+obj.average());				
			line=stdin.readLine();				
			if (line.equalsIgnoreCase("Q")) flag=true;
		}
		
	}
}
class Student
{	private String name;
	private int id;
	private double totalQuizMarks;
	private int quizCount;	
	public Student(String name, int id, double totalQuizMarks, int quizCount) 
	{
		this.name=name;
		this.id=id;
		this.totalQuizMarks=totalQuizMarks;
		this.quizCount=quizCount;
	}
	public Student(int id, String name, double totalQuizMarks, int quizCount) 
	{
		this(name, id, totalQuizMarks, quizCount); 		
	}
	
	public double average() //method
	{	return totalQuizMarks/quizCount;
	}
}