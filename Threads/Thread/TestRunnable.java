class A implements Runnable
{	public void run()
	{	for(int i=1; i<=10; i++)
			System.out.println(i*i);
	}
}
public class TestRunnable
{	public static void main(String args[])
	{	A oc = new A();
		oc.setPriority(10);
		Thread th = new Thread(oc);
		th.start();	
	} 
}
