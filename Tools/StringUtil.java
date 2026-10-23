import java.util.*;
import java.io.*;
public class StringUtil
{

	public static void main(String[ ] args) 
	{
		//System.out.println(replaceString(line,oldStr,newStr));
		String str="4+3-6*7+4/5%3&5|4&&3||8";
		System.out.println(str);
		System.out.println(InsertSpaceBeforeAfter(str,"\\+"));	
		System.out.println(InsertSpaceBeforeAfterOps(str));
    } 
    
    //insert space before & after each occurance of sub-string in String str
	public static String InsertSpaceBeforeAfter(String str, String substr)
	{		
		return str.replaceAll(substr, " "+substr+" "); 
	}
	
	/**insert space space before & after relational operators in the given string*/
	public static String InsertSpaceBeforeAfterROps(String str)
	{	
		String strout="";	
		strout=str.replaceAll("\\+", " "+"\\+"+" "); 
		strout=strout.replaceAll("\\-", " "+"\\-"+" ");
		strout=strout.replaceAll("\\*", " "+"\\*"+" ");
		strout=strout.replaceAll("\\/", " "+"\\/"+" ");
		strout=strout.replaceAll("\\%", " "+"\\%"+" ");
		return strout;
	}
}