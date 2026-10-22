import java.util.*;
public class TestListIterator3
{	public static void main(String[] args)
	{
		LinkedList  list = new LinkedList();				
		for(int i = 5; i < 11; i++)
		list.add(new Integer(i));		
		ListIterator iter = list.listIterator();
		iter.next();				
		iter.next();				
		iter.remove();
		while (iter.hasNext())		
			System.out.print(iter.next()+" ");		
		
	}
}