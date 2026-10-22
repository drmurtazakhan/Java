class Rectangle
{
	private int x,y,w,h; // instance variables
	
	Rectangle (int xValue, int yValue, int wValue, int hValue) //Constructor
	{
		x=xValue;
		y=yValue;
		w=wValue;
		h=hValue;
		
	}
	
	public void translate(int x_unit,int y_unit) // Method to translate rectangle object
	{
		x=x+x_unit;
		y=y+y_unit;
	}
	
	public void displayRectangle() // Method to display rectangle object
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("w="+w);
		System.out.println("h="+h);
		System.out.println("\n");
		
	}
}
	
public class RectangleTest
{		
	public static void main (String[] args)
	{
		Rectangle r1 = new Rectangle(10,20,100,50);
		
		r1.displayRectangle();
		r1.translate(20,10);
		r1.displayRectangle();
		
	}
}
