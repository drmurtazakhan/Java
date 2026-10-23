/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */
import java.io.*;
public class ReadFileLinebyLine
{
	public static void main(String[ ] args) throws IOException
	{
		String input;
		try
		{
			BufferedReader  fin = new BufferedReader(new FileReader("myinput.txt"));
			input = fin.readLine( );
			while( input != null)
			{
				System.out.println(input);
				input = fin.readLine( ); 
				//jta.append(input);
		    }
		    fin.close( );
		    System.out.println();
		}
		catch(FileNotFoundException e)
		{
		System.out.println("Error - File myinput.txt not found");
		}

	 }
}
