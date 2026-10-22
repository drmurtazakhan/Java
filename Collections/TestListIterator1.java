import java.util.*;

public class TestListIterator1
{
	public static void main(String[] args)
	{
		LinkedList  list = new LinkedList();
		
		for(int i = 0; i < 6; i++)
			list.add(new Integer(i));
			
		ListIterator iter = list.listIterator();
		
		System.out.println(iter.next()); // skip the first element; 
										 // but return a reference to the skipped element
										 // Thus the iterator position is 1 but the reference is pointing
										 // to 0. Hence the output is 0

		iter.add(new Integer(25));	// add a new element immediately after the first. That is, the element is
									// added before the current iterator position
		
		/*The add( ) method of a ListIterator adds a new element before the current listIterator position.
		 Thus, calling add( ) does not affect the value returned by next( ); however if you call previous( )
		  immediately after calling add( ), 
		  the method returns a reference to the object that was just added.*/
		  
		System.out.println(iter.next()); // The add did not affect the iterator position. Thus the iterator
										// skips 1 and return a reference to this skipped element. Hence the
										// output is 1
			
		System.out.println(list);
	}
}