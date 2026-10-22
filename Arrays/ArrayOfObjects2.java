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
}	

public class ArrayOfObjects2
{
	public static void main(String[] args) throws IOException
	{
		Student s1 = new Student(123456,3.2);
		Student s2 = new Student(777456,2.2);
		Student s3 = new Student(997456,2.5);
		
		Student[] stuArray = new Student[3];
		stuArray[0]=s1;
		stuArray[1]=s2;
		stuArray[2]=s3;	
		for (int i=0; i<stuArray.length; i++)
           stuArray[i].print();   
			
    }
    	
}
