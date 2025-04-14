class Shape
{
	public double area()
	{
		return 0;		
	}
}
class Circle extends Shape
{
	private double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public double area()
	{
		return 3.142*radius*radius; 
	}
}

class Rectangle extends Shape
{
	private double width;
	private double height;
	public Rectangle (double w, double h)
	{
		width=w;
		height =h;
	}
	public double area()
	{
		return width*height; 
	}
}
class RightAngleTriangle extends Shape
{
	private double base;
	private double altitude;
	public RightAngleTriangle(double b, double a)
	{
		base=b;
		altitude=a;
	}
		
	public double area()
	{
		return 0.5*base*altitude; 
	}
}

public class TestShapes
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(3);
		Rectangle r1 = new Rectangle(4,5);
		RightAngleTriangle t1= new RightAngleTriangle(6,7);
		System.out.println( FindArea(c1) ) ;
		System.out.println( FindArea(r1) ) ;
		System.out.println( FindArea(t1) ) ;
		
	}
	public static double FindArea(Shape s)
	{
		return s.area();
	}
}
