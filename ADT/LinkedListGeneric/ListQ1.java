class Node
{	private Object data;  // Stores any kind of data
    private Node next;  
    public Node(Object obj) // Constructor
    {   data = obj;
        next = null;
    }                               
    public void setNext( Node nextPtr )
    {  next = nextPtr;
    }
    public Node getNext()
    { 	return next;
    }
    public void setData(Object obj)
    {   data = obj;
	}  
	public Object getData()
	{   return data;
	}
  	public String toString()
  	{   return data.toString();
	}
} // end of Node class
class List
{	private Node head;
    public List()
    { 	head = null;
    }
    public boolean isEmpty()
    {   return head == null;
    }    
    public void method1(Object newObj)
    {   Node current =  new Node( newObj );
    	current.setNext(head);
    	head = current;
	}   
	public void method2(Object newObj)
	{   if (isEmpty()) 
        head = new Node(newObj);
        else
        {  	Node current = head;                    // Start at head of list
        	while (current.getNext() != null)       // While not at end of list
            current = current.getNext();
        	current.setNext(new Node(newObj));  
    	}      
	}
	public Object method3()
	{	Node first = head;
		head = head.getNext();
		return first;
	}	
	public Object method4()
	{   if (isEmpty())  
		return null;      
    	Node current = head;
    	if (current.getNext() == null) // Singleton list
    	{ 	 head = null;
    		 return current;
    	}
    	Node previous = null;  
    	while (current.getNext() != null) // All other cases
    	{  	previous = current;
    		current = current.getNext();
    	}
    	previous.setNext(null);
    	return current;
    }
	public void print()  					// method to print the list
	{	if (isEmpty()) 
        System.out.println("list is empty");
    	Node current = head;                       // Start traversal at head
    	while (current != null)                    // While not at end of list
    	{	System.out.print( current.toString()+"\t" ); //   print node's data
    		current = current.getNext();              //   go to the next node
    	} 
    	System.out.println();       
    } 
}     // End of List class

public class ListQ1
{	public static void main( String args[] )
	{	List list = new List();
		list.method1("D");
	    list.method1("C");
	    list.method2("A");
	    list.print();
	    list.method3();
	    list.print();
	    list.method2("B");       
	    list.print();
	    list.method4();
	    list.print();
	}
} 
