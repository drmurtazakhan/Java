/*
 * FileUtil.java
 */
 
package mak2000.FileIO; 
import java.io.*;
import java.util.*;
import mak2000.Tokenizer.TokenizerUtil;

public class FileUtil {
       
    
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
    
    /**
     * Read lines from file (skip blank lines) and fill the string array
     */
    public static String[] fillstrAryFromFileSkipBlankLines(String fname) throws IOException {
        BufferedReader  fin = new BufferedReader(new FileReader(fname));
    	Vector vect=new Vector(1000,100);
    	String input=fin.readLine();
    	while (input!= null)
    	{
    		if (input.length()!= 0){
    			vect.add(input);
    		}
            
            input=fin.readLine();    	
        }        
        fin.close();
    	vect.trimToSize();
		String[] strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;
    }
    

    public static void writeStringAryToFile(String[] strAry,String fname) throws IOException
	{
		PrintWriter  fout = new PrintWriter(new FileWriter(fname));
		for (int i=0; i<strAry.length; i++)
		{
			fout.println(strAry[i]);
		}
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
    
    /**
     *remove first token e.g., line number from each line of file
     */
    public static void removeFirstTokFromEachLine(String fname) throws IOException
    { 
    	String[] strAry=fillstrAryFromFile(fname);
    	
    	// processing line by line
    	String strN="";
    	for (int k=0; k<strAry.length; k++){
    		strN=TokenizerUtil.getStrFromTokToEndwithDlim(strAry[k],3);
    		strAry[k]=strN;
    	}
    	
    	writeStringAryToFile(strAry,fname);
    	
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
    
    
    
    public static void main(String[ ] args) throws IOException {
    	
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    	
    	//String[] strAry=fillstrAryFromFile("D:\\Java_Program\\FileEditor\\file1.txt");
    	//String fname="C:\\Documents and Settings\\murtaza\\My Documents\\tst.txt";
    	
    	System.out.print("Enter input file name ( for example input.txt ): ");
		String fname=stdin.readLine();		
    	//String[] strAry=fillstrAryFromFile(fname);
    	
    	removeFirstTokFromEachLine(fname);
    	   	  	
    	   		    		
    }    
     
}
