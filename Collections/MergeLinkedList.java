import java.util.*;

public class MergeLinkedList
{
	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		for(int i = 20; i <= 30; i++)
			list1.add(new Integer(i));
			
		for(int i = 1; i <= 7; i++)
			list2.add(new Integer(i));
			
		System.out.print("list1 is " + list1 + "\n");
		System.out.print("list2 is " + list2 + "\n");
			
		ListIterator iterator1 = list1.listIterator();
		ListIterator iterator2 = list2.listIterator();
		
		while(iterator2.hasNext())
		{
			if(iterator1.hasNext())
			     iterator1.next();
			iterator1.add(iterator2.next());
		}
		
		System.out.println("The merged list is:");
		System.out.println(list1);
	}
}