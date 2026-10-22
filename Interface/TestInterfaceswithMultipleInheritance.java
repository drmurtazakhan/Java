interface I1
{
	public void method1();
	
}
interface I2
{
	public void method2();
	
}

interface I3 extends I1,I2
{
}

class A implements I3
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

public class TestInterfaceswithMultipleInheritance
{
	public static void main(String args[])
	{
		I3 o1 = new A();		
		o1.method1();
		o1.method2();
	}
}

