public class ListTest2
{	public static void main( String argv[] )
	{	List myList = new List();
		myList.method1("D");   
		myList.method1("G");   
		myList.print();
		myList.method2("R");
		myList.method1("F");   
		myList.method2("S");
		myList.print();
		myList.method3();
		myList.print();
	}
}

class List {
    private Node head;
   
    public List() {
        head = null;
    }
   
    public boolean isEmpty() {
        return head == null;
    }
           
	public void method2(Object newObj) {
	    if (isEmpty()) 
	        head = new Node(newObj);
	    else {
	        Node current = head;                 // Start at head of list
	        while (current.getNext() != null)   
	            current = current.getNext();
	        current.setNext(new Node(newObj));  // Insert the newObj
	    	}      
	} 
	
	public void method1(Object newObj) {
	    Node current =  new Node( newObj );
	    current.setNext(head);
	    head = current;
	}
	
    public Object method3() {
	    Node first = head;
	    head = head.getNext();
	    return first;
	} 
		
	public void print() {
	    if (isEmpty()) 
        System.out.println("Phone list is empty");
    	Node current = head;          // Start traversal at head
    		while (current != null) {                     // While not at end of list
	        	System.out.print(current.toString()+" "); //   print node's data
	        	current = current.getNext();              //   go to the next node
    		}
    	System.out.println();	       
	} // print()


} // List

class Node {
    private Object data;  // Stores any kind of data
    private Node next;
  
    public Node(Object obj) {  // Constructor
        data = obj;
        next = null;
    }                               
  
    public void setNext( Node nextPtr ) { 
        next = nextPtr;
    }
  
    public Node getNext() {
        return next;
    }
    public void setData(Object obj) { 
    	data = obj;
	}
	public String toString() {
    	return data.toString();
	}

} // Node

