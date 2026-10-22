import java.util.*;
 class TestArrayList2{
    public static void main(String s[]){
       ArrayList c, c1, c2 = new ArrayList(), c3 = new ArrayList();
       ListIterator iter = c3.listIterator();
       for(int i=0; i<s.length; i++)
         iter.add(s[i]);
       for(int i=0; i<10; i++)
         c2.add(new Integer(i));
       Collections.shuffle(c2);
       System.out.println("Shuffled: "+ c2);
       c1 = new ArrayList(c3);
       c2.addAll(3,c1); // add all items of c1 at position 3 in c2
       c = (ArrayList)c2.clone(); // make a exact copy of c2 assign to c
       c.remove(3); // delete item at postion 3 from c
       System.out.println(c);
       System.out.println(c1);
       System.out.println(c2);
       System.out.println(c3.containsAll(c1));
    }
 }
