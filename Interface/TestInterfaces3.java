interface I1
{
	public void method1();
	
}
interface I2 extends I1
{
	public void method2();
	
}
class A implements I1
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
class B extends A implements I2
{
	public void method1(I1 a)
	{
		A o3;
		o3= (A) a;
		o3.method2();
		method2();
	}
	public void method2()
	{
		System.out.println("Jeddah");		
		
	}
}
public class TestInterfaces3
{
	public static void main(String args[])
	{
		B b1 = new B();
		I1 o2 = new A();
		
		b1.method1(o2);
		o2.method1();
	}
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
