import java.util.*;
 public class TesterThread extends Thread {
   private static Object []array;
   public TesterThread(int size) {
      array = new Object[size];
   }
   public static void main(String args[]) {
      Random r = new Random();
      new TesterThread(10);
      for(int i = 0; i < array.length; i++){
          array[i] = new Integer(r.nextInt(100));
          System.out.print(array[i]+" ");
      }
      SorterThread sorter = new SorterThread(array);
      VisitorThread visitor = new VisitorThread(array);
      sorter.start();
      visitor.start();
      //visitor.setPriority(Thread.MAX_PRIORITY);
      //Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
      System.out.println();
      System.out.println(Thread.currentThread().getName() + " done!");
      System.out.println();
      for(int i = 0; i < array.length; i++){
          System.out.print(array[i]+" ");
      }
   }
}
