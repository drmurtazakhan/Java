
import java.io.*;

class Person
{
	private String name="Ali";
	public Person() // consturctor
	{
    	System.out.println(name);	
    }
	public Person(String name) // consturctor
	{
    	this.name = name;
    	System.out.println(name);	
    }  
    

    
}


public class instanceVariables
{
	public static void main (String args[])
	{
		Person p1 = new Person();
		Person p2 = new Person("Ahmed");
		
		
	}
	
}
		
		
		 