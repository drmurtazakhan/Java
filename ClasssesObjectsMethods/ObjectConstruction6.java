public class ObjectConstruction6
{	
public static void main(String args[])
	{	
		new A();		
		System.out.println("----------------------");
		new B("white",7);
		
   	 }
}
class B extends A
{	
public B(String s, int x)
	{	super(s);
		this.x=x;
		System.out.println(s);
		System.out.println(x);
   	 }
    
    private int x;    
}
class A
{	
private String s="yellow";
	{	System.out.println(s);
	}
	public A( )
	{	this("blue");
		System.out.println("green");
   	 }
    	public A(String s )
	{	System.out.println(s);
   	 }
}
