/**
 * @(#)MathUtilTest.java
 *
 *
 * @author 
 * @version 1.00 2007/8/17
 */

import mak2000.discretemath.MathUtil;
import mak2000.Arrays.ArrayUtil;

public class MathUtilTest {
	public static void main(String[] args) {
		
		/*
		System.out.println( MathUtil.fact(4) );
		System.out.println( MathUtil.fact(0) );
		System.out.println( MathUtil.fact(1) );
		System.out.println( MathUtil.fact(2) );
		System.out.println( MathUtil.fact(-2) );
		*/
		
		/*
		System.out.println( MathUtil.permut(4,3) );
		System.out.println( MathUtil.permut(4,2) );
		System.out.println( MathUtil.permut(4,4) );
		System.out.println( MathUtil.permut(3,3) );
		*/
		
		/*
		int[][] a=MathUtil.cycleCW0toN_1(5);
		ArrayUtil.print2d(a);
		System.out.println("----------------");
    	int[][] b=MathUtil.cycleCCW0toN_1(5);
		ArrayUtil.print2d(b);
		*/
		
		System.out.println( MathUtil.isPowerOfn(0, 5) );	
		System.out.println( MathUtil.isPowerOfn(25, 5) );	
		System.out.println( MathUtil.isPowerOfn(30, 5) );	
		System.out.println( MathUtil.isPowerOfn(8, 2) );	
		System.out.println( MathUtil.isPowerOfn(10, 2) );		
    				
	}
    
    
}