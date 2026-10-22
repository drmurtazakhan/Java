import java.util.*;
class CollectionTest1{
    public static void main(String s[]){
       LinkedList lst1=new LinkedList();
       lst1.add(new Integer(5));
       lst1.add(new Integer(3));
       lst1.add(new Integer(2));
       lst1.add(new Integer(7));
       System.out.println(lst1);
       lst1.add(0,new Integer(4));
       System.out.println(lst1);
       
       LinkedList lst2=new LinkedList();
       lst2.add(new Integer(5));
       lst2.add(new Integer(2));
       lst1.removeAll(lst2);
       System.out.println(lst1);
       
       ListIterator  itr  =  lst1.listIterator(); 
       itr.next();
       itr.add(new Integer(10));
       System.out.println(lst1);
    }
 }
