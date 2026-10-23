/* This program Reads from two inputfiles and Prints in one files. */
import java.io.*;
public class FileJoin
{
	/*Reads IDs from IDs.txt and Names from Names.txt file and Prints both 
	in NamesIDs.txt file */
	  
	public static void main(String args[]) throws IOException
	{
		String line;		// String variable used to read a line from the input file
		
		// Opening input File "Names.txt" for reading
		BufferedReader fileInNames = new BufferedReader(new FileReader("Names.txt"));
		
		// Opening input File "IDs.txt" for reading
		BufferedReader fileInIDs = new BufferedReader(new FileReader("IDs.txt"));
		
		// Opening output File "NamesIDs.txt" for printing Names and IDs in it
		PrintWriter fileOutNamesIDs = new PrintWriter(new FileWriter("NamesIDs.txt"));
				
		line = fileInIDs.readLine();   	// Reads the first ID from the File "IDs.txt"
		while(line != null)				// Loop until the end of input file
		{
		
			fileOutNamesIDs.println(line);   // Prints the ID in the File "NamesIDs.txt"
			line = fileInNames.readLine();	 // Reads the Names from the File "Names.txt"
			fileOutNamesIDs.println(line);	 // Prints the name in the File "NamesIDs.txt"
			line = fileInIDs.readLine();	 // Reads the next ID from the File "IDs.txt"
		}
		
		fileInNames.close();		// close the input file Names.txt
		fileInIDs.close();			// close the input file IDs.txt
		fileOutNamesIDs.close();	// close the output file NamesIDs.txt
        }
}