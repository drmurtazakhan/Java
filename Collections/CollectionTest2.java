import java.util.*;
class CollectionTest2{
    public static void main(String s[]){
       LinkedList lst1=new LinkedList();              
       lst1.add(new Integer(4));
       lst1.add(new Integer(8));
       lst1.add(new Integer(2));       
       LinkedList lst3=(LinkedList) lst1.clone();
       Iterator  itr1  =  lst1.iterator(); 
       itr1.next();
       itr1.next();
       itr1.remove();
       System.out.println(lst1);
       
       LinkedList lst2=new LinkedList();       
       lst2.add(new Integer(4));
       lst2.add(new Integer(8));
       lst2.add(new Integer(2));
       ListIterator itr2 = lst2.listIterator(lst2.size());
       itr2.previous();       
       itr2.set(new Integer(7));
       System.out.println(lst2);
       
       System.out.println(lst3);                      
       lst3.retainAll(lst1);
       System.out.println(lst3);                      
    }
 }
