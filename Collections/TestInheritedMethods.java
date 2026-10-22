import java.util.*;

public class TestInheritedMethods
{
	public static void main(String[] args)
	{
		LinkedList  list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		System.out.println(list1.isEmpty());
		System.out.println(list1.equals(list2));
		
		ListIterator iter1 = list1.listIterator();
		ListIterator iter3 = list2.listIterator();
		
		iter3.add(new Integer(10));
		iter3.add(new Integer(5));
		
		System.out.println(list1.equals(list2));
		
		for(int i = 0; i < 15; i++)
			iter1.add(new Integer(i));
			
		list1.removeAll(list2);
			
		System.out.println(list1);
		System.out.println(list2);
		
		// creating a sublist of a linked list
		LinkedList list3 = new LinkedList(list1.subList(2, 7));
		
		System.out.println(list3);
	}
}