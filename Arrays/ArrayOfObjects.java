import java.io.*;
class Student
{
	private int iDNumber;
    	private double grade;
	
	public Student(int iDNumber, double grade)
	{
		this.iDNumber = iDNumber;
		this.grade = grade;
	}
	public void print()
	{
		System.out.println(iDNumber+"\t"+grade);
	}
	public double getGrade()
	{
		return grade;
	}
}	

public class ArrayOfObjects
{
	static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		int size;
        System.out.print("Enter number of students: ");
        size = Integer.parseInt(stdin.readLine());
        
        Student[] students = createArray(size);
        double average = average(students);
        System.out.println("The average is "+average);
        
        System.out.println("Students below average are");
        for (int i=0; i<students.length; i++)
           if (students[i].getGrade() < average)
               students[i].print();               
    }
     
    static Student[] createArray(int size) throws IOException
    {
    	Student[] array = new Student[size];
    	int id;
    	double grade;
    	System.out.println("Enter "+size+" students");
    	for (int i=0; i<size; i++)
    	{
    		System.out.print("ID Number : ");
    		id = Integer.parseInt(stdin.readLine());
    		System.out.print("Grade : ");
    		grade = Double.parseDouble( stdin.readLine());
    		array[i] = new Student(id, grade);
    	}
    	return array;
    }
    static double average(Student[] studentList)
    {
    	double sum = 0;
    	for (int i=0; i<studentList.length; i++)
    	sum += studentList[i].getGrade();
    	return sum/studentList.length;
    }   	
}
