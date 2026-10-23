public class ThreadGroupTest
{
	public static void main(String[] args) 
	{
		 // public ThreadGroup(String name)
		 //	name - the name of the new thread group. 
		 ThreadGroup tg1 = new ThreadGroup("Thread Group1");
		 
		 Thread tA = new Thread(tg1, new A(), "Thread A ");
		 Thread tB = new Thread(tg1, new B(), "Thread B ");
		 Thread tC = new Thread(tg1, new C(), "Thread C ");

		 tg1.setMaxPriority(9);

		 
		 tA.setPriority(7);
		 tB.setPriority(1);
		 tC.setPriority(5);
		 System.out.println("Group of Thread A is "+tA.getThreadGroup()); 		 
		 tB.start();
		 tC.start();
		 tA.start(); 
		 
		 System.out.println("\nNumber of active threads in this thread group = "+tg1.activeCount()); 
		 System.out.println("Max prority of this Thread Group ="+tg1.getMaxPriority() );
		 System.out.println("Priority of Thread A = "+tA.getPriority());
		 
          
	}
}
class A extends Thread
{
	public void run()
	{
		for (int i=0; i<100; i++)
		System.out.print("A");
	}
}
class B extends Thread
{
	public void run()
	{
		for (int i=0; i<100; i++)
		System.out.print("B");
	}
}
class C extends Thread
{
	public void run()
	{
		for (int i=0; i<100; i++)
		System.out.print("C");
	}
}