/**
 *We can think of a cyclic word as a word written in a circle. 
 *To represent a cyclic word, we choose an arbitrary starting position and
 * read the characters in clockwise order. So, "picture" and "turepic" are 
 *representations for the same cyclic word.

 * You are given a String[] words, each element of which is a representation
 * of a cyclic word. Return the number of different cyclic words that are
 * represented.
 *
*/


/**
 * @(#)CyclicWords.java
 *
 *
 * @author Murtaza Khan
 * @version 1.00 2007/7/31
 */

import java.io.*;
import java.util.Arrays;
import mak2000.Arrays.ArrayUtil;
import mak2000.string.StringUtil;
import mak2000.string.StringAryUtil;



public class CyclicWords {	

    
    public static void main(String[] args) {
    	
    	String[] strAry={"picture", "turepic", "icturep", "word", "ordw" }; //ans=2
    	//String[] strAry={ "ast", "ats", "tas", "tsa", "sat", "sta", "ttt" }; //ans=3
    	//String[] strAry={"aaaa", "aaa", "aa", "aaaa", "aaaaa"}; // ans=4
    	//String[] strAry={""};

		StringUtil.print(strAry);
    	Arrays.sort(strAry);
    	StringUtil.print(strAry);
    	strAry=StringAryUtil.removeDuplicateFromSorted(strAry);
    	StringUtil.print(strAry);	
    	System.out.println("--------------------------");	
    	
    	String [] cycleAry={};	
		int count=0;		
		while (strAry.length>0){
			count++;
			System.out.println(count);    			    	
    		cycleAry= StringUtil.cycleCW(strAry[0]);
    		StringUtil.print(cycleAry);
    		strAry=StringAryUtil.deleteStrAry2fromUniqueSortedStrAry1(strAry,cycleAry);
    		StringUtil.print(strAry);
		}
    	System.out.println("--------------------------"); 
    	
        System.out.println("Number of different cyclic words="+ count );
   
        
    }
}
