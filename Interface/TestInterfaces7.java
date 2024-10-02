/** 
 * This program shows that if a class implements an interface then its child
 * classes are not required to implement that interface 
 * @author Murtaza Ali Khan 
 * Copy Right Murtaza Ali Khan 
 * Email: murtaza@ccse.kfupm.edu.sa 
 * This program does not imply any warranty direct of implied.
 */
interface I1
{
	public void method1();
	
}

class A implements I1
{
	public void method1()
	{
		System.out.println("Dammam");
	}	
}

class B extends A
{	
	public void method2()
	{
		System.out.println("Jeddah");		
		
	}
}
public class TestInterfaces7
{
	public static void main(String args[])
	{
		I1 a1 = new A();
		B b1 = new B();
		a1.method1();				
		b1.method2();				
	}
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ


