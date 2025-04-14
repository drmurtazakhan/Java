class A {
  protected int x=4;
  protected int y=3;
  public A () {
     System.out.println(x);
  }
}
class B extends A{
	private int y=2;
  public B () {
     super();
     x=5;
     System.out.println(x);
  }
}
public class TestAB {
     public static void main(String [] args){
    A obj = new B();
    System.out.println(obj.y);
     }
}
