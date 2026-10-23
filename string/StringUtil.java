package mak2000.string;
import java.util.*;
import java.io.*;
import mak2000.discretemath.MathUtil;
import mak2000.Arrays.ArrayUtil;

public class StringUtil
{

	public static void main(String[ ] args) 
	{
		//System.out.println(replaceString(line,oldStr,newStr));
		String str="4+3-6*7+4/5%3&5|4&&3||8";
		System.out.println(str);
		System.out.println(InsertSpaceBeforeAfter(str,"\\+"));	
		System.out.println(InsertSpaceBeforeAfterROps(str));
    } 
    
    public static void print(String[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
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
	
    /*
     *find maxium most significant match of two strings,
     *returns  index upto that two string matches
     *returns -1 if first characters do not match
    */
	public static int mostSigMatch(String str1, String str2)
	{		
		int pos=-1;
		String str3="";
		
		int d1=str1.length();
		int d2=str2.length();
		
		for (int i=0; i<Math.min(d1,d2); i++)
		{
			if( str1.substring(i,i+1).equals(str2.substring(i,i+1)) )
				pos++;
				else
					break;
		}
		return pos;		 
	}

    /*
     *count occurance of a single character in the given string     
    */
	public static int countChar(String str, char ch)
	{		
		int count=0;
		String chStr=""+ch;
		
		
		for (int i=0; i<str.length(); i++)
		{
			if (str.substring(i,i+1).equals(chStr.substring(0,1)))
				count++;
		}
		return count;		 
	}
	
	/**
	 * cycle string clock-wise, 
	 * ith row of o/p string has (i+1)th cycle
	 */
	 
 	public static String[] cycleCW(String str)
	{	
		int len=str.length();
		String[] strAry=new String[len];
			
		int[][] a=MathUtil.cycleCW0toN_1(len);
		
		int pos=0;
		String stri="";
		
		for (int i=0; i<a.length; i++)
		{
			stri="";
			for (int j=0; j<a[i].length; j++)
			{
				pos=a[i][j];
				stri=stri+str.substring(pos,pos+1);
				
			}
			strAry[i]=stri;
			//System.out.println();
		}
		
		return strAry;
	}

    /** find the first occurance index i of given char in given string then
     * remove the part of string from i to end and return the remaining string
     **/
    public static String removeAndTrimFromGivenChar(String str, char removeFrom)
    {
    	int i=str.indexOf(removeFrom);
    	if(i<0)
    	{
    		return str; // not found return orginal string
    	}
    	
    	return str.substring(0,i).trim();    	
    }
	
}