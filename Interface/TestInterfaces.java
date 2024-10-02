interface I1
{
	public abstract void method1();	
}
interface I2 extends I1
{
	public void method2();
	
}

class A implements I1
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
class B extends A implements I2
{
	public void method1()
	{
		System.out.println("yellow");
	}
	public void method2()
	{
		System.out.println("green");		
		super.method2();
	}
}
public class TestInterfaces
{
	public static void main(String args[])
	{
		I2 o1 = new B();
		
		o1.method2();
		I1 o2 = new A();
		o2.method1();
	}
}


// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
