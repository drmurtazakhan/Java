class Shape
{
	void draw() {}
	void erase() {} 
}

class Circle extends Shape
{
	
	void draw()
	{
		System.out.println("Circle.draw()"); 
	}
	
	void erase()
	{
		System.out.println("Circle.erase()"); 
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println("Square.draw()"); 
	}
	void erase()
	{
		System.out.println("Square.erase()"); 
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangle.draw()"); 
	}
	void erase()
	{
		System.out.println("Triangle.erase()");
	}
}

public class Shapes
{
	public static Shape randShape()
	{
		Shape s = new Shape();
		switch((int)(Math.random() * 3))
		{
			case 0: 
			{
				s = new Circle();break;
			}
			case 1:
			{
				s = new Square();break;
			}
			case 2:
			{
				s = new Triangle();break;
			}
		}
		return s;
	}
	public static void main(String[] args)
	{
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for(int i = 0; i < s.length; i++)
		s[i] = randShape();
		// Make polymorphic method calls:
		for(int i = 0; i < s.length; i++)
		s[i].draw();
	}
}
