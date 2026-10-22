 import java.util.*;
 public class TestIterator {
    public static void main(String[] args) {
       //LinkedList  list = new LinkedList();
       ArrayList  list = new ArrayList();

       for(int i = 0; i < 6; i++)
         list.add(new Integer(i));

       Iterator iter = list.iterator();

       while (iter.hasNext()){
          Integer myInt = (Integer)iter.next();
          System.out.print(myInt+" ");
       }
       System.out.println();
    }
 }
