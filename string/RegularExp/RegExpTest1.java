/**
 * @(#)RegExpTest1.java
 *
 *
 * @author Murtaza Khan
 * @version 1.00 2007/9/29
 */

import java.io.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import mak2000.string.StringUtil;
import mak2000.string.StringAryUtil;


public class RegExpTest1 {
	
    
    public static void main(String[] args) {
   	
    	String str1="boo:and:foo";
    	System.out.println(str1);
    	System.out.println("----------------------");
    	CharSequence chSeq=str1.subSequence(0,str1.length()-1 );
    	
    	// around :
    	Pattern ptrn1=Pattern.compile(":");
    	String[] strAry1= ptrn1.split(chSeq);
    	StringAryUtil.printlnStringAry(strAry1);
    	System.out.println("----------------------");

		// around o
    	Pattern ptrn2=Pattern.compile("o");
    	String[] strAry2= ptrn2.split(chSeq);
    	StringAryUtil.printlnStringAry(strAry2);
    	System.out.println(">>>>>>>>>>>>>>>>>>>");
   	    
   	    //----------------------------------------------
   	
   	    String str2="boo and foo";
    	System.out.println(str2);
    	System.out.println("----------------------");
    	CharSequence chSeq2=str2.subSequence(0,str2.length()-1 );

   	
		// around " "
    	Pattern ptrn3=Pattern.compile(" ");
    	String[] strAry3= ptrn3.split(chSeq2);
    	StringAryUtil.printlnStringAry(strAry3);
		
		    	
    }
}
    
