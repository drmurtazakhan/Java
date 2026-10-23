/**
 * @(#)BalanceScale.java
 *
 *
 * @author 
 * @version 1.00 2007/7/31
 */

import java.io.*;
import java.util.Arrays;
import mak2000.Arrays.ArrayUtil;

public class BalanceScale {
        
    /**
     * Creates a new instance of <code>BalanceScale</code>.
     */
    public static int takeWeights(int[] weight) {
    	  	
    	ArrayUtil.sort(weight);    	
    	int  sum=ArrayUtil.sum(weight);
    	    	
        for (int i = 0; i < weight.length; i++)
        {
        	int[] y=ArrayUtil.aryfromary(weight, (i+1));
        	
        	
        }
    	
    	int ans=0;
    	return ans;
    	    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	int[] weight= { 5, 4, 1, 8 };
		//int[] weight= { 2, 3, 8, 9 };
		//int[] weight= { 60, 105, 490, 42 };
        //int[] weight= { 15, 25, 9 };
        
        int ans=takeWeights(weight);
        
        //ArrayUtil.print(weight);
        
        System.out.println(ans);
    }
}
