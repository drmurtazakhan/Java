/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */

using System;
using System.IO;
using System.Text;
using System.IO.IsolatedStorage;



/* output file name  "inputfilename+.Out.txt" */

class LinesMergeAndSeparate {

private static Encoding fileEncoding = Encoding.UTF8;
    
    public static void Main() {
          Console.WriteLine("Copyright: Murtaza Ali Khan ");
          Console.WriteLine("murtaza@ccse.kfupm.edu.sa  OR murtazakhan@pakistani.com ");
          Console.WriteLine("THIS CODE AND INFORMATION ARE PROVIDED \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED");
          Console.WriteLine("This program reads lines from a input a file and store data in a output file that accomodates x lines of input file in single line. Each line of output file separates lines of input file by a given separator string");
          Console.WriteLine(" e.g. if input file has 102 lines, x is 20 and separator String is , (comma) then output file will have 6 lines, first 5 lines each contains 10 lines of input file and  6th line contains 2 lines of input file ") ;
          Console.WriteLine();
          String[] strArray ;
          Console.Write("Enter input file name e.g. C:\\programs\\input.txt: ");
          String inputFile=Console.ReadLine();          
          String outputFile=inputFile+".Out.txt";
         
          Console.Write("Enter number of lines of input file that will be in one line of output file: ");
          int x=Int32.Parse( Console.ReadLine() );          	
          
          Console.Write("Enter separator: ");
          String sep= Console.ReadLine();          	

          strArray=readFileLinebyLine(inputFile, fileEncoding);          
          writeToFile(strArray,outputFile, x, sep, fileEncoding);
          	
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


    /* This method writes the contents of String array to output file     */
    public static void writeToFile(String[] array, String pathname, int x, String sep, Encoding fileEncoding) {
          if (x==0) return;
          try {
               FileStream fsOut = new FileStream(pathname, FileMode.Create, FileAccess.Write, FileShare.None);
               StreamWriter sw = new StreamWriter(fsOut, fileEncoding);   
               for (int i=0; i< array.Length; i++) {
                    sw.Write(array[i]+sep);
                    if ( (i+1) % x==0)
                    sw.WriteLine();  // go to new line
               }      
       
               sw.Close(); 
          }              
          catch(Exception e) {
               Console.WriteLine("Exception: " + e.Message);
           }

    } // writeToFile

} //  class LinesMergeAndSeparate.cs

