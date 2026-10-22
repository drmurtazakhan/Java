
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

class Rectangle extends Point
{	private double width;
	private double height;
	public Rectangle(Point p,double w, double h)
	{	super(p.getX(),p.getY());
		width=w;
		height=h;		
	}
	
	public String toString()
	{	return "Rectangle Top left Point="+super.toString()+" "+"width="+width+" "+"height="+" "+height;	
	}
	
}	


public class InheritanceTest1
{	public static void main (String args[])
	{	Point p1 = new Point (5,10);
		Rectangle r1 = new Rectangle(p1,20,15);
		System.out.println(r1);		
	}
}

