import java.io.*;
public class parseTest
{
	public static void main(String[ ] args) throws IOException
	{
		String s1="abc";
		String s2="123";
		String s3="-260013593620984540000000000000000000000.00";
		String s4=".35";
		String s5="3.5";
		String s6="-.2";
		
		//Double dObj1=Double.valueOf(s1); //number format exception
		//Double dObj2=Double.valueOf(s2); 
		//System.out.println(dObj1.isNaN());// not allowed
	    //System.out.println(dObj2.isNaN());	    
	    System.out.println(isNumber(s1));
	    System.out.println(isNumber(s2));
	    System.out.println(isNumber(s3));
	    System.out.println(isNumber(s4));
	    System.out.println(isNumber(s5));
	    System.out.println(isNumber(s6));
	    System.out.println(Double.parseDouble(s3));
	    
	}
	public static boolean isNumber(String number)
	{
		int k=0;
		int decCount=0;
        char[] c = number.toCharArray();
        if (c[0]=='-' || c[0]=='+')
        k=1;         
        
        for (int i = k; i < c.length; i++)
        {
        	if (c[i]=='.')
        	{
        		decCount++;
        		if (decCount>1)
        		return false;
         	}
         	else if (!Character.isDigit(c[i]))
         	{
         		return false;
            }
        } 
         return true;
     } 
}

