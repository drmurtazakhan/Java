import java.lang.reflect.Method;	
public class TestClass{
	public static void main(String[] args){
		Circle circle = new Circle(5,12,10);
		Class circleClassInfo = circle.getClass();
		System.out.println("Class name is :"+circleClassInfo.getName());
		System.out.println("Parent is :"+circleClassInfo.getSuperclass());
		System.out.println("\nMethods are: ");
		Method[] methods = circleClassInfo.getMethods();
		for(int i = 0; i<methods.length; i++)
			System.out.println(methods[i]);
	}
}

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
