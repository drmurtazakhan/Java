public class queueTest
{
	public static void main(String args[])
	{
		String input="ICS 201";
		int len=input.length();
		
		QueueArray q = new QueueArray(len); 
		for(int i=0; i < len; i++)
		{
			q.enqueue(input.charAt(i));
		}	
		for(int i=0; i < len; i++)
		{
			System.out.println(q.front());
			q.dequeue();			
		}		
	}	
}
