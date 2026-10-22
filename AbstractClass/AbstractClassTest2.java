public class AbstractClassTest2 extends Liquid
{
	public static void main(String args[])
	{
		double fp=Liquid.waterFreezingPoint();
		System.out.println(fp);
		AbstractClassTest2 a = new AbstractClassTest2();
		System.out.println(a.getName());
		Liquid l1 = new AbstractClassTest2();
		System.out.println(l1.getName());
		l1.m1();
	} // End of main() method
	public void m1()
	{
		System.out.println("m1 is implemented in the class that extends abstarct class");
	}	
} // End of class AbstractClassTest
abstract class Liquid
{
	int x, y;
	String name="water";
	public static double waterFreezingPoint()
	{
		return 0;
	}
	public String getName()
	{
		return name;
	}
	public abstract void m1();
} //// End of abstract class Liquid