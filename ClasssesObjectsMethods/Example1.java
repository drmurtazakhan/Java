class Point
{	private double x; // instance variable
	private double y; // instance variable
	public Point (double xValue, double yValue) // constructor
	{	x=xValue;
		y=yValue;
	}
	public double distanceToOrigin()  // method
	{	return Math.sqrt((x*x)+(y*y));		
	}
	public double distanceToPoint(Point p) // method
	{	return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
	public void translate(double dx, double dy) // method
	{	x=x+dx;
		y=y+dy;
	}							
}
public class Example1
{	public static void main (String args[])
	{   Point p1 = new Point(10, 20);
	     Point p2 = new Point(15, 12);    
	    double d1 = p1. distanceToOrigin();
	     System.out.println(d1);	
	     double d2 = p1. distanceToPoint(p2);
	     System.out.println(d2);
	     p1. translate( 4, 3);	                  
	}
}
