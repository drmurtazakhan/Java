// Exercise #3
public class HelloWorld
{	private String s1;  // instance variables
    private String s2;  // instance variables
	public HelloWorld(String firstG, String secondG)
	{
		s1=firstG; // initialization of instance variable s1
		s2=secondG; // initialization of instance variable s2
	}
	public void printG1() // method1
	{
		System.out.println(s1);
	}
	public void printG2() // method2
	{
		System.out.println(s2);
	}
}