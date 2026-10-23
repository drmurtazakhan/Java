/**
 * @(#)BettingMoney.java
 *
 *
 * @author 
 * @version 1.00 2007/7/31
 */

import java.io.*;
import java.util.Arrays;
import mak2000.Arrays.ArrayUtil;

public class BettingMoney {
        
    /**
     * Creates a new instance of <code>BettingMoney</code>.
     */
    public static int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
    	
    	int  sumAmounts=ArrayUtil.sum(amounts);
    	int  profit=sumAmounts-amounts[finalResult];
    	int netgain=(profit*100)-amounts[finalResult]*centsPerDollar[finalResult];
	    	return netgain;
    	    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int[] amounts={10,20,30};
        int[] centsPerDollar={20,30,40};
        int finalResult=1;  
         */
        /*
        int[] amounts={200,300,100};
    	int[] centsPerDollar={10,10,10};
    	int finalResult=2;  
    	*/
    	/*
    	int[] amounts={100,100,100,100};
		int[] centsPerDollar={5,5,5,5};
		int finalResult=0;
		 */ 	
    	int[] amounts={100};
		int[] centsPerDollar={10};
		int finalResult=0;
 	
        int ans=moneyMade(amounts,centsPerDollar,finalResult);
        System.out.println(ans);
    }
}
