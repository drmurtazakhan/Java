package ics201.lab01.graphics;
public class Circle extends Point
{
	double radius;
	public Circle(int x, int y, double r)
	{
		super(x, y);
		radius = r;
	} 
	public String toString()
	{
		 return super.toString()+" "+ "radius= "+radius;		 
	}
}