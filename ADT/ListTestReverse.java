public class ListTestReverse
{	public static void main( String argv[] )
	{	List myList = new List();
		myList.insertAtFront("C");
		myList.insertAtFront("B");
		myList.insertAtFront("A");
		myList.print();
		List revList = new List();
		revList=myList.reverseList();
		revList.print();		
		List revList2 = new List();
		revList2=myList.reverseList2();
		revList2.print();				
		
		List myList2 = new List();
		myList2.reverseList2();
		
	}
}

