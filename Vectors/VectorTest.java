import java.io.*;
import java.util.*;
import mak2000.Arrays.ArrayUtil;

public class VectorTest {
   public static void main(String[] args) throws IOException {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));  
      //---------------------------------------------	
      int[] a = ArrayUtil.randomIntArray(10, 100);
      ArrayUtil.print(a);
      Arrays.sort(a);
      ArrayUtil.print(a);   
      Vector vect1=new Vector();
            	
      for (int i=0; i<a.length  ; i++){     		
      		vect1.add(a[i]);
      }    
      vect1.trimToSize();
      //---------------------------------------------
      int[] b = ArrayUtil.randomIntArray(10, 100);
      Vector vect2=new Vector();
      Integer[] bIntAry =new Integer[a.length];
       
      for (int i=0; i<b.length  ; i++){
      	bIntAry[i]=new Integer(b[i]);
	  	vect2.add(bIntAry[i]);      	
      }	
      System.out.println("--------------------------");	
      ArrayUtil.print(bIntAry);      		
      Arrays.sort(bIntAry);
      ArrayUtil.print(bIntAry);      	
      vect2.trimToSize();      
     //---------------------------------------------	

      	   
      	
   }
} 
