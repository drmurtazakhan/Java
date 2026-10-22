import java.util.*;

 public class MyQueue{
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

    public void enqueue(Object obj){    	list.addLast(obj);    }

    public Object peek() throws NoSuchElementException{
        if(list.isEmpty())
            throw new NoSuchElementException();
        else
            return list.getFirst();
    }

    public void clear(){        		list.clear();    		 }

    public boolean isEmpty(){        	return list.isEmpty();    }

    public int contains(Object obj){    return list.indexOf(obj); }

    public String toString(){        	return list.toString();   }

}
