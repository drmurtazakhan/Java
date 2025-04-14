import java.io.*;

class Person
{
	private String name;
	public Person(String name) // consturctor
	{
    	this.name = name;
    }  
    public String getName()
    {
    	return name;
    }

    public void print()
    {
    	System.out.println("Person: "+name);
    }

    
}

class Instructor extends Person
{
	private double salary;
	public Instructor(String name, double salary) // constructor
	{
		super(name);
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
		
	}
	
     public void print()
     {
     	System.out.println("Instructor: "+getName()+ ", "+salary);
     }
}

class Student extends Person
{
	private double gpa;
	public Student(String name, double gpa) // constructor
	{
		super(name);
		this.gpa = gpa;
	}
	public double getGPA()
	{
		return gpa;
	}
	public void print()
	{
		System.out.println("Student: "+getName()+ ", "+gpa);
	}
}
 
 class ReseachAssistant extends Student {
	private int workLoad;
	
	public ReseachAssistant(String name, double gpa, int workLoad) {
		super(name, gpa);
		this.workLoad = workLoad;
	}
	public void print() {
		System.out.println("ResearchAssistant: "+getName()+ ", "+getGPA()+", "+workLoad);
	}}
 

public class PolyTest
{
	public static void main (String args[])
	{
		Person p1 = new Person("Ali");
		Instructor i1= new Instructor("Khalid",7000);
		Student s1 = new Student("Majed",3.2);
		Person p4 = new Student("Khan",3.3);
		
		ReseachAssistant ra1 = new ReseachAssistant("Khan",3.2,12);
		
		describe(p1);  
		describe(i1);
		describe(s1);
		describe(ra1);	
		describe(p4);	
		
	}
	public static void describe(Person p)
    {
		p.print();
	}
}
		
		
		 