public class MuslimScientists3
{	public static void main(String args[])
	{	new A();
		new B("Ibn Rushd","Al-Haitham");								
   	}
}
class B extends A
{	public B(String s1, String s2)
	{	super(s1);
		this.s=s2;
		System.out.println(s1);
		System.out.println(s);
   	 }    
    private String s;    
}
class A
{	public A( )
	{	this("Al-Biruni");
		System.out.println(s);
   	}
   	public A(String s )
	{	System.out.println(s);
    }
    private String s="Al-Tusi";	
}

