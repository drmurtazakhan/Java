/**
 * @(#)StringUtilTest.java
 *
 *
 * @author 
 * @version 1.00 2007/8/17
 */

import mak2000.string.StringUtil;
import mak2000.string.StringAryUtil;

public class StringUtilTest {

    public StringUtilTest() {
    }
    
    public static void main(String[] args) {
    	
    	/*
    	String str="MurtazaAliKhan";
    	String substr="Ali";    		
    	String strout=StringUtil.InsertSpaceBeforeAfter(str, substr);
    	System.out.println(strout);
    	*/
    	
    	/*
    	System.out.println( StringUtil.mostSigMatch("800","899") );
    	System.out.println( StringUtil.mostSigMatch("880","889") );
    	System.out.println( StringUtil.mostSigMatch("080","889") );
    	System.out.println( StringUtil.mostSigMatch("88","889") );
    	System.out.println( StringUtil.mostSigMatch("889","889") );
    	*/
    	
    	/*
    	char ch='d';
    	String chstr=""+ch;
    	System.out.println(ch);
    	System.out.println(chstr);
    	*/
    	
    	/*
    	System.out.println( StringUtil.countChar("8808", '8') );
    	System.out.println( StringUtil.countChar("88088", '8') );
    	System.out.println( StringUtil.countChar("88088", '9') );
    	System.out.println( StringUtil.countChar("8", '8') );
    	*/
    	
    	/* cycle 
    	 */
    	 //String[] strAryCycle=StringUtil.cycleCW("RIVER");
    	 String[] strAryCycle=StringUtil.cycleCW("ttt");
    	 StringAryUtil.printStringAry(strAryCycle);
    	
    }    
    
}