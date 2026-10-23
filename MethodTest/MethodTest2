class Point
{
	private double x; // instance variable
	private double y; // instance variable
	public static double z=5; // instance variable
	
	public Point (double xValue, double yValue) // constructor
	{
		x=xValue;
		y=yValue;
	}
	
	public double distanceToOrigin()
	{
		return Math.sqrt((x*x)+(y*y));		
	}
	private double distanceToPoint(Point p)
	{
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
	
						
}

public class MethodTest1
{
	public static void main (String args[])
	{
		Point p1 = new Point (10,20);
		Point p2 = new Point (20,10);
		System.out.println( p1.distanceToOrigin() );
		//System.out.println( p1.distanceToPoint(p2) );
		System.out.println( Point.z );
		
	}
}

