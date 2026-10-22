class A
{
	public void method1()
	{
		System.out.println("red");
	}
	public void method2()
	{
		System.out.println("blue");
	}	
}

/* interface I1 extends A */   // not allowed
interface I1 
{
	public abstract void method1();	
}

public class TestInterface2
{
	public static void main(String args[])
	{
		A o1 = new A();
		o1.method1();
	}
}

