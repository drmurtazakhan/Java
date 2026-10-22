import java.util.*;
class LinkedList2{
    public static void main(String s[]){
       LinkedList lst1=new LinkedList();
       lst1.add(new Integer(4));
       lst1.add(new Integer(8));
       lst1.add(new Integer(2));
       lst1.add(new Integer(3));
       System.out.println(lst1);
       lst1.add(0,new Integer(15));
       System.out.println(lst1);
       
       LinkedList lst2=new LinkedList();
       lst2.add(new Integer(4));
       lst2.add(new Integer(2));
       lst1.removeAll(lst2);
       System.out.println(lst1);
       
       ListIterator  itr  =  lst1.listIterator(); 
       itr.next();
       itr.add(new Integer(12));
       System.out.println(lst1);
    }
 }
