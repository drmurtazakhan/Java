public class queueTestString
{
	public static void main(String args[])
	{
		String[] s ={"Majed","Ali","Nasir","Fahd"};
		int len=s.length;
		
		QueueArrayString q = new QueueArrayString(len); 
		for(int i=0; i < len; i++)
		{
			q.enqueue(s[i]);
		}	
		for(int i=0; i < len; i++)
		{
			System.out.println(q.front());
			q.dequeue();			
		}		
	}
	
}
