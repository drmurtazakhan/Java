interface I1
{	public void method1();
	public void method2();
	public void method3();
}
class Adapter implements I1
{	public void method1(){} // empty implementation
	public void method2(){} // empty implementation
	public void method3(){} // empty implementation
}
class A extends Adapter
{	public void method1()
	{	System.out.println("Happiness");
	}	
}
class B extends Adapter
{	public void method2()
	{	System.out.println("Hardwork");
	}		
}
class C extends Adapter
{	public void method3()
	{	System.out.println("Honesty");
	}
}
public class PolymorphismWithAdapterClass
{	public static void main(String [] args)
	{ 	Adapter o1=new C();
		polyMethod(o1);
  	}
  	public static void polyMethod(I1 obj)
	{	obj.method3();
		obj.method1();
		obj.method2();		
  	}
}
