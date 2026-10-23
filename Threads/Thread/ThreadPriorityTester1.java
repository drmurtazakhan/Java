class OurClass extends Thread{
   public void run(){
   	     for(int i=0; i<3; i++) 
         System.out.println("Salam ");
   }
}
public class ThreadPriorityTester1{
   public static void main(String args[]){
   	   OurClass oc = new OurClass();
   	   oc.setPriority(Thread.MAX_PRIORITY-1); 	
       oc.start();
       abc(); 
       
       System.out.println("Priority of OurClass thread is "+oc.getPriority());
       
   }
   static void abc(){
      for(int i=0; i<3; i++) 
         System.out.println("Shabab.");
   }}
