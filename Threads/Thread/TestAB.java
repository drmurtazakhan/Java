class A extends Thread
{
	public void run()
	{
		for(int i=1; i<11; i=i+2) 
		System.out.println("output from thread of class A :"+i);
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=2; i<11; i=i+2) 
		System.out.println("output from thread of class B :"+i);
	}
}
public class TestAB
{
	public static void main(String args[])
	{
		A a = new A();
		a.start();
		B b = new B();
		b.start();
	}
}
