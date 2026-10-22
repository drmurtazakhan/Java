import java.util.*;
 class MyArrayList extends ArrayList{
    public MyArrayList(int size){
       super(size);
    }
    public void removeRange(int x, int y){ //protected method of ArrayList
       super.removeRange(x,y);
    }
 }
 class TestArrayList{
    public static void main(String s[]){
       MyArrayList c = new MyArrayList(100); //initial capacity
       ListIterator iter = c.listIterator();
       for(int i=0; i<6; i++)
         iter.add(new Integer(i)); // using iterator's add
       c.add(2,"ICS 201"); // using collection's add
       System.out.println(c);
       c.removeRange(3,6);
       System.out.println(c);
    }
 }
