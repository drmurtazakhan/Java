/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */

import java.io.*;
import java.util.StringTokenizer;
public class TokenSeparatorFromFile
{
	public static void main(String[ ] args) throws IOException
	{
		System.out.println("Copyright: Murtaza Ali Khan ");
        System.out.println("murtaza@ccse.kfupm.edu.sa  OR murtazakhan@pakistani.com ");
        System.out.println("THIS CODE AND INFORMATION ARE PROVIDED \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED.");
        System.out.println("________________________________________________________________________________");
        System.out.println("This progrmas separates token from input file and writes(append) them into outfile.");
        System.out.println("Each line of input file is processed separtely. Each separated token is written in a separate line of output file.");
		String input,outStr,inputFile,outputFile, myDelimiter;
		try
		{
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter input file name ( for example input.txt ): ");
			inputFile=stdin.readLine();		
			BufferedReader  fin  = new BufferedReader(new FileReader(inputFile));
			
			System.out.print("Enter output file name ( for example output.txt ): ");
			outputFile=stdin.readLine();			
			PrintWriter  fout = new PrintWriter(new FileWriter(outputFile,true));
			
			System.out.print("Enter token seprator ( for example ; ): ");
			myDelimiter=stdin.readLine();
			
			int rmLength=myDelimiter.length();
								
			input = fin.readLine( );
			while( input != null)
			{	
			    StringTokenizer tokenFinder = new StringTokenizer(input,myDelimiter);
			    while( tokenFinder.hasMoreTokens( ) )
			    {
			    	outStr=tokenFinder.nextToken();			    	
			    	fout.println(outStr);
			    }				
				input = fin.readLine( ); 				
		    }
		    
		    fin.close( );
		    fout.close( );
		}
		catch(FileNotFoundException e)
		{
		System.out.println("Error - File not found");
		}

	 } // main
}
