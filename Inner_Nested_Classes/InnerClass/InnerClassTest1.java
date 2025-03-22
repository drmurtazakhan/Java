class OuterClass
{	
	public String method1()
	{
		A obj = new A();
		return obj.method2();
	}		
	private class A
	{
		public String method2()
		{
			return "ICS 201";
		}		
	}
}
public class InnerClassTest1 
{
	public static void main(String[ ] args)
	{
		OuterClass obj = new OuterClass();
		System.out.println (obj.method1() );
	}
}
