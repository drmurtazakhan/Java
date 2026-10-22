class MyThread implements MyRunnable
{
	MyRunnable target;
	public MyThread(MyRunnable target)
	{
		this.target=target;		
	}
	
	public MyThread()
	{
		;		
	}
	public void start()
	{
		this.run();
    }
    public void run()
	{
		target.run();
	}     
}
interface MyRunnable
{
	void run();
}

class B implements MyRunnable
{
	public void run()
	{
		System.out.println("Run method in class B");
	}
}
class A extends MyThread
{
	public void run()
	{
		System.out.println("Run method in class A");
	}
}

public class InterfaceThreadlLike
{
	public static void main(String args[])
	{
		A objA = new A();
		objA.start();	
		MyRunnable target = new B();
		MyThread th  = new MyThread(target);
		th.start();
		
    }
}