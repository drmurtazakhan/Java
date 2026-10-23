import java.io.*;
public class InputFromFile
{	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException
	{	BufferedReader  inputStream = null;
		//String path = stdin.readLine().trim();
		String path="ip.txt";
		try
		{
			inputStream = new BufferedReader(new FileReader(path));		 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error - File " +  path + " not found");
			System.exit(1);
		}
		String inputLine = null;
		int lineNumber = 0;
		while((inputLine= inputStream.readLine()) != null)
		{
			lineNumber++;			
			System.out.println(lineNumber+" "+inputLine);
		}
 	}  
}