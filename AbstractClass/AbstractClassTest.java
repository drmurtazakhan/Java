public class AbstractClassTest
{
	public static void main(String args[])
	{
		
	} // End of main() method
} // End of class AbstractClassTest
abstract class Liquid
{
	int x, y;
	String name;
	public abstract void m1();
} // End of abstract class Liquid

class A extends Liquid
{
	public void m1(){}
	private int x=2;
}