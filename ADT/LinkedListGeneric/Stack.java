public class Stack extends List {

    public Stack() {
        super();
    }
	public boolean isEmpty() {
      return super.isEmpty();
    }
    public void push( Object obj ) {
        insertAtFront(obj);
    }   
    public Object pop() {
        return removeFirst();
    }       
    public Object peek() {
        return getFirst();
    }       
} 
