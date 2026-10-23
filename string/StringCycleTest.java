/**
 * @(#)StringCycleTest.java
 *
 *
 * @author Murtaza Khan
 * @version 1.00 2007/8/17
 */

import mak2000.string.StringUtil;
public class StringCycleTest {

    public static void main(String[] args) {
    	
    	String [] strAry1= StringUtil.cycleCW("home"); StringUtil.print(strAry1);
    	String [] strAry2= StringUtil.cycleCW("computer"); StringUtil.print(strAry2);
    	String [] strAry3= StringUtil.cycleCW("xy"); StringUtil.print(strAry3);
    	String [] strAry4= StringUtil.cycleCW("c"); StringUtil.print(strAry4);
    	
    	
    }    
    
}