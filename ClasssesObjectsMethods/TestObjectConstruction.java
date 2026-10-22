class Shape {
        public Shape() {
    System.out.println("Shape Constructor"); 
  }
}
class FourSided extends Shape {
  public FourSided() {
    System.out.println("FourSided Constructor"); 
  }
}
class Rectangle extends FourSided {
  public Rectangle() {
    System.out.println("Rectangle Constructor"); 
  }
}
class Square extends Rectangle {
  public Square() {
    System.out.println("Square Constructor"); 
  }
}

public class TestObjectConstruction
{	
	public static void main(String[ ] args)
	{
		new Square();
		System.out.println("______________________");
		new Rectangle();
		System.out.println("______________________");
		new FourSided();
		System.out.println("______________________");
		new Shape();		
	}
}
