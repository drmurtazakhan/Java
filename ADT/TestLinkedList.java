public class TestLinkedList
{
	public static void main(String [] args)
	{
		String [] courses = {"ICS202", "ICS313", "ICS102", "ICS232", "ICS201"};
		LinkedList myList1 = new LinkedList();
		for(int i=0; i<courses.length; i++)
		myList1.insert(i, courses[i]);         
		System.out.println("Original List");
		myList1.printList();
		System.out.println("Sorted List");        
		LinkedList sortedList =  myList1.sort(myList1);
		sortedList.printList();
    }    
} 
    