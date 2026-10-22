public class StackLinkedList
{
	private   LinkedList list;

    public  StackLinkedList() {
     list = new LinkedList();
    }

    boolean isEmpty() {
      return list.isEmpty();
    }
	
    public void push(Object e) {
     list.insert(0,e); 
    }
    public Object peek() {
	return list.nodeAt(0).getElement();
    }   
    public void pop() {
	list.remove(0);
    }
}
