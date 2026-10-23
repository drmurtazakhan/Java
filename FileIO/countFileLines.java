import java.io.*;
public class countFileLines
{
	public static void main(String[ ] args) 
	{
		try
		{
			BufferedReader fin = new 
			BufferedReader(new FileReader("names.txt"));
			String inputLine;
			int count = 0;
			while( ( inputLine = fin.readLine( )) != null)
			{
				count++;
				System.out.println(inputLine);
			}
			if(count == 0)
			System.out.println("No line");
			else
			System.out.println("\n"+count+" lines are read");
			fin.close( );	     
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Error - Input File is not found");
		}
		catch(IOException e)
		{
			System.err.println("Error - An I/O error occured");
		}		
	}
}