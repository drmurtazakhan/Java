import java.io.*;
import ics201.lab01.graphics.Point;
import ics201.lab01.graphics.Circle;


public class PointTest
{
	public static void main(String[] args) throws java.io.IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		double x,y,rad;
		
		System.out.println("Enter first number :");
		System.out.print("Enter first point x & y : ");
		x=Double.parseDouble(stdin.readLine());
		y=Double.parseDouble(stdin.readLine());
		Point p1 = new Point(x,y);
		System.out.print("Enter second point x & y: ");
		x=Double.parseDouble(stdin.readLine());
		y=Double.parseDouble(stdin.readLine());
		Point p2 = new Point(x,y);
		System.out.println("Distance of "+p1+ " to origin = "+p1.distanceToOrigin() );
		System.out.println("Distance of "+p2+ " to origin = "+p2.distanceToOrigin() );
		System.out.println("Distance between "+p1+" and "+p2+ " = "+p1.distanceToPoint(p2) );
		rad=5.5;
		Circle c1 = new Circle(15,20,rad);
		System.out.println("Area of Circle "+Math.PI*rad*rad);
		
		
	}
}
