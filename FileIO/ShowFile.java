import java.io.*;
public class ShowFile
{
	public static void main(String[ ] args) throws IOException
	{
		int input;
		BufferedReader  fin = null;
		try
		{
		fin = new BufferedReader(new FileReader("myinput.txt"));
		 input = fin.read( );
		while( input != -1)
		    {			        
		    System.out.print((char)  input);
		    input = fin.read( ); 
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
