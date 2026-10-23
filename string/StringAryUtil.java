package mak2000.string;

import java.io.*;
import java.util.*;
import mak2000.string.AssoString;
import mak2000.Arrays.ArrayUtil;
import mak2000.FileIO.FileUtil;

public class StringAryUtil {
	
 	/** First sort then remove duplicate records
 	 */          
    public static String[] SortandRemoveDuplicate(String[] strAry)
    {
    	// sort then remove duplicate then returns sorted
    	// array without duplicate elements
    	Arrays.sort(strAry);
    	Vector vect=new Vector(1000,100);
    	
    	for (int i=0; i<strAry.length-1  ; i++)
    	{
    		if(!strAry[i].equals(strAry[i+1]))
			vect.add(strAry[i]);
    	}
    	vect.add(strAry[strAry.length-1]); // last element	
    	
    	vect.trimToSize();
    	
		strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;
    	
    }

	/** Process strAry line by line. strAry not need to be sorted 
	 * Remove any line from strAry that contains String str
	 *  Does not break lines into tokens, str maybe part of any string in the line
	 */
	public static String[] removeLinesofStrFromStrAry(String str, String[] strAry)
    {
    	Vector vect=new Vector(1000,100);
   	    for (int i=0; i<strAry.length; i++)
    	{
    		if(strAry[i].indexOf(str)==-1) //not found
    		{
    			vect.add(strAry[i]);
    		}    		
    	}
        vect.trimToSize();
		strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;	
    }

	
	/** Remove duplicate records, records must already be sorted
	 */
	public static String[] removeDuplicateFromSorted(String[] strAry)
    {
     	Vector vect=new Vector(1000,100);
    	
    	for (int i=0; i<strAry.length-1  ; i++)
    	{
    		if(!strAry[i].equals(strAry[i+1]))
			vect.add(strAry[i]);
    	}
    	vect.add(strAry[strAry.length-1]); // last element	
    	
    	vect.trimToSize();
		strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;    	
    }


	/** Mark duplicate records, records must already be sorted
	 */
	public static String[] markDuplicateFromSorted(String[] strAry, String mark)
    {
     	for (int i=0; i<strAry.length-1  ; i++)
    	{
    		if(strAry[i].equals(strAry[i+1]))
    			strAry[i]=mark+" "+strAry[i];			
    	}
		return strAry;    	
    }
        
	/**
	 *appends given string to the end of each element of given string array
	 *returns new string array
	 */
	public static String[] AppendString(String[] strAry,String appStr)
	{
		for (int i=0; i<strAry.length; i++)
		{
			strAry[i]=strAry[i]+appStr;
		}
		return strAry;
	}
	
	/**
	 *Append elements to end of of string array
	 */
	public static String[] AppendElemtoStrAry(String[] strAry,String strElem){
		
		Vector vect = new Vector(100);
    	for (int i=0; i<strAry.length  ; i++){    		
			vect.add(strAry[i]);
    	}    	
    	//vect.trimToSize();		

		vect.add(strElem);
		vect.trimToSize();
		
		int n=strAry.length;
		strAry=null;
		strAry=new String[n+1];
		vect.copyInto(strAry);
		return strAry;
	}	
    
    public static int findIndexOfSearchString1(String str,String[] strAry)
    {
    	// first breaks line into tokens then search str in tokens
    	// tokens are separted by white spaces
    	// finds array index of given string in the given array    
    	// given string is a token in any line
    	// return index is first occurance in the array
    	// returns -1 if not found
    	for (int i=0; i<strAry.length; i++)
    	{
    		String line=strAry[i];
    		StringTokenizer tokenFinder = new StringTokenizer(line);
    		while( tokenFinder.hasMoreTokens( ) )
    		{
    			if(tokenFinder.nextToken().equals(str) )
    			return i;
    		}
    	}
    	return -1;
    }
    
    public static int findIndexOfSearchString2(String str,String[] strAry)
    {
    	// does not break lines into tokesn. 
    	// given str may be a part of string in a line
    	// finds array index of given string in the given array    
    	// given string is a token in any line
    	// return index is first occurance in the array
    	// returns -1 if not found
    	for (int i=0; i<strAry.length; i++)
    	{
    		if(strAry[i].indexOf(str)!=-1)
    		return i;
    	}
    	return -1;
    }
    
    /** Each index of strAry has a line.
     *  Search index of strLine in strAry.
     *  Returns -1 if not found
     */
    public static int findlndoflnStr(String strLine,String[] strAry){
    	
    	for (int i=0; i<strAry.length; i++){
    		if(strAry[i].equals(strLine))
    		return i;
    	}
    	return -1;
    }
    

