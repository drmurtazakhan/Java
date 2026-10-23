// TestThreadPriority.java: Test thread priorities
public class TestThreadPriority
{
	public static void main(String[] args) 
	{
		 
		 A objA = new A();
		 B objB = new B();
		 C objC = new C();
		 
		 objA.setPriority(10);
		 objB.setPriority(1);
		 objC.setPriority(5);
		 // Start threads
		 
		 objB.start();
		 objC.start();
		 objA.start(); 
	}
}
class A extends Thread
{
	public void run()
	{
		for (int i=0; i<1000; i++)
		System.out.print("A");
	}
}
class B extends Thread
{
	public void run()
	{
		for (int i=0; i<1000; i++)
		System.out.print("B");
	}
}
class C extends Thread
{
	public void run()
	{
		for (int i=0; i<1000; i++)
		System.out.print("C");
	}
}