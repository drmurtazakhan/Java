import java.util.*;

public class ReverseLinkedList
{
	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		for(int i = 1; i <= 10; i++)
			list1.add(new Integer(i));
			
		System.out.print("         The list is: ");	
		System.out.println(list1);
			
		ListIterator iterator1 = list1.listIterator(list1.size());
		
		while(iterator1.hasPrevious())
		
			list2.add(iterator1.previous());
			
		System.out.print("The reversed list is: ");
		System.out.println(list2);
	}
}