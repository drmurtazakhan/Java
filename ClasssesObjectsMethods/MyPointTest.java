class Point
{
	private double x; // instance variable
	private double y; // instance variable
	
	public Point (double xValue, double yValue) // constructor
	{
		x=xValue;
		y=yValue;
	}
	
	public double distanceToOrigin() // method to find distance of point from origin (0,0)
	{
		return Math.sqrt((x*x)+(y*y));		
	}
	public double distanceToPoint(Point p) // method to find distance b/w two points
	{
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void translate(double dx, double dy)
	{
		x=x+dx;
		y=y+dy;
	}
						
}

public class MyPointTest
{
	public static void main (String args[])
	{
		Point p1 = new Point (10,20);
		Point p2 = new Point (20,20);
				
		System.out.println("p1x= "+p1.getX());
		System.out.println("p1y= "+p1.getY());
		System.out.println("\n");
		System.out.println("p2x= "+p2.getX());
		System.out.println("p2y= "+p2.getY());
		System.out.println("\n");
		
		double d1=p1.distanceToOrigin();
		System.out.println("Distance of p1 from origin is "+d1);
		
		double d21=p2.distanceToPoint(p1);
		System.out.println("Distance b/w p2 and p1 is "+d21);		
		
		System.out.println("\np2 before translation: "+"x="+p2.getX()+" , "+"y="+p2.getY());
		p2.translate(-5,5);
		System.out.println("p2  after translation: "+"x="+p2.getX()+" , "+"y="+p2.getY());
	}
}