import java.util.*;
import java.io.*;

class DuplicateCourseException extends Exception
{
	public DuplicateCourseException()
	{ }
	
	public DuplicateCourseException(String errorMessage)
	{
		super(errorMessage);
	}
}

class CourseNotFoundException extends Exception
{
	public CourseNotFoundException()
	{ }
	
	public CourseNotFoundException(String errorMessage)
	{
		super(errorMessage);
	}
}

class DuplicateObjectException extends Exception
{
	public DuplicateObjectException()
	{ }
	
	public DuplicateObjectException(String errorMessage)
	{
		super(errorMessage);
	}
}

class ObjectNotFoundException extends Exception
{
	public ObjectNotFoundException()
	{ }
	
	public ObjectNotFoundException(String errorMessage)
	{
		super(errorMessage);
	}
}
		
class Course
{
	private String courseCode;
	private int credits;
	
	public Course(String courseCode, int credits)
	{
		this.courseCode = courseCode;
		this.credits = credits;
	}
	
	public String getCourseCode()
	{
		return courseCode;
	}
	
	public int getCredits()
	{
		return credits;
	}
		
}


class Student
{
	private String name;
	private int idnumber;
	private double gpa;
	private LinkedList courses;
	
	public Student(String name, int idnumber, double gpa)
	{
		this.name = name;
		this.idnumber = idnumber;
		this.gpa = gpa;
		this.courses = new LinkedList();
	} 
	
	public Student(int idnumber)
	{ 
		this.idnumber = idnumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return idnumber;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	
	
	public boolean equals(Object that) {
		Student s = (Student) that;
		return  (idnumber == s.getID()); 
	}
	
	public void addCourse(Course course) throws DuplicateCourseException
	{


	
	}

	public void deleteCourse(Course course) throws CourseNotFoundException
	{


	
	}
	
	public String toString()
	{


	
	
	
	
	}
}

class LinkedListSet	// A wrapper class for LinkedList that does not allow duplicate objects
{
	LinkedList list = new LinkedList();;
	
	public Iterator iterator()
	{
		return list.iterator();
	}
	
	public void add(Object object) throws DuplicateObjectException
	{
		if(find(object) != null)
			throw new DuplicateObjectException();
		else
			list.add(object);
		
	}
	
	public void remove(Object object) throws ObjectNotFoundException
	{
		if(find(object) != null)
	          list.remove(object);
		else
			 throw new ObjectNotFoundException();	     
	}
	
	public Object find(Object object)
	{
	    if(list.contains(object))
	          return list.get(list.indexOf(object));
		else
			 return null;   
	}
	
	public String toString()
	{
		Iterator iterator = list.iterator();
		String s = " ";
		while(iterator.hasNext())
			s += iterator.next();
			
		return s;
	}
}

	
public class StudentListTest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		
		//Create a LinkedList object called courseList and initialize it with seven course objects
		//....

		// Create an empty LinkedListSet object called studentList
		//....

		//prompt for and read a number, n, of students to be added in studentList
		System.out.print("Enter number of students: ");
		int n = Integer.parseInt(stdin.readLine());

		/* Prompt for and read the ID, name, and GPA information for n students. Add these students
		   to studentList
		 */
		for(int i =1; i <= n; i++)
		{
			System.out.print("Enter name of student "+i+": ");
			String name = stdin.readLine().trim();
			System.out.print("Enter ID# of student "+i+": ");
			int idnumber = Integer.parseInt(stdin.readLine().trim());
			System.out.print("Enter GPA of student "+i+": ");
			double gpa = Double.parseDouble(stdin.readLine().trim());
			
			//...
	    
	    }
		
		//prompt for and read the number, n, of students to register courses
		System.out.print("Enter number of students to register courses: ");
		n = Integer.parseInt(stdin.readLine());	
			
			
		/* Prompt for and read IDs of students to register courses. If an ID is not found in studentList,
		   display an appropriate message. If the ID is found, prompt for and read the number of
		   courses to be added for the student. Then, one at a time, prompt for and read course code
		   of a course to be added. If the course code is found in courseList, add the corresponding
		   course object to the student, if possible. Display an appropriate message if the course code
		   is not found.
		 */
			
		String inputLine;  
		
		System.out.print("Enter the ID#  of a student to register courses or press Enter to exit: ");
		while(!(inputLine = stdin.readLine()).equals(""))
		{
			int id = Integer.parseInt(inputLine.trim());
			// ....
			
			
			
			
			
			
			
			System.out.print("Enter the ID#  of a student to register courses or press Enter to exit: ");	
		}


		// Display all information for all students
		//....
	} 
} 