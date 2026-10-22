public class ConstructorTest1
{
	public static void main(String args[])
	{
    	A o1 = new A(); 
    	o1.sm1();    	    
    }
}
class A
{
	private int x;
	public A()
	{
		System.out.println("1");
	}
	public void m1()
	{
		System.out.println("m1");
	}
	public static void sm1()
	{
		System.out.println("sm1");
	}
}
	