    /** Delete string elements from first string array (strAry1)
     *  that listed in second string array (strAry2).
     *  All elements of strAry1 must be unique and sorted.
     *  strAry2 is not required to be sorted and may have duplicate elements.
     */
    public static String[] deleteStrAry2fromUniqueSortedStrAry1(String[] strAry1,String[] strAry2){
    	    	
    	/** copy indices of strAry1 elements that matach with
    	 *  strAry2 elements in vector
    	 */ 
    	Vector vect=new Vector(1000,100);
    	for (int i=0; i<strAry2.length; i++){
    		int j = Arrays.binarySearch(strAry1, strAry2[i]);    		
    		if (j>=0){    			
    			vect.add(new Integer(j));
    		}
    	}
    	
    	/** copy indices from vector to Integer array (indexAryInteger),
    	 *  cast it to primitive type int array (indexAry) and sort indexAry
    	 */
    	vect.trimToSize();
    	Integer[] indexAryInteger=new Integer[vect.size()];
    	vect.copyInto(indexAryInteger); 
    	int[] indexAry=ArrayUtil.IntegerAry2intAry(indexAryInteger);	   	
    	Arrays.sort(indexAry);
    	
    	/** coying elements of strAry1 elements other than
    	 *  in Integer array (indexAry) in a new vector
    	 */    	
    	vect=new Vector(1000,100);
    	for (int i=0; i<strAry1.length; i++){
    		int j = Arrays.binarySearch(indexAry, i);    		
    		if (j<0){
    			vect.add(strAry1[i]);
    		} 
    	}
    	vect.trimToSize();
    	String[] strAry3=new String[vect.size()];
    	vect.copyInto(strAry3);
    	return strAry3;
    }
    
     /** Mark string elements in first string array (strAry1)
     *  that listed in second string array (strAry2).
     *  All elements of strAry1 must be unique and sorted.
     *  strAry2 is not required to be sorted and may have duplicate elements.
     */
    public static String[] markStrAry2InUniqueSortedStrAry1(String[] strAry1,String[] strAry2, String mark){
    	
    	Arrays.sort(strAry2);
    	strAry2=removeDuplicateFromSorted(strAry2);
    		
    	for (int i=0; i<strAry2.length; i++){
    		int j = Arrays.binarySearch(strAry1, strAry2[i]);    		
    		if (j>=0){    			
    			strAry1[j]=mark+" "+strAry1[j];
    		}
    	}
    	return strAry1; 	
     }
    
    /** Extract each occurance of string with given substring (subStr) from strAry.
     *  Each index of strAry may have more than one occurance of subStr     
     */
    public static String[] extractStrofSubStr(String subStr, String[] strAry){
    	String outStr="";
    	Vector vect=new Vector(1000,100);
    	
    	for (int i=0; i<strAry.length; i++){
    		StringTokenizer tokenFinder = new StringTokenizer(strAry[i]);
    		while( tokenFinder.hasMoreTokens( ) ){
    			outStr=tokenFinder.nextToken();
    			int k=outStr.indexOf(subStr);
    			if (k!=-1){
    				vect.add(outStr);
    			}    				
    		}
    			
    	}    	
    	vect.trimToSize();
		String[] strAry2=new String[vect.size()];
		vect.copyInto(strAry2);
		return strAry2;
    }
    
     /** Extract each occurance of string from strAry that is confined (delimited).
     * within given sub-strings. Each index of strAry may have more
     * than one occurance of delimited strings. 
     * Each index of strAry is processed separately.     
     */
    public static String[] extractDelimitedStr(String bDLStr, String eDLStr,String[] strAry){
    	String inputLine="";
    	String outStr="";
    	String ch1Str=""; String ch2Str="";
		boolean start,stop;
		
	    Vector vect=new Vector(1000,100);
		
		for (int i=0; i<strAry.length; i++) //for each line
		{
			start=stop=false;
			outStr="";
			inputLine=strAry[i];		
			for (int j=0; j<inputLine.length()-1; j++) //for each char in line
			{
				char ch1= inputLine.charAt(j);
				char ch2= inputLine.charAt(j+1);
				
				ch1Str=ch1+""; 
				ch2Str=ch2+"";
				
				if ( ch1Str.equals(bDLStr) )
					start=true;					
				
				if (start)
					outStr=outStr+ch1;
					
				if (start && ch2Str.equals(eDLStr) )
					stop=true;
				//System.out.println(outStr);					
				if (stop)
				{
					outStr=outStr+ch2;
					outStr=outStr.trim();
					vect.add(outStr);
					outStr="";
					start=stop=false;												
				}				
			} // inner for			
		} // outer for
    	    	
    	vect.trimToSize();
		String[] strAry2=new String[vect.size()];
		vect.copyInto(strAry2);
		return strAry2;
    }
    
