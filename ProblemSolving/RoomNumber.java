/**
 *You are going to stick the number of your room on the door. The shop near your house suggests
 * wonderful sets of plastic digits. Each set contains exactly ten digits - one of each digit
 * between 0 and 9, inclusive. Return the number of sets required to write your room number. 
 * Note that 6 can be used as 9 and vice versa. 
/**
 * @(#)RoomNumber.java
 *
 *
 * @author 
 * @version 1.00 2007/7/31
 */

import java.io.*;
import java.util.Arrays;
import mak2000.Arrays.ArrayUtil;

public class RoomNumber {
	
    public static int numberOfSets(int roomNumber) {
    	int setCount=0;
    	int digit;
    	// initially each digit has 0 count
    
    	int[] a= {0,0,0,0,0,0,0,0,0,0};
    	
    	String rN=""+roomNumber;    	
        for (int i = 0; i < rN.length(); i++)
        {
        	
        	digit=Integer.parseInt(rN.substring(i,i+1));
        	if (a[digit]==0)
        	{
        		
        		setCount=setCount+1;
        		ArrayUtil.incrEachElem(a, 1);        		
        	}
        	a[digit]=a[digit]-1;
        	
        }
    	    	
    	return setCount;
    	    
    }
    
    public static void main(String[] args) {
    	
    	//int roomNumber=966966; // ans=3
    	//int roomNumber=122;      // ans=2
    	//int roomNumber=9999;       // ans=2
    	//int roomNumber=12365;   //ans=1
    	//int roomNumber=966966; //ans=3
    	//int roomNumber=888888;   //ans=6
       // int roomNumber=44611;   // ans=2
        int roomNumber=44456111; // ans=3
        
        System.out.println(roomNumber);
        
        String roonNumberStr=Integer.toString(roomNumber);
		String newStr=roonNumberStr.replace('6','9'); //replace 6 with 9
		
		int countNine =0;
		countNine =  newStr.length() - newStr.replace("9", "").length();
		
		// keep only necessary 9
		int k=countNine/2;
			
		for (int i = 1; i <= k; i++)
		{
			 	newStr=newStr.replaceFirst("9","");
		}
			 	
	    roomNumber=Integer.parseInt(newStr);
				
        System.out.println(numberOfSets(roomNumber));

    }
}
