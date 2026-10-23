package package1;
public class AA{
   public AA(){
      System.out.println("Inside Class AA");
   }
   int method1(int x){
      return x*x;
   }
   public int method2(int x){
      return method1(x) + method1(x);
   }
}