    /** replace string in strAry
     */
    public static String[] replaceStrInStrAry(String oldStr, String newStr, String[] strAry)
    {
    	for (int i=0; i<strAry.length; i++){    		
    		strAry[i]=strAry[i].replaceAll(oldStr,newStr);     		
    	}
    	return strAry;
    }    
    
    public static void overwriteLineinAry(String newLine, int index, String[] strAry)
    {
    	// overwrite old line with new line in the given array at given index
    	strAry[index]=newLine;
    }
    
   
    
    public static String[] trimStringAry(String[] strAry)
    {
    	String[] strTrim = new String[strAry.length];
    	for (int i=0; i<strAry.length; i++)
    	{
    		strTrim[i]=strAry[i].trim();
    	}
    	return strTrim;
    }
    
    public static String[] findOneLineAfterGivenString(String str,String[] strAry)
    {
    	Vector vect=new Vector(1000,100);
    	for (int i=0; i<strAry.length; i++)
    	{
    		if( strAry[i].indexOf(str)!=-1 )
    		{
    			if( ( (i+1)<strAry.length) ) // if next line is not empty
    			{
    				vect.add(strAry[i+1]); 
    				i++;
    			}    			
    		}
    	}
    	vect.trimToSize();
		String[] tempAry=new String[vect.size()];
		vect.copyInto(tempAry);
		return tempAry;
    }
    public static AssoString[] find1LAfterGivenStrMakeAsso(String str,String[] strAry)
    {
    	// finds one Line After given string for complete strin array
    	// makes association b/w line and array index (array indices starts from 0)
    	Vector vect=new Vector(1000,100);
    	for (int i=0; i<strAry.length; i++)
    	{
    		if( strAry[i].indexOf(str)!=-1 )
    		{
    			if( ( (i+1)<strAry.length) ) // if next line is not empty
    			{
    				vect.add(new AssoString(strAry[i+1],new Integer(i+1)) ); 
    				i++;
    			}    			
    		}
    	}
    	vect.trimToSize();
		AssoString[] assoAry=new AssoString[vect.size()];
		vect.copyInto(assoAry);
		return assoAry;
    }
    
    public static String[] fillKeyAryFromAssoStringAry(AssoString[] assoAry)
    {
    	String[] strAry=new String[assoAry.length];
    	for (int i=0; i<strAry.length; i++)
    	{
    		strAry[i]=assoAry[i].getKey();
    	}
    	return strAry;
    }   
    
    public static int searchStringFromBetweenIndices(String str1,String str2,int index1,int index2, String[] strAry)
    {
    	//Example
    	//index1=5; index2=15; str1=COMPDAT; str2=ANDR0052.
    	// then from (index1 i.e. 5) to (index2 i.e. 15) of strAry, the program will serach COMPDAT
    	// if COMPDAT then it will serach ANDR0052 then it will return the index ...
    	// of line contains ANDR0052.
    	// returns -1 if str1 is not found 
    	// returns -2 if str2 is not found 
    	boolean flag=false;
    	int index3=0;
    	for (int i=index1; i<=index2 && !flag; i++)
    	{
    		if(strAry[i].indexOf(str1)!=-1)
    		{
    			flag=true;
    			index3=i;
    			
    		}
    	}
    	if(!flag)
    	{
    		System.out.println(str1+" is not found");
    		return -1;
    	}
    	
    	// so str1 is found so we proceed, now we have to search str2
    	flag=false; // flag is false again
    	int index4=0;
    	for (int i=index3; i<=index2 && !flag; i++)
    	{
    			if(strAry[i].indexOf(str2)!=-1)
    			{
    				flag=true;
    				index4=i;    			
    			}
    	}
    	if(!flag)
    	{
    		System.out.println(str2+" is not found");
    		return -2;
    	}
    	// so str2 is also found 
    	return index4;
    	
    }
    
