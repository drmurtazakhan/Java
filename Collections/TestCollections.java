import java.util.*;
 class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
       int i1 = ((Integer)obj1).intValue();
       int i2 = ((Integer)obj2).intValue();
       return Math.abs(i2) - Math.abs(i1); // +ve value, descending ordering
    }
 }
 public class TestCollections {
    public static void main(String args[]) {
       ArrayList array = new ArrayList();
       array.add(new Integer(-200));
       array.add(new Integer(100));
       array.add(new Integer(400));
       array.add(new Integer(-300));
       Collections.sort(array);
       System.out.println("Natural ordering: " + array);
       Collections.sort(array, new MyComparator());
       System.out.println("My own ordering : " + array);
    }
 }
