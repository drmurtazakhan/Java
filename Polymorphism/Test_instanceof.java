class A { }
class B extends A{ }
public class Test_instanceof {
     public static void main(String [] args)
     {   A obj = new B();      
	     System.out.println(obj instanceof B);
     }
}
