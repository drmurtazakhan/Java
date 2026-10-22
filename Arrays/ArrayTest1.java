import java.io.*;
class ArrayTest1
{
  public static void main(String[] args)
  {
  	int[] a={6,7,5,4};
  	//int[] a={};
  	int max=-1;
  	if (a.length>0)
  	max=a[0];
  	for (int i=0; i<a.length; i++)
  	{
  		if (a[i]>max) max=a[i];
  	}
  	System.out.println("Max: "+max);
  	for (int i=1; i<0; i++)
  	System.out.println(i);
  	String s="abc";
  	
  	System.out.println(s.equals("abc"));
  	
  }
}
