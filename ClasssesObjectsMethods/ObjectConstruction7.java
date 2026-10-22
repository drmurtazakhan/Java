public class ObjectConstruction7
{	public static void main(String args[])
	{	new B("yellow",6);		
   	}
}
class B extends A
{	
	public B(String s, int x)
	{	this.x=x;
		System.out.println(s);
		System.out.println(x);
   	}
   	private int x=8;
	private String s="black";	
}
class A
{	public A( )
	{	this("white");
		System.out.println("red");
   	}
    public A(String s )
    {	System.out.println(s);
    }
}
