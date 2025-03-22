class OuterClass
{
	private static int x_outer=5;
	private  int y_outer=5;
	
	public String m2_OuterClass()
	{
		InnerClass ic = new InnerClass(); // outer class can create the obj of inner class
		return ic.m1_InnerClass();	    
	}
	
	public static String m1_OuterClass()
	{
		return "Outer class method "; 
	}
	
	private class InnerClass
	{
		// inner class can not have static declaration
		public String m1_InnerClass()
		{
			String s1="Inner class method "; 
			String s2=s1+" can access "+"x_outer="+x_outer+" y_outer="+y_outer+" from outer class";
			return s2;			
		}
		
	}
}

public class InnerClassTest 
{
	public static void main(String[ ] args)
	{
		System.out.println( OuterClass.m1_OuterClass() );
		OuterClass oc = new OuterClass();
		System.out.println( oc.m2_OuterClass() );		
		// InnerClass ic2 = new InnerClass(); not allowed			 	
	}
}
