public class ListTest2
{
	public static void main( String args[] ) {
                // Create list and insert heterogeneous nodes
    List list = new List();
    Student s1 = new Student("A",111);
    Student s2 = new Student("B",222);
    Student s3 = new Student("C",333);
    
    list.insertAtFront(s1);
    list.insertAtFront(s2);
    list.insertAtRear(s3);
    
    System.out.println("Generic List"); // Print the list
    list.print();
                 // Remove objects and print resulting list
    Object o;
    o = list.removeLast();
    System.out.println(" Removed Last " + o.toString());
    System.out.println("Generic List:");
    list.print();
    o = list.removeFirst();
    System.out.println(" Removed First " +o.toString());
    System.out.println("Generic List:");
    list.print();
	} // main()
} 
