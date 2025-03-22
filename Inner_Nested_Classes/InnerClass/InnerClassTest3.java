class Person
{
	
	
}
class B extends Person
{
	public void method1(String n)
	{
		
	}
}

class C 
{
	public void method2()
	{
		new B().method1("Ali");
	}   
}  

public class InnerClassTest3
{
	public static void main(String args [] )
	{
		new C().method2();
    }
}