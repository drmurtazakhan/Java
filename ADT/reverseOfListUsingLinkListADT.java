public class reverseOfListUsingLinkListADT
{
	public static void main(String [] args)
	{
		String [] courses = {"ICS102", "ICS201", "ICS202", "ICS232", "ICS313"};
		LinkedList myList1 = new LinkedList();
		for(int i=0; i<courses.length; i++)
		myList1.insert(i, courses[i]);         
    	LinkedList myList2;
    	myList2 = myList1.reverseOf(myList1);
    	myList1.printList();
    	System.out.println("Printing Reversed List");
    	myList2.printList();
    }    
} 
    