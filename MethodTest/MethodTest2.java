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
	
	public void method1(Point p)
	{
		this.x=this.x+p.x;
		this.y=this.y+p.y;
	}
	public String toString()
	{
		return "(" + x + ","+ y + ")" ;
	}
	
	
						
}

public class MethodTest2
{
	public static void main (String args[])
	{
		Point p1 = new Point (10,20);
		Point p2 = new Point (20,10);
		p2.method1(p1);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}

