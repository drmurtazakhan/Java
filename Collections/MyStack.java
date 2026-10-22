import java.util.*;
public class MyStack{
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

    public void push(Object obj) {	list.addFirst(obj);    	}

    public Object peek() throws NoSuchElementException{
        if(list.isEmpty())
            throw new NoSuchElementException();
        else
            return list.getFirst();
    }

    public void clear(){        		list.clear();			}

    public boolean isEmpty(){   		return list.isEmpty();   }

    public int contains(Object obj){  return list.indexOf(obj); 	}

    public String toString(){        	return list.toString();  }
}
