class Point
{
	private double x; // instance variable
	private double y; // instance variable
	
	public Point (double xValue, double yValue) // constructor
	{
		x=xValue;
		y=yValue;
	}
	public String toString()
	{
		return "(x="+x+" y="+y+")";
	}				
}

public class PointTest
{
	public static void main (String args[])
	{
		Point p1 = new Point (10,20);
		System.out.println(p1);
		Point p2 = new Point (50,25);
		System.out.println(p2);
		
	}
}

	