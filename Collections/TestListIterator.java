  import java.util.*;
  public class TestListIterator {
     public static void main(String[] args) {
        //LinkedList  list = new LinkedList();
        ArrayList  list = new ArrayList();
 
        ListIterator iter2, iter1 = list.listIterator();
 
        for(int i = 0; i < 6; i++)
         iter1.add(new Integer(i));

       iter2 = list.listIterator();
       iter2.next();                // skip the first element
       iter2.add(new Integer(25));  // add immediately after the first

       System.out.println(list);
    }
 }
