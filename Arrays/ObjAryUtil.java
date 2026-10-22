package mak2000.Arrays;
import java.util.*;

public class ObjAryUtil {

	public static Vector copyObjAryIntoVec(Object[] objAry){

		Vector vec = new Vector(100);
    	for (int i=0; i<objAry.length  ; i++){    		
			vec.add(objAry[i]);
    	}	    
		vec.trimToSize();
		return vec;		
	}

	/**
	 *Append elements to end of of array
	*/ 
	public static Object[] appendObjtoObjAry(Object[] objAry,Object obj){
		
		//System.out.println("The class of " + obj +" is " + obj.getClass().getName());
                            
		Vector vec =copyObjAryIntoVec(objAry);
		vec.add(obj);
		vec.trimToSize();
		
		int n=objAry.length;
		objAry=null;
		objAry=new Object[n+1];
		vec.copyInto(objAry);
		//System.out.println("The class of " + objAry[0] +" is " + objAry[0].getClass().getName());
		
		return objAry;
	}
	
	public static String[] castObjArytoStrAry(Object[] objAry){
		
		String[] strAry=new String[objAry.length];
    	for (int i=0; i<objAry.length  ; i++){    		
			strAry[i]=(String) objAry[i];
    	}
		return strAry;		
	}
	
}