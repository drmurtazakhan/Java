import java.io.*;
public class TestObjectMethods
{
	public static void main(String args[]) 
	{
		Rectangle r1= new Rectangle(10,15,50,70);
		Rectangle r2 = (Rectangle) r1.clone();
		System.out.println( r1.equals(r2) ); 	
		//System.out.println( r1==r1.clone() ); 	
	}	
}
		
	