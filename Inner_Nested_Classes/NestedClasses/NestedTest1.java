class OuterClass
{	interface MaxMin
	{   void method1();	}
	
    protected class innerClass1 implements MaxMin     
    {  	public void method1(){ };    }
    
    static class innerClass2 implements MaxMin
    {  	public void method1(){ };    }    
}
  
public class NestedTest1
{	public static void main(String [] args)
	{	OuterClass obj1 = new OuterClass();
		OuterClass.innerClass1 obj2 =  obj1.new innerClass1();                
	    OuterClass.MaxMin obj3 = obj1.new innerClass1();
	    OuterClass.MaxMin obj4 = OuterClass.innerClass1();                
	    OuterClass.innerClass2 obj5 =  obj1.new innerClass2();                
		OuterClass.innerClass2 obj6 = new OuterClass.innerClass2();        
		OuterClass.MaxMin obj7 = new OuterClass.innerClass2();
		
    }
}