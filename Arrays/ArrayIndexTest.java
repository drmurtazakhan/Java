import java.io.*;
class ArrayIndexTest
{
  public static void main(String[] args)
  {
  	int count=0;
  	int[] a={6,7,5,4};
  	
  	System.out.println(count);
  	//a[count++] = 20; // first assign value at a[count] then increase count by 1
  	a[++count] = 20;   // first increase count by 1 then assign value in array at new value of count
  	System.out.println(count);
  	System.out.println();
  	for (int i=0; i<a.length; i++)
  	{
  		System.out.println(a[i]);
  	}
  
  	
  	
  }
}
 