public class AbstractClassTest5
{
	public static void main(String args[])
	{
		B o1= new C();
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
		System.out.println("red");
	}
} 
class B extends A
{
	public void method1()
	{
		System.out.println("green");
	}
		
}
class C extends B
{
	public void method1()
	{
		System.out.println("orange");
		super.method2();	
	}	
}
	