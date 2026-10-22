import java.util.*;
public class ArrayListTest2
{
 public static void main(String[] args)
 {
  /** creating an object of class ArrayList */
  ArrayList  list = new ArrayList();
  
  /** calling method listIterator from ArrayList object.
      This method returns a list iterator to the start 
   of the invoking list object. */
   
  ListIterator iter = list.listIterator();
  
  for(int i = 0; i < 10; i++)
  /** calling method add from ListIterator object
  to insert object in list */
  iter.add(new Integer(i));
  System.out.println(list+"       original list"); // print list
  
  list.add(5,new Integer(14));
  System.out.println(list+"   14 added"); // print list
  list.remove(7);
  System.out.println(list+"      6 removed"); // print list
  list.set(8,new Integer(18));
  System.out.println(list+"     8 replaced with 18"); // print list
  
  System.out.println("size of list is "+list.size());
  System.out.println("Element as last position is "+list.get(list.size()-1));
 }
} 