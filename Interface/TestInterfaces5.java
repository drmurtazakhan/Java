interface I1
{	public void method1(); }

interface I2
{	public void method2(); }
interface I3 extends I2
{	public void method3(); }

class A implements I1,I3
{
	public void method1(){}
	public void method2(){}
	public void method3(){}
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
