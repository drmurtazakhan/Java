public class AbstractClassTest3
{
	public static void main(String args[])
	{
		A o1= new C();
		o1.method1();
		A o2= new B();
		o2.method1();
	} 
} 
abstract class A
{	
	public abstract void method1();
	public void method2()
	{
		System.out.println("Makkah");
	}
} 
class B extends A
{
	public void method1()
	{
		System.out.println("Dammam");
	}
	public void method2()
	{
		System.out.println("Khobar");
	}	
}
class C extends B
{
	public void method1()
	{
		System.out.println("Jeddah");
		super.method2();	
	}	
}
	