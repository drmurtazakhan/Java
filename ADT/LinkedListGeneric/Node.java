public class Node {
    private Object data;  // Stores any kind of data
    private Node next;
  
    public Node(Object obj) {  // Constructor
        data = obj;
        next = null;
    }
                               
  // Link access methods
    public void setNext( Node nextPtr ) { 
        next = nextPtr;
    }
  
    public Node getNext() {
        return next;
    }
    public void setData(Object obj) { 
    data = obj;
	}
  
	public Object getData() {
    return data;
	}
  
	public String toString() {
    return data.toString();
	}

} // Node
// Data access methods 
