/*
 * FileUtil.java
 */
import java.io.*;
import java.util.*;

public class FileUtil2 {
       
    
    public static String[] fillstrAryFromFile(String fname) throws IOException {
        BufferedReader  fin = new BufferedReader(new FileReader(fname));
    	Vector vect=new Vector(1000,100);
    	String input=fin.readLine();
    	while (input!= null)
    	{
            vect.add(input);
            input=fin.readLine();    	
        }        
        fin.close();
    	vect.trimToSize();
		String[] strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;
    }
    
    public static void WriteStringAryToFile(String[] strAry,String fname) throws IOException
	{
		PrintWriter  fout = new PrintWriter(new FileWriter(fname));
		for (int i=0; i<strAry.length; i++)
		{
			fout.println(strAry[i]);
		}
		fout.close();
	}
	
	/**
	 *appends given string to the end of each element of given string array
	 *returns new string array
	 */
	public static String[] AppendString(String[] strAry,String appStr)
	{
		String[] newstrAry=new String[strAry.length];
		
		for (int i=0; i<strAry.length; i++)
		{
			newstrAry[i]=strAry[i]+appStr;
		}
		return newstrAry;
	}
	
	
	public static void ApplyOperationToEveryTokenOfEachLine(String fname,String Op) throws IOException
	{
		String[] strAry=fillstrAryFromFile(fname);
		
		for (int i=0; i<strAry.length; i++)
		{
			StringTokenizer tok = new StringTokenizer(strAry[i]);
	    	while( tok.hasMoreTokens( ) )
	    	{
	    	 // To be implemented	
	    	}
		}
				
	}
    
    public static void ReverseFile(String fname1, String fname2) throws IOException
	{
		String[] strAry=fillstrAryFromFile(fname1);
		PrintWriter  fout = new PrintWriter(new FileWriter(fname2));
		for (int i=strAry.length-1; i>=0; i--)
		{
			fout.println(strAry[i]);
		}
		fout.close();
	}
    
    public static String removeAndTrimFromGivenChar(String str, char removeFrom)
    {
    	int i=str.indexOf(removeFrom);
    	if(i<0)
    	{
    		return str; // not found return orginal string
    	}
    	
    	return str.substring(0,i).trim();    	
    }
    
    public static boolean compareTwoFiles(String fname1, String fname2) throws IOException
    {
    	 
    	String[] strAry1=fillstrAryFromFile(fname1);
    	String[] strAry2=fillstrAryFromFile(fname2);
    	
    	
    	if(strAry1.length!=strAry2.length)
    	{
    		System.out.println("strAry1.length="+strAry1.length);
    		System.out.println("strAry2.length="+strAry2.length);
    		return false;
    	}
    	
    	for (int i=0; i<strAry1.length  ; i++)
    	{
    		if(!strAry1[i].equals(strAry1[i]) )
    		{
    			System.out.println("Mismatch in line: "+i);
    			return false;
    		}
    	}
    	return true;
    	
    }
    
    public static String[] SortandRemoveDuplicate(String[] org)
    {
    	// sort then remove duplicate the returns sorted
    	// array without duplicate elements
    	Arrays.sort(org);
    	Vector vect = new Vector(100);
    	boolean flag=false;
    	for (int i=0; i<org.length-1  ; i++)
    	{
    		if(!org[i].equals(org[i+1]))
			vect.add(org[i]);
    	}
    	vect.add(org[org.length-1]); // last element	
    	
    	vect.trimToSize();
		String[] strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;
    	
    }
    
    public static int findIndexOfSearchString1(String str,String[] strAry)
    {
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
    
    
    
    public static void overwriteLineinAry(String newLine, int index, String[] strAry)
    {
    	// overwrite old line with new line in the given array at given index
    	strAry[index]=newLine;
    }
    
    public static void writeStringAryToFile(String fname,String[] strAry) throws IOException
    { 
    	// overwrite
    	PrintWriter  fout = new PrintWriter(new FileWriter(fname,false));
    	for (int i=0; i<strAry.length; i++)
    	fout.println(strAry[i]);
    	fout.close();
    	
    }
    
    public static void appendStringAryToFile(String fname,String[] strAry) throws IOException
    { 
    	// append
    	PrintWriter  fout = new PrintWriter(new FileWriter(fname,true));
    	for (int i=0; i<strAry.length; i++)
    	fout.println(strAry[i]);
    	fout.close();
    	
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
    	System.out.println(strAry[i]);
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
    
    public static void main(String[ ] args) throws IOException {
    	
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    	
    	//String[] strAry=fillstrAryFromFile("D:\\Java_Program\\FileEditor\\file1.txt");
    	//String fname="C:\\Documents and Settings\\murtaza\\My Documents\\tst.txt";
    	
    	System.out.print("Enter input file name ( for example input.txt ): ");
		String fname=stdin.readLine();		
    	String[] strAry=fillstrAryFromFile(fname);
    	
    	
    	
    	AssoString[] ary3=find1LAfterGivenStrMakeAsso("DATES",strAry);
    	AssoString.printAssoStringAry(ary3);
    	System.out.println("-------------");
    	Integer intObj1=(Integer)ary3[1].getValue();
    	int startIndex=intObj1.intValue(); 
    	//WCONINJE; str2=ANDR0052
    	int x=searchStringFromIndex("WCONINJE","ANDR0052",startIndex,strAry);
    	System.out.println(x);
    	if(x>-1)
    	System.out.println(strAry[x]);
    	
    	System.out.println("-------------");
    	Integer intObj2=(Integer)ary3[2].getValue();
    	int endIndex=intObj2.intValue(); 
    	int y=searchStringFromBetweenIndices("COMPDAT","ANDR0003",startIndex,endIndex,strAry);
    	System.out.println(y);
    	System.out.println(strAry[y]);
    	System.out.println("-------------Test copy records");
    	
    	
    	String[] oldAry={"2","3","1","7"}; //indices   0   1   2   3
    	String[] insertAry={"8","9"};
    	String[] newAry=insertLinesinStrAry(1,insertAry,oldAry);
    	System.out.println("new Ary length="+newAry.length);
    	printStringAry(newAry);   	
    	   		    		
    }    
     
}
