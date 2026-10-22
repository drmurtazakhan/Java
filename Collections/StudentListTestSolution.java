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
		if(courses.contains(course))
			throw new DuplicateCourseException();
		else
			courses.add(course);
		
	}

	public void deleteCourse(Course course) throws CourseNotFoundException
	{
		if(! courses.contains(course))
			 throw new CourseNotFoundException();
		else
		     courses.remove(course);
	}
	
	public String toString()
	{
		Iterator iterator = courses.iterator();
		String courseList = " ";
		while(iterator.hasNext())
		{
			Course s = (Course)iterator.next();
			courseList +=  "  " + s.getCourseCode();
		}
			
		return "Name: " + name + " ID#: " + idnumber + " GPA: " + gpa + " \nCourses: " + courseList + "\n";
	}
}

class LinkedListSet	// A wrapper class for LinkedList that does not allow duplicate student objects
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

	
public class StudentListTestSolution
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		//Create a LinkedList object called courseList and initialize it with the seven course objects
		LinkedList courseList = new LinkedList();
		courseList.add(new Course("ICS102", 3));
		courseList.add(new Course("ICS202", 4));
		courseList.add(new Course("ICS232", 4));
		courseList.add(new Course("ICS251", 4));
		courseList.add(new Course("ICS354", 4));
		courseList.add(new Course("ICS432", 4));
		courseList.add(new Course("ICS490", 4));
		
		// Create an empty LinkedListSet object called studentList
		LinkedListSet studentList = new LinkedListSet();
		
		//prompt for and read the number, n, of students to be added in studentList
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
			
			Student student = new Student(name, idnumber, gpa);
			try{
				studentList.add(student);
			}
			
			catch(DuplicateObjectException e)
	    	{
	    		System.out.println(e);
	    	}
	    
	    }
			
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
			Student student = (Student) studentList.find(new Student(id));
			if(student != null)
			{
				int numberOfCourses;
				do{
					System.out.print("Enter the number of courses to be added to this student: ");
					numberOfCourses = Integer.parseInt(stdin.readLine().trim());
				} while(numberOfCourses < 0 || numberOfCourses > 4);
			
				for(int i = 1; i <= numberOfCourses; i++)
				{
					System.out.print("Enter course code for course "+i+": ");
					String courseCode = stdin.readLine().trim();
				
					Iterator iterator = courseList.iterator();
					boolean found = false;
					Course course = null;
					while(iterator.hasNext()&& ! found)
					{
						course = (Course) iterator.next(); 
						if(courseCode.equalsIgnoreCase(course.getCourseCode()))
							found = true;
					}

					if(found)
					{   
						try
						{
							student.addCourse(course);
						}
						catch(DuplicateCourseException e)
	    				{
	    					System.out.println(e);
	    				}
	    
					}
					else
						System.out.println("Course not in course list");
				}
			} 
			else
				System.out.println("Student not in student list");
				
		    System.out.print("Enter the ID#  of a student to register courses or press Enter to exit: ");
		}	
		
		// Display all information for all students
		Iterator iterator = studentList.iterator();
		while(iterator.hasNext())
		   System.out.println(iterator.next()); 		
	} 
} 