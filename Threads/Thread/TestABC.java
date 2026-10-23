class A extends Thread
{
	public void run()
	{
		for(int i=1; i<4; i++) 
		{
			System.out.println("output from thread of class A :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1; i<4; i++)
		{
			System.out.println("output from thread of class B :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

class C extends Thread
{
	public void run()
	{
		for(int i=1; i<4; i++)
		{
			System.out.println("output from thread of class C :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

public class TestABC
{
	public static void main(String args[])
	{
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
	}
}
