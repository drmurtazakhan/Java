public class ObjectConstruction5
{	public static void main(String args[])
	{	new C();
    }
}
class C extends B
{	public C()
	{   System.out.println("green");
    }    
}
class B extends A
{	int x=4;    
	public B()
	{	x=3;
		System.out.println(x);		
    }    
}
class A
{	public A( )
	{	this("yellow");
		System.out.println("white");
    }
    public A(String s )
	{	System.out.println(s);
    }
}



