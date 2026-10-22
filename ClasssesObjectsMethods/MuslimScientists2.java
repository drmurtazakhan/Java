class A
{
	String s="Omar Al-Khayyam";
	public A()
	{
		System.out.println(s);		
	}
	public A(String s)
	{
		System.out.println(s);
	}
	
}
class B extends A
{
	public B()
	{ 
		
	}    
	public B(String s)
	{ 
		super("Ulugh Beg");
		System.out.println(s);
	}
}
class C extends B
{
	public C()
	{ 
		System.out.println("Al-Battani");
	}
	
}
public class MuslimScientists2
{
	public static void main(String args[])
	{
		new B("Ibn Khaldun");
		new C();		
	}
}
