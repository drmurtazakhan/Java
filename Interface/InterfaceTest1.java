interface I1
{	public void method1(); }

interface I2
{	public void method2(); }

interface I3 extends I1,I2
{	public void method3(); }


class A implements I3 
{
	public void method3() {}	
	public void method2() {}	
	public void method1() {}	
}

public class InterfaceTest1
{
	public static void main(String[] args) 
	{	
	}
}