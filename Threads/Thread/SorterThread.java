import java.util.*;
 public class SorterThread extends Thread {
   private Object []array;
   public SorterThread(Object array[]){
       this.array = array;
   }
   public void run() {
     int minPos = 0; Object temp;
      for(int i = 0; i < array.length - 1; i++){
          minPos = i;
          if(i%3 == 0) Thread.yield();          
          for(int k = i + 1; k < array.length; k++){
             if(((Integer)array[k]).compareTo(array[minPos]) < 0)
                  minPos = k;
          }
          temp = array[minPos];
          array[minPos] = array[i];
          array[i] = temp;
      }
     System.out.println(getName() + " done!");
   }
}
