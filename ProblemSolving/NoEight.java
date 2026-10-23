/**
 * @(#)NoEight.java
 *
 *
 * @author 
 * @version 1.00 2007/7/31
 */

import java.io.*;
import java.util.Arrays;
import mak2000.Arrays.ArrayUtil;
import mak2000.string.StringUtil;

public class NoEight {
	
    public static int smallestAmount(int low, int high) {    	
    	    	
    	String lowS=""+low;    	
    	String highS=""+high;    	
    	
    	if (lowS.equals(highS)) // low and high are same
    		 return StringUtil.countChar(lowS, '8');
    		
    	int	x=StringUtil.mostSigMatch(lowS,highS);
    	
    	if (x==-1) // no match
    		return 0;
    	else
    		return lowS.substring(0,x+1).length();    		
    	    
    }
    
    public static void main(String[] args) {
    	
        System.out.println(smallestAmount(1,9));
        System.out.println(smallestAmount(800,899));
        System.out.println(smallestAmount(8808,8808));
        System.out.println(smallestAmount(778,800));
        System.out.println(smallestAmount(88,88));
        System.out.println(smallestAmount(8808,8880));
        System.out.println(smallestAmount(80,81));
    }
}
