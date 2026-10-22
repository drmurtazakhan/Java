public class QueueLinkedList
{
	private LinkedList items;
	public QueueLinkedList()
	{
		items = new LinkedList();
	}
	public void enqueue(Object e)
	{
		items.insert(items.length(),e);
	}
	public void dequeue()
	{
		items.remove(0);
	} 
	public Object front()
	{
		return items.nodeAt(0).getElement();
	}
	public boolean isEmpty()
	{
		return items.isEmpty();
	}
	public int size()
	{
		return items.length();
	}
} 
