class OurClass implements Runnable
{
	public void run()
	{
		for(int i=0; i<100; i++)
		System.out.println("Salam ");
	}
}
public class ImplementingRunnable
{
	public static void main(String args[])
	{
		OurClass oc = new OurClass();
		//Runnable oc = new OurClass();
		Thread th = new Thread(oc);
		th.start();
		run();
	} 
	static void run()
	{
		for(int i=0; i<100; i++)
		System.out.println("Shabab.");
	}
}
