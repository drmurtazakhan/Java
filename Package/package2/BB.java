//package package2;
class AA{
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
public class BB extends AA{
   public BB(){
      System.out.println("Inside Class BB");
   }
   public int method1(int x){
      AA a = new BB();
      return a.method2(x);
   }
   public int method2(int x){
      return x;
   }
   public static void main(String [] x){
      BB b = new BB();
      System.out.println(b.method1(3));
   }
}
