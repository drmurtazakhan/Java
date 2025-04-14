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
public class PolyTest2
{
	public static void main (String args[])
	{
		Person p1 = new Person("Ali");
		Instructor i1= new Instructor("Khalid",7000);
		describe(p1);  
		describe(i1);  
	}
	public static void describe(Person p)
    {
		p.print();
	}
}