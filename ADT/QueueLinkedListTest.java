public class QueueLinkedListTest
{
	public static void main( String argv[] )
	{
		QueueLinkedList queue = new QueueLinkedList();
		String string = "ics 201";		
		
		for (int k = 0; k < string.length(); k++)
		queue.enqueue(new Character( string.charAt(k)));
		Object o = null;
		
		while (!queue.isEmpty())
		{
			System.out.println(queue.front());        
			queue.dequeue();			
		}    
	}
}


