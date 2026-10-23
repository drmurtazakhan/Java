import java.io.*;
public class WhichGrade
{
	public static void main(String[ ] args) throws IOException
	{
	    BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
	    System.out.println("Enter marks:") ;
	    String  line  =  stdin.readLine( ) ;
	    int marks=Integer.parseInt(line);
	    if (marks>=90)
	    System.out.println("Your grade is : A+");
	    else if (marks>=85) 
	    System.out.println("Your grade is : A");
	    else if (marks>=80) 
	    System.out.println("Your grade is : B+");
	    else if (marks>=75) 
	    System.out.println("Your grade is : B");
	    else if (marks>=65) 
	    System.out.println("Your grade is : C+");
	    else if (marks>=60) 
	    System.out.println("Your grade is : C");
	    else if (marks>=55) 
	    System.out.println("Your grade is : D+");
	    else if (marks>=50) 
	    System.out.println("Your grade is : D");
	    else
	    System.out.println("Your grade is : F");
	    
	}
}

