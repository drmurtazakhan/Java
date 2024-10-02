interface I1
{
	final int x=7;
	public void method1();
	
}

abstract class A implements I1
{
	//public void method1(){};
}
class B extends A 
{
	final int y=7;
	int z;
	public void method1(){};
	public  void method2(){z=x;}
	
}

public class TestInterfaces6
{
	public static void main(String args[])
	{
		B obj = new B();
		
	}
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ


