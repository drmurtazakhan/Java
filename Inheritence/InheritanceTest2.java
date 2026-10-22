class A
{	public void method1()
	{	System.out.println("yellow");
	}
	public void method2()
	{	System.out.println("blue");
	}
}
class B extends A
{	public void method2()
	{	System.out.println("green");
	}	
}	
class C extends B
{	public void method2()
	{	System.out.println("red");
	}	
}
public class InheritanceTest2
{	public static void main (String args[])
	{	B obj1 = new B();
		obj1.method2();
		B obj2 = new B();
		obj2.method1();
		C obj3 = new C();
		obj3.method1();
	}
}

