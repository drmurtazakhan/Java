public class StringBufferTester
{
    public static void main(String[ ] args)
    {
    	String s1="ABCD, EFGH"; 
    	    	
    	StringBuffer sb1 = new StringBuffer(s1);
    	//sb1.delete(6,7);
    	sb1.replace(6,10,"123");
    	System.out.println(sb1.toString());
    	    	
    }
}


