class OurClass extends Thread{
	
   public void run(){
   	
      for(int i=0; i<100; i++) 
      System.out.println("Salam ");
    
         
   }
}
public class OurClassTester2{
   public static void main(String args[]){
       
       new OurClass().start();
       run();
       
       
   }
   static void run(){
      for(int i=0; i<100; i++) 
         System.out.println("Shabab.");
   }
   
   
   }