    public static int searchStringFromIndex(String str1,String str2,int index, String[] strAry)
    {
    	//Example
    	//index=5; str1=WCONINJE; str2=ANDR0052.
    	// then from index (i.e. 5) of strAry, the program will serach WCONINJE
    	// if WCONINJE then it will serach ANDR0052 then it will return the index ...
    	// of line contains ANDR0052.
    	// returns -1 if str1 is not found 
    	// returns -2 if str2 is not found 
    	boolean flag=false;
    	int index2=0;
    	for (int i=index; i<strAry.length && !flag; i++)
    	{
    		if(strAry[i].indexOf(str1)!=-1)
    		{
    			flag=true;
    			index2=i;
    			
    		}
    	}
    	if(!flag)
    	{
    		System.out.println(str1+" is not found");
    		return -1;
    	}
    	
    	// so str1 is found so we proceed, now we have to search str2
    	flag=false; // flag is false again
    	int index3=0;
    	for (int i=index2; i<strAry.length && !flag; i++)
    	{
    			if(strAry[i].indexOf(str2)!=-1)
    			{
    				flag=true;
    				index3=i;    			
    			}
    	}
    	if(!flag)
    	{
    		System.out.println(str2+" is not found");
    		return -2;
    	}
    	// so str2 is also found 
    	return index3;
    	
    }
    
    
    public static String[] insertLinesinStrAry(int index,String[] insertAry,String[] strAry)
    {
    	//insert x records (x=insertAry.length) after index in strAry
    	// more correctly speaking it returns new array with inserted lines.
    	
    	if(index<-1 || index>strAry.length-1)
    	{
    		System.out.println("Check Insert index, you entered index: "+index);
    		return strAry; // same array    		
    	}
    	String[] newStr=new String[strAry.length+insertAry.length];
    	
    	for(int i=0; i<=index; i++)  // copy same records until i=index
    	{
    		newStr[i]=strAry[i];
    	}
    	
    	int count=index+1;
    	for (int i=0; i<insertAry.length; i++) // copy inserted records
    	{
    		newStr[count]=insertAry[i];
    		count++;
    	}
    	for(int i=index+1; i<strAry.length; i++) // copy remaining records in strAry to newStr
    	{
    		newStr[count]=strAry[i];
    		count++;
    	}
    	return newStr;
    }
    
    
    public static void printStringAry(String[] strAry)
    {
    	for (int i=0; i<strAry.length; i++)
    	System.out.print(strAry[i]+" ");
    	System.out.println();
    }

    public static void printLengthOfEachLine(String[] strAry)
    {
    	for (int i=0; i<strAry.length; i++)
    	System.out.println(strAry[i].length());
    }
    

    public static void printlnStringAry(String[] strAry)
    {
    	for (int i=0; i<strAry.length; i++)
    	System.out.println(strAry[i]);
    }
    
    /**
     * convert string array to single string, Each element of
     * of string array is appended with newline
     */
    public static String strArytoStrlines(String[] strAry)
    {
    	String strlines="";
    	for (int i=0; i<strAry.length; i++){
    		strlines=strlines+strAry[i]+"\n";
    	}
    	return strlines;
    }
    
    public static void printStringAry2D(String[][] strAry)
    {
    	for (int i=0; i<strAry.length; i++)
    	{
    		for (int j=0; j<strAry[i].length; j++)
    		System.out.print(strAry[i][j]+"\t");
    		System.out.println();
    	}
    	
    }
    
    public static void printStringAryRange(String[] strAry,int from, int to)
    {
    	System.out.println("-----------------------------------");
    	for (int i=from; i<=to; i++)
    	System.out.println(strAry[i]);
    	System.out.println("-----------------------------------");
    }
    
    /** conver string array into an array of integers (int)
     * assuming all the elements of string array are integers
     */
    public static int[] convertStrAry2intAry(String[] strAry){
    	    	
		int[] intAry =new int[strAry.length];
		for ( int i=0; i<strAry.length ; i++)
		{
			intAry[i] = Integer.parseInt(strAry[i]);	
		}  
    	return intAry;
    }
    
    /** conver int array into a array of strings     
     */
    public static String[] convertintAry2StrAry(int[] intAry){
    	    	
		String[] strAry =new String[intAry.length];
		for ( int i=0; i<intAry.length ; i++)
		{
			strAry[i] = Integer.toString(intAry[i]);	
		}  
    	return strAry;
    }
    
    public static void main(String[ ] args) throws IOException {    	
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    	
    	//String[] strAry=fillstrAryFromFile("D:\\Java_Program\\FileEditor\\file1.txt");
    	//String fname="C:\\Documents and Settings\\murtaza\\My Documents\\tst.txt";
    	
    	
    	System.out.print("Enter input file name ( for example input.txt ): ");
		strAry=FileUtil.fillstrAryFromFileSkipBlankLines(stdin.readLine());
		
		strAry=removeLinesofStrFromStrAry(">>",strAry);
		StringAryUtil.printlnStringAry(strAry);
	
			   	
    }    
     static String[] strAry={};
}
