import java.io.*;
class Parent
{
	int size;
}
class Child extends Parent
{ 
       int size; 
}
public class TestObject
{
	public static void main(String args[]) throws IOException
	{
		Parent p1 = new Parent();
		System.out.println(p1.toString() ); 	
		Parent c1 = new Child(); // upcasting
		Parent p2 = c1;
		System.out.println(p2.toString()); 			
		Child c2 = (Child) p2;
		System.out.println(c2.toString()); //downcasting
		
		//System.out.println(p2.getClass()); 	
		//System.out.println(c2.getClass()); 
		
		/*
		java.awt.Rectangle r1= new java.awt.Rectangle(10,20,30,40);
		java.awt.Rectangle r2= new java.awt.Rectangle(10,20,30,40);
		
		System.out.println(r1==r2); 
		System.out.println(r1.equals(r2)); 
		*/
		//System.out.println((c2 instanceof Child)); 
		
					
		
	}	
}
		
	