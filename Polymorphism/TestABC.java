class A
{
	public void method1()
	{
		System.out.println("green");
	}
	public void method2()
	{
		System.out.println("red");
	}
}
class B extends A
{
	public void method1()
	{
		System.out.println("yellow");
	}
	public void method2()
	{
		System.out.println("white");
	}
		
}
class C extends B
{
	public void method1()
	{
		System.out.println("blue");
		super.method1();
	}
}
public class TestABC
{
	public static void main(String [] args)
	{
		A a = new B();
		a.method1();
		B b = new C();
		b.method1();
		B c = new C();
		c.method2();
  	}
}
