
class A
{
	private int x=7;
 	
    class B 
	{	private int y;
		public void method1() { y=x;}
		class C
		{
			private int z1,z2;
			public void method2() { z1=x; z2=y;}
		}
	}	
	
}

public class TestInnerclass2
{
	public static void main(String args[])
	{
		
		
	}
}

