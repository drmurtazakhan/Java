public class ListTest
{
	public static void main( String args[] ) {
                // Create list and insert heterogeneous nodes
    List list = new List();
    list.insertAtFront(new PhoneRecord("Ahmed M", "997-0020"));
    list.insertAtFront(new Integer(8647));
    list.insertAtFront(new String("Hello World"));
    list.insertAtRear(new PhoneRecord("Sami M", "997-2101"));
    list.insertAtRear(new PhoneRecord("Rami K", "997-2517"));    

    System.out.println("Generic List"); // Print the list
    list.print();
                 // Remove objects and print resulting list
    Object o;
    o = list.removeLast();
    System.out.println(" Removed " + o.toString());
    System.out.println("Generic List:");
    list.print();
    o = list.removeFirst();
    System.out.println(" Removed " +o.toString());
    System.out.println("Generic List:");
    list.print();
	} // main()
} 
