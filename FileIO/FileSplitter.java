/* This program Reads from a inputfile and Prints in two files. */
import java.io.*;
public class FileSplitter
{
	/*Reads IDs and Names from NamesIDs.txt file and Prints IDs in IDs.txt file
	  and prints Names in Names.txt file */
	public static void main(String args[]) throws IOException
	{
		String line;		// String variable used to read a line from the input file
		
		// Opening input File "NamesIDs.txt" for reading
		BufferedReader fileIn = new BufferedReader(new FileReader("NamesIDs.txt"));
		
		// Opening output File "IDs.txt" for printing IDs in it
		PrintWriter fileOutIDs = new PrintWriter(new FileWriter("IDs.txt"));
		
		// Opening output File "Names.txt" for printing Names in it
		PrintWriter fileOutNames = new PrintWriter(new FileWriter("Names.txt"));
				
		line = fileIn.readLine();   	// Reads the first line of the File "NamesIDs.txt"
		while(line != null)				// Loop until the end of input file
		{
		
			fileOutIDs.println(line);   // Prints the ID in the File "IDs.txt"
			line = fileIn.readLine();	// Reads the ID from the File "NamesIDs.txt"
			fileOutNames.println(line);	// Prints the name in the File "Names.txt"
			line = fileIn.readLine();	// Reads the next ID from the File "NamesIDs.txt"
		}
		
		fileOutNames.close();			// close the output file Names.txt
		fileOutIDs.close();				// close the output file IDs.txt
		fileIn.close();					// close the input file NamesIDs.txt
        }
}