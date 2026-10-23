import java.util.*;
import java.io.*;
public class AddString2EndOfEachLine
{
	
	//System.out.println(replaceString(line,oldStr,newStr));
	
	
	public static void main(String[ ] args) throws IOException
	{
		System.out.println("Copyright: Murtaza Ali Khan ");
        System.out.println("khan_goodluck@yahoo.com");
        System.out.println("THIS CODE AND INFORMATION ARE PROVIDED \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED.");
        System.out.println("________________________________________________________________________________");
        System.out.println("This program read each line of input file, append it with given string..");
        System.out.println("and writes appended lines to outfile.");
        System.out.println("");
		String input,outStr,inputFile,outputFile, myStr;
		try
		{
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter input file name ( for example input.txt ): ");
			inputFile=stdin.readLine();		
			BufferedReader  fin  = new BufferedReader(new FileReader(inputFile));
			
			System.out.print("Enter output file name ( for example output.txt ): ");
			outputFile=stdin.readLine();			
			PrintWriter  fout = new PrintWriter(new FileWriter(outputFile,true));
			
			System.out.print("Enter the string you want to append at the end of each line ");
		    String appStr=stdin.readLine();						
		    
		    String[] strAry1=FileUtil2.fillstrAryFromFile(inputFile);
		    String[] strAry2=FileUtil2.AppendString(strAry1,appStr);
		    FileUtil2.writeStringAryToFile(outputFile,strAry2);
		    
								
			
		} // end of try block
		catch(FileNotFoundException e)
		{
			System.out.println("Error - File not found");
		}

	 } // main
	
}