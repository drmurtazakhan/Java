import java.util.LinkedList;
import java.util.ListIterator;
public class ListTest1 { 
  public static void main(String[] args) {  
    LinkedList staff = new LinkedList();
    staff.addLast("Ali");
    staff.addLast("Hamed");
    staff.addLast("Fahad");
    staff.addLast("Saad");
// | in the comments indicates the iterator position 
      ListIterator iterator = staff.listIterator();// |AHFS
      iterator.next(); // A|HFS
      iterator.next(); // AH|FS
// add more elements after second element
      iterator.add("Jameel"); // AHJ|FS
      iterator.add("Rami"); // AHJR|FS
      iterator.next(); // AHJRF|S
// remove last traversed element
      iterator.remove(); // AHJR|S
// print all elements
     iterator = staff.listIterator();
     while(iterator.hasNext())
        System.out.println(iterator.next());
   } // End of main() method
} // End of ListTest1 class

