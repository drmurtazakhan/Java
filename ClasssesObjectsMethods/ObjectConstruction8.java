public class ObjectConstruction8
{	
public static void main(String args[])
	{	
		new A();		
		System.out.println("----------------------");
		new B("black",2);
		
   	 }
}
class B extends A
{	
	public B(String s, int x)
	{	super(s);
		this.s=s;		
		System.out.println(this.s);
		System.out.println(s);
		System.out.println(this.x);
		System.out.println(x);
   	}
   	private int x=6;
	private String s="black";        
	
}
class A
{	
	public A( )
	{	this("brown");
		System.out.println("purple");
   	}
    public A(String s )
    {	System.out.println(s);
   	}
}
