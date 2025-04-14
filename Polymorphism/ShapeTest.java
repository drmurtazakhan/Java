class Shape
{
	private int x;
	private int y;
	public Shape(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public String objectContents()
	{
		return "x="+x+" "+"y="+y;		
	}
}
class Circle extends Shape
{
	private int radius;
	public Circle(int x, int y, int r)
	{
		super(x,y);
		radius=r;
	}
	public String objectContents()
	{
		return "Circe: "+super.objectContents()+" "+"radius="+radius; 
	}
}

class Rectangle extends Shape
{
	private int width;
	private int height;
	public Rectangle (int x, int y, int w, int h)
	{
		super(x,y);
		width=w;
		height =h;
	}
	public String objectContents()
	{
		return "Rectangle: "+super.objectContents()+" "+"width="+width+" "+"height="+height;  
	}
}

public class ShapeTest
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(5,10,3);
		Rectangle r1 = new Rectangle(15,20,12,16);
		describe(c1);
		describe(r1);
	}
	public static void describe(Shape s)
	{
		System.out.println( s.objectContents() );
	}
}
