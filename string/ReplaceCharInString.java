import java.util.*;
public class ReplaceCharInString
{
	
	public static void main(String args[])
	{
		String str="abcd defa abcaz";
		char oldChar='c';
		char newChar='z';
        String newStr=str.replace(oldChar,newChar);       	
       
        	
        System.out.println(str);	
		System.out.println(newStr);
	}
	
}