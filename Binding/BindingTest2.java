public class BindingTest2 
{	public static void main(String[] args) 
	{	classA obj1= new classB();
		classB obj2= new classC();
		obj1.method3();
		obj1.method2();
		obj2.method3();
	}
}
class classA
{	public void method1()
	{	System.out.println("method1 in class A");
	}
	public void method2()
	{	System.out.println("method2 in class A");
	}
	public void method3()
	{	System.out.println("method3 in class A");
	}
}
class classB extends classA
{	public void method1()
	{	System.out.println("method1 in class B");
	}
	public void method2()
	{	super.method1();  
	}
	public void method3()
	{	this.method1();   
	}
}
class classC extends classB
{	public void method1()
	{	System.out.println("method1 in class C");
	}
	
}