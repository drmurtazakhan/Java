class Point
{	private double x; // instance variable
	private double y; // instance variable
	public Point (double xValue, double yValue) // constructor
	{	x=xValue;
		y=yValue;
	}
	public double getX()
	{ return x; }
	public double getY()
	{ return y; }	
	public String toString()
	{	return "(" + x + ","+ y + ")" ;
	}						
}
class Circle extends Point
{	private double radius;
	public Circle(Point p, double radius)
	{	super( p.getX(),p.getY() );
		this.radius=radius;
	}
	public String toString()
	{	return  "Circle Center="+super.toString()+" "+"radius="+radius;
	}
}	
public class InheritanceTest3
{	public static void main (String args[])
	{	Point p1 = new Point (5,10);
		Circle c1 = new Circle(p1,10);
		System.out.println(c1);		
	}
}

