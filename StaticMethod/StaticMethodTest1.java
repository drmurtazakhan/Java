public class StaticMethodTest1 extends A
{
	public static void main(String args[])
	{
		A.method1();
		method1();
	} 
	public static void method1()
	{
		System.out.println("Peace==Islam");
	}
	
} 
class A
{	
	public static void method1()
	{
		System.out.println("Islam==Peace");
	}	
} 

	