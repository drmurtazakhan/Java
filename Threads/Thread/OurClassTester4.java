class OurClass extends Thread{
   public void run(){
      for(int i=0; i<3; i++) 
         System.out.println("Salam ");
   }
}
class OurClass2 extends Thread{
   public void run(){
      for(int i=0; i<3; i++) 
         System.out.println("Hello ");
   }
}
public class OurClassTester4{
   public static void main(String args[]){
       OurClass oc = new OurClass();
       oc.start();
       OurClass2 oc2 = new OurClass2();
       oc2.start();
       xyz(); 
   }
   static void xyz(){
      for(int i=0; i<3; i++) 
         System.out.println("Shabab.");
   }}
