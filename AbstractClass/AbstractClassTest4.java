abstract class C1
{	public abstract void method1();
	
}
abstract class C2 extends C1
{	public abstract void method2();
	
}
class A extends C1
{	public void method1()
	{	System.out.println("Dammam");
	}
	public void method2()
	{	System.out.println("Khobar");
	}
}
class B extends A 
{	public void method1(C1 a)
	{	A o3;
		o3= (A) a;
		o3.method2();
		method2();
	}
	public void method2()
	{	System.out.println("Jeddah");		
		
	}
}
public class AbstractClassTest4
{	public static void main(String args[])
	{	B b1 = new B();
		C1 o2 = new A();
		b1.method1(o2);
		o2.method1();
	}
}

