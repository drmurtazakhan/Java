class NewThread implements Runnable{
   Thread t;
   NewThread(){
      t = new Thread(this, "Demo Thread");
      System.out.println("Child thread: "+t);
      t.start();
   }
   public void run(){
      try{
           for(int i=5; i>0; i--){
                System.out.println("Child thread: "+i);
                Thread.sleep((long)(Math.random()*500));
           }
      }catch(InterruptedException ie){
           System.out.println("Child thread interrupted.");
      }
      System.out.println("Exiting child thread.");
   }
}
class ThreadDemo{
   public static void main(String arg[]){
      new NewThread();
      try{
           for(int i=5; i>0; i--){
                System.out.println("Main thread: "+i);
                Thread.sleep((long)(Math.random()*500));
           }
      }catch(InterruptedException ie){
           System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread exiting.");
   }
}
