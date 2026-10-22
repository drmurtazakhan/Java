public class TestAbstractClass
{
	public static void main(String args[])
	{
		System.out.println( AbstractClasswithoutAbstractMethod.dummy );
	} 
} 
abstract class A
{
	 static int dummy=5;
	 public abstract double area();

}
abstract class B extends A
{
	public abstract double area();

}
class C extends B
{
	public  double area()
	{
		return 0;
	}

}


