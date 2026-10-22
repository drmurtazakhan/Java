class A
{
	public A()
	{
		this("Al-Tusi");
		System.out.println(s);		
	}
	public A(String s)
	{
		System.out.println(s);
	}
	String s="Ibn Al-Nafis";	
}
class B extends A
{	    
	public B(String s1, String s2)
	{ 	super("Ulugh Beg");		
		System.out.println(s2);
		System.out.println(s3);
	}
	private String s3=s;
}

public class MuslimScientists4
{
	public static void main(String args[])
	{
		new B("Al-Haitham","Ibn Khaldun");		
		new A();		
	}
}
