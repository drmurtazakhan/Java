import java.io.*;
public class Stars
{	public static void main(String[] args) throws IOException
	{	BufferedReader fIn = new BufferedReader(new FileReader("numbers.txt"));
		PrintWriter fOut = new PrintWriter(new FileWriter("stars.txt"));
		int x;
		String line;
		line=fIn.readLine();
		while(line != null)
		{	x=Integer.parseInt(line);
			int i=1;
			while (i<=x)
			{
				fOut.print("*");	
				i++;
			}
			fOut.println();	
			line=fIn.readLine();			
		}
		fIn.close();
		fOut.close();
	}
}