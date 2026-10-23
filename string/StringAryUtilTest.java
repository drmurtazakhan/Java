/**
 * @(#)StringAryUtilTest.java
 *
 *
 * @author 
 * @version 1.00 2007/8/17
 */

import mak2000.string.StringUtil;
import mak2000.string.StringAryUtil;
import java.util.*;

public class StringAryUtilTest {    
    public static void main(String[] args) {    	
    	
    	/* AppendString */
    	/* 
    	String[] strAry1={"ICS","COE","SE"};
    	String str1="-KFUPM";
    	
    	strAry1=StringAryUtil.AppendString(strAry1,str1);
    	StringAryUtil.printlnStringAry(strAry1);
    	System.out.println("--------------------");    	
        */
        //-------------------------------------------
        /* AppendElemtoStrAry*/
        /*
        //String[] strAry2={"ICS"};
        String[] strAry2=new String[0];
    	
    	strAry2=StringAryUtil.AppendElemtoStrAry(strAry2,"COE");
    	StringAryUtil.printlnStringAry(strAry2);
    	System.out.println("--------------------");    	
    	
    	strAry2=StringAryUtil.AppendElemtoStrAry(strAry2,"SE");
    	StringAryUtil.printlnStringAry(strAry2);
    	System.out.println("--------------------"); 
    	
    	String strlines=StringAryUtil.strArytoStrlines(strAry2);
    	System.out.println(strlines);
    	System.out.println("--------------------"); 
    	*/   	
    	//-------------------------------------------
    	/* findIndexOfSearchString2 
    	String[] strAry1={"ICS","COE SE","SE"};
    	System.out.println(StringAryUtil.findIndexOfSearchString2("SE",strAry1));
    	System.out.println(StringAryUtil.findlndoflnStr("SE",strAry1));
    	System.out.println("--------------------"); 
    	System.out.println(StringAryUtil.findIndexOfSearchString2("COE SE",strAry1));
    	System.out.println(StringAryUtil.findlndoflnStr("COE SE",strAry1));
    	System.out.println("--------------------"); 
    	System.out.println(StringAryUtil.findIndexOfSearchString2("ICS",strAry1));
    	System.out.println(StringAryUtil.findlndoflnStr("ICS COE",strAry1));
    	*/
    	//-------------------------------------------
    	//deleteStrAry2fromUniqueSortedStrAry1
    	/*
    	String[] strAry1={"ICS","COE","SE","ME","EE","CE"};
    	
    	Arrays.sort(strAry1);
    	StringAryUtil.printStringAry(strAry1);
    	String[] strAry2={"PE","COE","EE","COE"};
    	//String[] strAry2=strAry1;
    	
    	String[] strAry3=StringAryUtil.deleteStrAry2fromUniqueSortedStrAry1(strAry1, strAry2);
    	int count=strAry1.length-strAry3.length;
    	System.out.println(count+" elements are removed from strAry1");
    	System.out.println("Remaining elements in strAry1 are following:");
    	StringAryUtil.printStringAry(strAry3);
    	*/		
    	//-------------------------------------------
    	/*
    	// markStrAry2InUniqueSortedStrAry1
    	String[] strAry1={"ICS","COE","SE","ME","EE","CE"};
    	
    	Arrays.sort(strAry1);
    	StringAryUtil.printStringAry(strAry1);
    	String[] strAry2={"PE","COE","EE","COE"};
    	//String[] strAry2=strAry1;
    	
    	String[] strAry3=StringAryUtil.markStrAry2InUniqueSortedStrAry1(strAry1, strAry2,"***");
    	int count=strAry1.length-strAry3.length;
    	StringAryUtil.printlnStringAry(strAry3);
    	*/
    	//-------------------------------------------
    	    	
    	/** conver string array into array of integers (int)  */
    	String[] strAry={"001","456","978","125","698","009"};
    	StringAryUtil.printStringAry(strAry);
    	
    	int[] intAry = StringAryUtil.convertStrAry2intAry(strAry);    	
    	for (int i = 0; i < intAry.length; i++)
    		System.out.print(intAry[i] + " ");
    		System.out.println();
    		
    	strAry=StringAryUtil.convertintAry2StrAry(intAry);
    	StringAryUtil.printStringAry(strAry);
    			
    	//-------------------------------------------
    	
    }    
    
}