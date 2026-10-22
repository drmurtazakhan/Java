class Point
{
	private double x; // instance variable
	private double y; // instance variable
	
	public Point (double xValue, double yValue) // constructor
	{
		x=xValue;
		y=yValue;
	}
	public Point() // constructor
	{
		this(0.0,0.0);
	}
	public double distanceToOrigin()
	{
		return Math.sqrt((x*x)+(y*y));		
	}
	public double distanceToPoint(Point p)
	{
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
	public void translate(double dx, double dy)
	{
		x=x+dx;
		y=y+dy;
	}
	public double getX()
	{
		retrun x;
	}
	public double getY()
	{
		retrun y;
	}
						
}

public class TestPoint
{
	public static void main (String args[])
	{
		Point p1 = new Point (10,20);
		System.out.println(p1);
		
		
		
		Point p2 = new Point (20,20);
		Point p3 = new Point (40,30);
		/*
		double d1=p1.distanceToOrigin();
		System.out.println("Distance of p1 from origin is "+d1);
		
		double d21=p2.distanceToPoint(p1);
		System.out.println("Distance b/w p2 and p1 is "+d21);
		
		System.out.println("p3 before translation: "+"x="+p3.getX()+"y="+p3.getY());
		p3.translate(5,10);
		System.out.println("p3 after translation: "+"x="+p3.getX()+"y="+p3.getY());
		*/
	}
}

	