import java.io.*;
class FillTwoDArray {
     public static void main (String[] args) {
     
     	     int[][] a = new int[4][5];
     for (int row=0; row < a.length; row++)
       for (int col=0; col < a[0].length; col++)
               a[row][col] = row+col;
               
     for (int row=0; row < a.length; row++)
     	{
       		for (int col=0; col < a[0].length; col++)
       	    	System.out.print( a[row][col]+"\t" );
         	   
       	 	System.out.println( );
              
         }
      
      }
      
  } 
