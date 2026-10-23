public class TestThreadPriority2
{	public static void main(String[] args) 
	{	 A objA = new A();
		 B objB = new B();
		 C objC = new C();
		 
		 objA.setPriority(1);
		 objB.setPriority(10);
		 objC.setPriority(5);
		 
		 objA.start();
		 objC.start(); 
		 objB.start();

	}
}
class B extends Thread
{	public void run()
	{	System.out.print("B");
	}
}
class A extends Thread
{	public void run()
	{	System.out.print("A");
	}
}
class C extends Thread
{	public void run()
	{	System.out.print("C");
	}
}
