/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */

using System;
using System.IO;
using System.Text;
using System.IO.IsolatedStorage;

/* This program removes duplicate lines from a file and save output in a file name "inputfilename+.out" */
class RemoveDuplicateLinesFromFile {

private static Encoding fileEncoding = Encoding.UTF8;
    
    public static void Main() {
          String[] strArray ;
          Console.WriteLine("Enter input file name e.g. C:\\programs\\input.txt");
          String inputFile=Console.ReadLine();          
          String outputFile=inputFile+".out";	

          strArray=readFileLinebyLine(inputFile, fileEncoding);
          strArray=ArrayUtility.removeDuplicate(strArray);			
          writeToFileLinebyLine(strArray,outputFile, fileEncoding);
          	
    } // Main()
   
   /* This method reads file line by line and returns lines in an array of String   */
    public static String[] readFileLinebyLine(String pathname, Encoding fileEncoding) {    
        	
	int lineCount=0;
              String[] lineArray;
              try {
              // Attempt to open the input file for read-only access
              FileStream fsIn = new FileStream(pathname, FileMode.Open, FileAccess.Read, FileShare.Read);
	StreamReader sr = new StreamReader(fsIn, fileEncoding, true);              
              for (String Line = sr.ReadLine(); Line != null; Line = sr.ReadLine()) {
                    lineCount++;		
              }	
	
              // Explicitly close the StreamReader to properly flush all buffers
              sr.Close(); // This also closes the FileStream (fsIn)
              }
              catch (FileNotFoundException) {
              Console.WriteLine("File Not Found");            
              }
              lineArray = new String[lineCount] ;	
	try {
              // Attempt to open the input file for read-only access
              FileStream fsIn = new FileStream(pathname, FileMode.Open, FileAccess.Read, FileShare.Read);
	StreamReader sr = new StreamReader(fsIn, fileEncoding, true);
	int j=0;              
              for (String Line = sr.ReadLine(); Line != null; Line = sr.ReadLine()) {
                    lineArray[j] =Line;
                    j++;		
              }		
              // Explicitly close the StreamReader to properly flush all buffers
              sr.Close(); // This also closes the FileStream (fsIn)
              }
              catch (FileNotFoundException) {
              Console.WriteLine("File Not Found");            
              }
              return lineArray;	 
    } // readFileLinebyLine

    /* This method writes the contents of String array to file line by line    */
    public static void writeToFileLinebyLine(String[] array, String pathname, Encoding fileEncoding) {
          try {
               FileStream fsOut = new FileStream(pathname, FileMode.Create, FileAccess.Write, FileShare.None);
               StreamWriter sw = new StreamWriter(fsOut, fileEncoding);   
               for (int i=0; i< array.Length; i++)
               sw.WriteLine(array[i]);      
               sw.Close(); 
          }              
          catch(Exception e) {
               Console.WriteLine("Exception: " + e.Message);
           }

    } // writeToFileLinebyLine

} //  class RemoveDuplicateLinesFromFile

public class ArrayUtility
{

/* returns a new  array without duplicate elements. Original array is intact */	 
    public static String[] removeDuplicate(String[] arr) {		
	if (arr.Length-1<=1)
	return arr;
	bool found;
	int j;	
	String[] arr2 = new String[arr.Length];	
	int count=0;	
	for (int i=0; i<arr.Length; i++)
	{	found=false;
		j=0;
		while (found==false &&  j<count )
		{
			if (arr[i]==arr2[j])	
		                      found=true;						
			j++;
		}
		if (found==false)
		{	arr2[count]=arr[i];
			count++;	
		}
	}	
	String[] arr3 = new String[count];
	for (int i=0; i<arr3.Length; i++)
	arr3[i]=arr2[i];
	return arr3;              
      }

}
