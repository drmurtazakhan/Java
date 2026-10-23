class Q
{ 
	int n;
    boolean valueSet=false;
    synchronized int get()  // consume
    {
    	if(!valueSet) // if valueSet=false then wait (not yet produced) (could not consume) 
      	try{wait();}catch(InterruptedException e){ }
      	System.out.println("Got:"+n); // consumed n goods
      	valueSet=false;
      	notify(); // notify to producer thread
      	return n;
    }
    synchronized void put(int n) // produce
    {
    	if(valueSet) // if valueSet=true then wait (do not produce) (not yet cosumed)
    	try{wait();}catch(InterruptedException e){}
    	this.n=n;
    	valueSet=true;
    	System.out.println("Put:"+n); // produced n goods
    	notify(); // notify to consumer thread
    }
}

class Producer implements Runnable
{
	Q q;
	
	//public Thread(Runnable target, String name)
	//target - the object whose run method is called.
	//name - the name of the new thread
	
	Thread th=new Thread(this, "Producer");
	
	Producer(Q q)
	{
		this.q=q;
		th.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			//try{Thread.sleep((int)1000);}catch(InterruptedException e){}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	Thread th=new Thread(this, "Consumer");
	Consumer(Q q)
	{
		this.q=q;
		th.start();
	}	
	
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}

public class PCproblem
{
	public static void main(String[] s)
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("press Conrl-C to stop.");
	}
}