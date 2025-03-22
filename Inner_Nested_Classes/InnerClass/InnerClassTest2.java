class OuterClass
{	
	public void method1()
	{
		A obj = new A();
		obj.method2("Ali");
	}		
	private class A
	{
		public void method2(String s)
		{
			System.out.println (s );
		}		
	}
}
public class InnerClassTest2 
{
	public static void main(String[ ] args)
	{
		OuterClass obj = new OuterClass();
		obj.method1() ;
	}
}
