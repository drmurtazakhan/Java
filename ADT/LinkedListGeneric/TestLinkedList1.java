public class TestLinkedList1
{
	public static void main( String argv[] ) {
    List list = new List();
    Student s1 = new Student("A",123);
    Student s2 = new Student("B",124);
    Student s3 = new Student("C",125);
    
    list.insertAtFront(s1);
    list.insertAtFront(s2);
    list.insertAtFront(s3);
    
    System.out.println("Generic List"); // Print the list
       
    list.print();
    System.out.println("------------"); 
    
    System.out.println(   list.getFirst() );
    Object o;
    o = list.removeFirst();
    System.out.println(   list.getFirst() );
    
	}
}


