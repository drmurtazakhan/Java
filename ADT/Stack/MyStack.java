import java.util.*;

class MyStack{
	protected LinkedList list;

	public MyStack(){
		list = new LinkedList();
	}

	public Object pop() throws NoSuchElementException{
		if(list.isEmpty())
			throw new NoSuchElementException();
		else
			return list.removeFirst();
	}

	public void push(Object obj){
		list.addFirst(obj);
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

