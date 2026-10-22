class A
{	protected int x;
	public A(int x)
	{	this.x=x;
	}
}
class B extends A
{	private int y=x;
	public B(int x, int y)
	{	super(x);
		y=y;
		System.out.println(this.y);
		System.out.println(y);		
	}
}	
public class Inheritance_Protected_Test
{	public static void main(String [] args)
	{	B obj2 = new B(5,6);
	}   
}
