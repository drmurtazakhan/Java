import java.lang.reflect.Method;	
public class TestClassClass{
	public static void main(String[] args) throws Exception {
		Class test = Class.forName("TestClassClass");
		System.out.println("\nClass name is: "+test.getName());
		System.out.println("Superclass is: "+test.getSuperclass());
		System.out.println("\nMethods are: ");
		Method[] methods = test.getMethods();
		for(int i = 0; i<methods.length; i++)
			System.out.println(methods[i]);
	}
}
