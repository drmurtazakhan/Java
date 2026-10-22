public class List {
    private Node head;
   
    public List() {
        head = null;
    }
   
    public boolean isEmpty() {
        return head == null;
    }
    

    public void insertAtFront(Object newObj) {
    Node current =  new Node( newObj );
    current.setNext(head);
    head = current;
	}
   
	public void insertAtRear(Object newObj) {
    if (isEmpty()) 
        head = new Node(newObj);
    else {
        Node current = head;                    // Start at head of list
        while (current.getNext() != null)    // Find the end of the list
            current = current.getNext();
        current.setNext(new Node(newObj));  // Insert the newObj
    	}      
	} // insertAtRear()
	public Object removeLast() {
		if (isEmpty())  // Empty list
		 return null;      
    	Node current = head;
    	if (current.getNext() == null) { // Singleton list
    		 head = null;
    		 return current;
    	 }
    	 Node previous = null;  
    	    
    	 while (current.getNext() != null) { // All other cases
    	 	previous = current;
    	 	current = current.getNext();
    	 }
    	 previous.setNext(null);
    	 return current;
    	 } // removeLast()
    	 
    	 public Object removeFirst() {
	    Node first = head;
	    head = head.getNext();
	    return first;
		} // removeFirst()
		
		public Object getFirst() {
	    Node first = head;
	    return first.getData();
		}
		
		public void print() {
	    if (isEmpty()) 
        System.out.println("Phone list is empty");
    	Node current = head;          // Start traversal at head
    	while (current != null) {                     // While not at end of list
        System.out.println( current.toString() ); //   print node's data
        current = current.getNext();              //   go to the next node
    	}       
} // print()



} // List
