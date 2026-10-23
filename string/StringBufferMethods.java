public class StringBufferMethods
{
    public static void main(String[ ] args)
    {
    	String s1="Hello, World!"; // length is 13
    	    	
    	StringBuffer sb1 = new StringBuffer();
    	System.out.println("Capacity of sb1 is "+sb1.capacity()); // capacity of string buffer
    	System.out.println("length of sb1 is "+sb1.length());   // number of characters in string
    	sb1.append(s1);                     // apending string to buffer
    	System.out.println("Capacity of sb1 after apending s1 is "+sb1.capacity());
    	System.out.println("length of sb1 is "+sb1.length());
    	
    	System.out.println();
    	StringBuffer sb2 = new StringBuffer(2);
    	System.out.println("Capacity of sb2 is "+sb2.capacity());
    	sb2.append(s1);
    	System.out.println("Capacity of sb2 after apending s1 is "+sb2.capacity());
    	
    	System.out.println();
    	StringBuffer sb3 = new StringBuffer(s1);
    	System.out.println("Capacity of sb3 is "+sb3.capacity());
    	
    	System.out.println();
    	sb1.replace(0,5,"Java");
    	System.out.println(sb1.toString());
    	    	
    }
}


