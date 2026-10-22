public class queueofStringTest
{
	public static void main(String args[])
	{
		String[] strA = {"Ali", "Majed", "Ahmad", "Bakar", "Hashim"};
				
		QueueArrayString q = new QueueArrayString(strA.length); 
		for(int i=0; i < strA.length; i++)
		{
			q.enqueue(strA[i]);
		}	
		while(!q.isEmpty())
		{
			System.out.println(q.front());
			q.dequeue();			
		}		
	}
	
}
