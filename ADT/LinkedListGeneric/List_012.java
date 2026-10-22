class Node
{	private Object data;
    private Node next;  
    public Node(Object obj)
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
        else // Start at head of list
        {  	Node current = head;
        	while (current.getNext() != null)       
            current = current.getNext();
        	current.setNext(new Node(newObj));  
    	}      
	}
	public Object method3()
	{	Node first = head;
		head = head.getNext();
		return first;
	}		 
	public void print()  					
	{	Node current = head;                 
    	while (current != null)                    
    	{	System.out.print( current.toString()+"\t" ); 
    		current = current.getNext();              
    	}     	
    } 
}     // End of List class

public class List_012
{	public static void main( String args[] )
	{	List list = new List();
		/*list.method1("D"); 
	    list.method1("C");
	    list.method2("A");*/
	    /*
	    list.method1("B"); 
	    list.method1("F");
	    list.method2("G");*/
	    list.method1("K"); 
	    list.method1("M");
	    list.method2("B");
	    list.print();
	    System.out.println();       
	    list.method3();
	    list.print();
	    System.out.println();       
	    //list.method2("A");       
	    //list.method2("B");
	    list.method2("C");              
	    list.print();	   
	}
} 
