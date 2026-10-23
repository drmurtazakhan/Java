public class StaticFieldTest1{
    static int A = 70;
      	int B = 50;
  public static void main(String[] args) {
	    StaticFieldTest1  obj1 = new StaticFieldTest1();
	    StaticFieldTest1  obj2 = new StaticFieldTest1();
	    obj1.A = 1;
	    obj2.A = 20;
	    StaticFieldTest1.A = 300;

	    obj1.B = 20;
	    obj2.B = 40;
 	    System.out.println(obj1.A +" "+obj1.B);
 	    System.out.println(obj2.A +" "+obj2.B);   
  }
}
