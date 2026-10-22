class Node {
   private Object element;// object type stored in this node
   private Node next; 	  // reference to the next node in the list

   // default constructor
   public Node() {			
     element = null;
     next = null;
   }

   // constructor initialises node with new element + reference to next node
   public Node(Object e, Node n) {	
     element = e;			
     next = n;
   }

   public void setElement(Object newElem) { // set new element 
  	element = newElem;
   }

   public void setNext(Node newNext) { 	// set new next node
  	next = newNext;
   }

   public Object getElement() { // return element in this node
  	return element;
   }
  
  public Node getNext() { 	// return reference to next node
  	return next;
  }
}
public class LinkedList {
   private Node header;	// list sentinel header node 
   private int length; 	// record length of list

   public LinkedList() {// default constructor initialises list
     header = new Node();// create sentinel header node
     length = 0;	// set length to 0	
   }

   public void clear() { 	
  // initialise a list
     header.setNext(null);
   }  
   public boolean isEmpty() {
  // test if list is empty
     return (header.getNext() == null);
   }  
   public Node getHead() {
  // return first node 
     return header.getNext();
   }  
   public int length() {
  // return list length
     return length;
   }  
   public void insert(int index, Object e) throws IndexOutOfBoundsException {
      Node previous, newNode;
      if ((index < 0 || index > length))
	throw new IndexOutOfBoundsException("index invalid");
     if (index == 0) // inserting at position 0
          header.setNext(new Node(e,header.getNext()));    
     else {
        previous = nodeAt(index-1);   // locate previous node
        newNode  = new Node(e,previous.getNext());  // create new node
        previous.setNext(newNode);     // previous node points to new node
     }
     length++;                      // increment length
   }  
   public void remove(int index) throws IndexOutOfBoundsException {
     if ((index < 0 || index >= length))
      throw new IndexOutOfBoundsException("invalid index");
	if (index==0)
	header.setNext(header.getNext().getNext());
	else{		   
     Node p = this.nodeAt(index-1);     // locate previous node
     p.setNext(p.getNext().getNext());  // disconnect deleted node
    }
     length--;                          // decrement length
   }	
   public void update(int index, Object e) throws IndexOutOfBoundsException {
      if ((index < 0 || index >= length))
          throw new IndexOutOfBoundsException("invalid index");
      this.nodeAt(index).setElement(e);
   }	
   public int indexOf(Object e) {   // 
    int index = 0;
      for (Node n = header.getNext(); n != null; n = n.getNext()) {
        if (e.equals(n.getElement()))
           return index;
        index++;
      }
      return -1;
   }
   public LinkedList reverseOf(LinkedList list) {
      LinkedList reverse = new LinkedList(); 
      for(int i=0; i<list.length();i++) {
      	    //reverse.insert(0,retrieve(i));
      	    // always inserting at index 0 of linked-list "reverse" the element at index
      	    // i of linked-list "list"
      	    reverse.insert(0,list.nodeAt(i).getElement()); 
       }
       return reverse;
   }	

   public Node nodeAt(int p) {   // 
     Node node = header.getNext();
     while(p>0){
       p--;
       node = node.getNext();
      }
      return node;
   }
   public void printList() {   // 
     Node node = header.getNext();
     while(node != null){
        System.out.println(node.getElement());
        node = node.getNext();
      }
   } 
   /* sorting linked list */
   public LinkedList sort(LinkedList list) {
     LinkedList sortedList = new LinkedList(); 
     for(int k=0;k<list.length();k++) 
     sortedList.insert(sortedList.length(),list.nodeAt(k).getElement()); 
     
     int  i, j;
	 String current;
	 for(i=1; i<sortedList.length();i++){ 
		current = (String) sortedList.nodeAt(i).getElement();
		for (j = i; j>0 && current.compareTo((String)sortedList.nodeAt(j-1).getElement() ) < 0  ; j--){
			sortedList.nodeAt(j).setElement( sortedList.nodeAt(j-1).getElement() );
			
		}
		sortedList.nodeAt(j).setElement(current);
		
	  }
      return sortedList;
  }
     
}  

