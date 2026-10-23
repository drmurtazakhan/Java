/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */
import java.io.*;
public class ExtractEmailAddress_v1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String bigString="";
		String inputLine="";
		String inputFile="";
		String outputFile="";
		System.out.print("Enter input file name ( for example input.txt ): ");
		inputFile=stdin.readLine();		
		BufferedReader  inputStream  = new BufferedReader(new FileReader(inputFile));
		System.out.print("Enter output file name ( for example output.txt ): ");
		outputFile=stdin.readLine();		
		PrintWriter  outputStream    = new PrintWriter(new FileWriter(outputFile,true));
		
		System.out.print("Enter beginning delimiter: ");
		String bDL=stdin.readLine();		
		System.out.print("Enter ending delimiter: ");
		String eDL=stdin.readLine();			
		
		inputLine=inputStream.readLine();
		while (inputLine!=null ) // this loop will read the complete
		{							 // file and assign it to String	
			bigString=bigString+inputLine;  // variable bigString
			inputLine=inputStream.readLine();
		}
		String email="";
		String delimitStr="";
		boolean start,stop;
		start=stop=false;
		int bigStringLength = bigString.length();
		for (int i=0; i<bigStringLength; i++)
		{
			char ch= bigString.charAt(i);
			delimitStr=ch+"";
			if ( delimitStr.equals(bDL) )
			start=true;
			if ( delimitStr.equals(eDL) )
			stop=true;
			if (start)
			email=email+ch;
			if (stop)
			{
				int iat=email.indexOf('@');
				if (iat>=0)
				{
					int emailLength=email.length();
					email=email.substring(1,emailLength-1);
					//System.out.println(email);
					outputStream.println(email);
					email="";
					start=false;			
					stop=false;			
				}
				else
				{
					email="";
					start=false;			
					stop=false;
				}			
			}
		}
		inputStream.close();
		outputStream.close();
	}
}