import java.util.*;

class MyQueue{
	protected LinkedList list;

	public MyQueue(){
		list = new LinkedList();
	}

	public Object dequeue() throws NoSuchElementException{
		if(list.isEmpty())
			throw new NoSuchElementException();
		else
			return list.removeFirst();
	}

	public void enqueue(Object obj){
		list.addLast(obj);
	}

	public Object peek() throws NoSuchElementException{
		if(list.isEmpty())
			throw new NoSuchElementException();
		else
			return list.getFirst();
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}
	
}

