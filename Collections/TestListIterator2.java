import java.util.*;
  public class TestListIterator2 {
     public static void main(String[] args) {
        ArrayList  list = new ArrayList();
        int bonus = 1;
 
        for(int i = 0; i < 6; i++)
          list.add(new Integer(i));
 
       ListIterator iter = list.listIterator();

       System.out.println("List before: " + list);

       while (iter.hasNext()){
          Integer myInt = (Integer)iter.next();
          iter.set(new Integer(myInt.intValue()+bonus));
       }
       System.out.println("List after : " + list);
    }
 }
