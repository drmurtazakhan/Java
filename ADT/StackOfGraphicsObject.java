import java.awt.*;
import java.awt.geom.Ellipse2D;
public class StackOfGraphicsObject
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle(10,20,30,40); 
		Rectangle r2=new Rectangle(20,20,30,40); 
		Rectangle r3=new Rectangle(30,20,30,40); 
		Ellipse2D.Double e1 = new Ellipse2D.Double (40,50,20,20);
		
		Object[] arrObj = new Object[4];
		arrObj[0]=r1;
		arrObj[1]=r2;
		arrObj[2]=r3;
		arrObj[3]=e1;
		
		
		StackLinkedList s = new StackLinkedList(); 
		for(int i=0; i< arrObj.length; i++)
		{
			s.push(arrObj[i]);
		}	
		for(int i=0; i< arrObj.length; i++)
		{
			System.out.println ( s.peek());
			s.pop();
		}
			
	}
}