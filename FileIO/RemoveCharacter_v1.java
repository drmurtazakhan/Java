/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */
import java.io.*;
public class RemoveCharacter_v1
{
	public static void main(String[ ] args) throws IOException
	{
		String input,outStr,inputFile, removeMe;
		try
		{
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter input file name ( for example input.txt ): ");
			inputFile=stdin.readLine();		
			BufferedReader  fin  = new BufferedReader(new FileReader(inputFile));
			PrintWriter  fout = new PrintWriter(new FileWriter("tempout.txt",false));
			
			System.out.print("Enter the String to be removed from file ( for example > ): ");
			removeMe=stdin.readLine();
			int rmLength=removeMe.length();
								
			input = fin.readLine( );
			while( input != null)
			{			
				outStr=input.replaceAll( removeMe, "");
				fout.println(outStr);
				input = fin.readLine( ); 				
		    }
		    fin.close( );
		    fout.close( );
		    
		    fin  = new BufferedReader(new FileReader("tempout.txt"));
			fout = new PrintWriter(new FileWriter(inputFile,false));
		    
		    System.out.println();
		    input = fin.readLine( );
			while( input != null)
			{			
				fout.println(input);
				input = fin.readLine( ); 				
		    }
		    fin.close( );
		    fout.close( );
		    
		}
		catch(FileNotFoundException e)
		{
		System.out.println("Error - File myinput.txt not found");
		}

	 }
}
