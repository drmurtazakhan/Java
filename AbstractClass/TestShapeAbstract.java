abstract class Shape
{
	public abstract double area();	
	private int x;
	private int y;
	public Shape (int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
		
}
class Circle extends Shape
{
	private double radius;
	public Circle(int x, int y,double r)
	{
		super(x,y);
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
	public Rectangle (int x, int y,double w, double h)
	{
		super(x,y);
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
	public RightAngleTriangle(int x, int y,double b, double a)
	{
		super(x,y);
		base=b;
		altitude=a;
	}
		
	public double area()
	{
		return 0.5*base*altitude; 
	}
}

public class TestShapeAbstract
{
	public static void main(String[] args)
	{
		/*
		Shape[] s = new Shape[3]; 
		s[0] = new Circle(50,60,2); 
    	s[1] = new Rectangle(40,30,4,5); 
     	s[2] = new RightAngleTriangle(20,30,5,6); 
     	
     	for (int i = 0; i <s.length ; i ++) 
        System.out.println( s[i].getX()+" "+s[i].getY()+" "+s[i].area()  );		     
        */  
        Shape sh = new Circle(50,60,2); 
        System.out.println(sh.area());
        
	}
	
}
