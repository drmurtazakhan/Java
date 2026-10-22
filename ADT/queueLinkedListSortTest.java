public class queueLinkedListSortTest
{
	public static void main(String args[])
	{
		String[] courses={"ICS101","ICS102","ICS201","ICS202"};
		int len=courses.length;
		
		QueueLinkedList q = new QueueLinkedList(); 
		for(int i=0; i < len; i++)
		q.enqueue(courses[i]);
		LinkedList inputList = new LinkedList();
		inputList.printList();
		
		
		System.out.println("dequeue");
		for(int i=0; i < len; i++)
		{
			System.out.println(q.front());
			q.dequeue();			
		}		
	}
	
	//public static LinkedList sort
	
}
