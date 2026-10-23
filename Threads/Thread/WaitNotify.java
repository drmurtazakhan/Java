import javax.swing.*;
class Dealer{
   private int goods = 0;
   public synchronized int consume(){
   //public  int consume(){	
      int temp;
      while(goods==0){
          try{
             wait();
             //Thread.sleep(100);
          } catch(InterruptedException e){}
       }
       temp  = goods;
       goods = 0;
       System.out.println("Consumed: "+temp);
       notify();
       return temp;
   }
   public synchronized void produce(int amount){
   	//public  void produce(int amount){
      int temp;
      while(goods != 0){
          try{
             wait();
          } catch(InterruptedException e){}
       }
       goods = amount;
       notify();
       System.out.println("Produced: "+goods);
   }
}
class MyThread extends Thread{
   private boolean producer = false;
   private Dealer dealer;

   public MyThread(Dealer d, String type){
      dealer = d;
      if(type.equals("Producer"))
          producer = true;
   }

   public void run(){
      int temp;
      for(int i=0; i<10; i++){
      	
          try{
             //sleep((int)(Math.random()*200));
             sleep((int)2000);
          } catch(InterruptedException e){}
          if (producer)
              dealer.produce((int)(Math.random()*10)+1);
          else dealer.consume();
      }
    }
}
public class WaitNotify extends JApplet{
   private Dealer dealer = new Dealer();
   public void init(){
//note that setting priority for any of these has no effect.
        
        new MyThread(dealer, "Producer").start();
        new MyThread(dealer, "Consumer").start();
   }
}
