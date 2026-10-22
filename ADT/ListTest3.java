public class ListTest3
{	public static void main( String argv[] )
	{	List myList = new List();
		myList.method2("B");   
		myList.method1("W");   
		myList.print();
		myList.method2("M");
		myList.method1("P");   
		myList.method2("G");
		myList.print();
		myList.method3();
		myList.print();
		myList.method4();
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
	        Node current = head;                 
	        while (current.getNext() != null)   
	            current = current.getNext();
	        current.setNext(new Node(newObj));  
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
	public void method4() {
	    head=null;	    
	}		
	public void print() {
	    if (isEmpty()) 
        System.out.println("list is empty");
    	Node current = head;          
    		while (current != null) { 
	        	System.out.print(current.toString()+" "); 
	        	current = current.getNext();              
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

