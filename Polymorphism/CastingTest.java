class A
{
}
class B extends A
{
}
public class CastingTest
{
	public static void main(String[] args) 
	{	
		A obj1 = new B();
		//B obj2 = new A();  // not allowed
		B obj5 = (B) obj1; // run time error
		//B obj3 = (B) new A(); // run time error
		B obj4;
		new A();
		
	}	
}