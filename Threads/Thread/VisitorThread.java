import java.util.*;
 public class VisitorThread extends Thread {
    private Object []array;
    public VisitorThread(Object array[]) {
       this.array = array;
    }
    public void run() {
       Integer temp;
       this.setName("The Visitor");
      for(int i = 0; i < array.length; i++){
          temp = (Integer)array[i];
          array[i] = new Integer (temp.intValue() + i);
          if(i%3 == 0) Thread.yield();          
      }
     System.out.println(getName() + " done!");
   }
 }
