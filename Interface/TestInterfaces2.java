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
		System.out.println("Dhahran");
	}
	public void method2()
	{
		System.out.println("Riyadh");
	}	
}
class B extends A implements I2
{
	public void method1()
	{
		System.out.println("Dammam");
		super.method2();
	}
	public void method2()
	{
		System.out.println("Khober");		
		
	}
}
public class TestInterfaces2
{
	public static void main(String args[])
	{
		I2 o1 = new B();
		o1.method1();
		A o2 = (A) o1;
		o2.method1();
		
	}
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
