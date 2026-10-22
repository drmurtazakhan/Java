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
class Circle extends Point
{
	private double radius;
	public static final double PI=3.142;
	public Circle (double xx ,double yy, double r) // consturctor
	{
		super (xx,yy);
		radius=r;
	}
	public double area()
	{
		return PI*radius*radius;
	}
}
			
public class Example2
{	public static void main (String args[])
	{   
		Circle c1 = new Circle(5,10,5);
		double a = c1.area();	
		System.out.println(a);
	     
	}
}
