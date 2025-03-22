class A
{	class B
	{	public void method1(){System.out.println("1");}
	}
}
public class MemberClassExample
{	public static void main(String [] s) 
	{
		A.B o1=new A().new B(); // statement1
		o1.method1();
		//B o1=new A().new B(); // statement2 not allowed		 
		//B o2=A.new B();       // statement3 not allowed
		//A o3=new A().new B(); // statement4 not allowed				
	}	
}