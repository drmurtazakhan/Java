import java.util.*;
import java.io.*;
public class ReplaceStringFromFile
{
	
	//System.out.println(replaceString(line,oldStr,newStr));
	
	
	public static void main(String[ ] args) throws IOException
	{
		System.out.println("Copyright: Murtaza Ali Khan ");
        System.out.println("khan_goodluck@yahoo.com");
        System.out.println("THIS CODE AND INFORMATION ARE PROVIDED \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED.");
        System.out.println("________________________________________________________________________________");
        System.out.println("This program replaces all occurances of given string with new given string from input file");
        System.out.println("and writes(append) them into outfile. Each line of input file is processed separtely.");
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
			
			System.out.print("Enter the string you want to replace ( for example: abc ): ");
			String oldStr=stdin.readLine();
		    
		    System.out.print("Enter the new string ( for example: xyz ): ");
		    String newStr=stdin.readLine();						
								
			input = fin.readLine( );
			while( input != null)
			{	
			
			    String replacedLine=input.replaceAll(oldStr,newStr);
			    fout.println(replacedLine);		    
			    input = fin.readLine( ); 				
		    } 
		    
		    fin.close( );
		    fout.close( );
		} // end of try block
		catch(FileNotFoundException e)
		{
			System.out.println("Error - File not found");
		}

	 } // main
	
}