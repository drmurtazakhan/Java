/**
 * @(#)ObjAryUtilTest.java
 *
 *
 * @author Murtaza Khan 
 */

import java.util.*;
import mak2000.string.StringUtil;
import mak2000.string.StringAryUtil;
import mak2000.Arrays.ObjAryUtil;

public class ObjAryUtilTest {    
    public static void main(String[] args) {    	
    	
    	String[] strAry1={"ICS","COE","SE"};
    	StringAryUtil.printlnStringAry(strAry1);
    	System.out.println("--------------------");
    	
    	Vector vec=ObjAryUtil.copyObjAryIntoVec(strAry1);
    	String[] strAry2=new String[strAry1.length];
    	vec.copyInto(strAry2);
    	StringAryUtil.printlnStringAry(strAry2);
    	System.out.println("--------------------");
    	
    	
    	String[] strAry3=new String[0];
    	Object[] objAry= ObjAryUtil.appendObjtoObjAry(strAry3,"KFUPM");
    	String[] strAry4=ObjAryUtil.castObjArytoStrAry(objAry);
    	    	
    	StringAryUtil.printlnStringAry(strAry4);
    	System.out.println("--------------------");
    	     	
    	    	
    }    
    
}