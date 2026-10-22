public class MyPoint
{
	private int x; // instance variable
	private int y; // instance variable
	
	public MyPoint(int xValue, int yValue) // constructor
	{
		x=xValue;
		y=yValue;
	}
	public Point MovePoint(Point p) // method
	{
		x=x-p.x;
		