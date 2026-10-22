package mak2000.Arrays;

import java.util.Random;
import java.util.Arrays;
public class ArrayUtil {
   public static int[] randomIntArray(int length, int n) {
      int[] a = new int[length];
      Random generator = new Random();
      
      for (int i = 0; i < a.length; i++)
         a[i] = generator.nextInt(n);
      
      return a;
   }
public static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
public static void swap(String[] a, int i, int j) {
      String temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      }   
      
public static void print(int[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
   }

public static void print2d(int[][] a) {
      for (int i = 0; i < a.length; i++)
      {
      	for (int j=0; j<a[i].length; j++)
      	{
      		System.out.print(a[i][j] + " ");      		

      	}
      	System.out.println();
      }
   }
      
public static void print(String[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
}   

public static void print(Integer[] a) {
      for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
      System.out.println();
}
   
   public static void print(int[][] a) {
      for (int i = 0; i < a.length; i++)
      {
      	for (int j = 0; j < a[i].length; j++)
      	System.out.print(a[i][j] + " ");
      	System.out.println();
      }
   }   
   	
   	
   public static int sum(int[] a) {
   	  int sum=0;
      for (int i = 0; i < a.length; i++)
      {
      	sum=sum+a[i];
      }      
      return sum;
   }
   
   public static void sort(int[] a) {
   	java.util.Arrays.sort(a);
   }
   
	public static int findMax(int[] a)
	{
		int max=a[0];
		for ( int i=1; i<a.length; i++)
			max=Math.max(max,a[i]);
		return max;
	}     

    public static int findMinIndex(double[] a) {
        int minIndex = 0;
        double min = a[minIndex];
        for (int i = (minIndex + 1); i < a.length; i++) {
            if (a[i] < min) {
                minIndex = i;
                min = a[minIndex];
            }
        }
        return minIndex;
    }

    // increment each element by d
	public static void incrEachElem(int[] a, int d)
	{
		
		for ( int i=0; i<a.length; i++)
			a[i]=a[i]+d;
		
	}     

    // create array b from array a by adding n elements from array a in array b
	public static int[] aryfromary(int[] a, int n)
	{
		int[] b = new int[n];
		for ( int i=0; i<n; i++)
		{
			b[i]=a[i];
		}
		return b;	
	}     
	
    // check if every element of array is divisible by n
	public static boolean isDivbyN(int[] a, int n)
	{
		boolean flag=true;
		for ( int i=0; i<n && flag; i++)
		{
			if (a[i]%n != 0)
				flag=false;
		}
		return flag;	
	}     

    // appy OR operations among all elements of boolean array
	public static boolean ORary(boolean[] a)
	{
		boolean flag=false;
		for ( int i=0; i<a.length ; i++)
		{
			flag=flag || a[i];	
		}
		return flag;	
	}     
	
	public static int[] IntegerAry2intAry(Integer[] a){
		int[] b =new int[a.length];
		for ( int i=0; i<a.length ; i++){
			b[i]=a[i].intValue(); 
		}
		return b;
	}
}