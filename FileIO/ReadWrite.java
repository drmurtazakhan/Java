import java.io.*;
public class ReadWrite
{	public static void main(String[] args) throws IOException
	{	BufferedReader fIn = new BufferedReader(new FileReader("numbers.txt"));
		PrintWriter fOut = new PrintWriter(new FileWriter("avg.txt"));		
		int count=0;
		double sum=0.0;
		String line=fIn.readLine();		
		while(line != null)
		{	sum+=Double.parseDouble(line);
			line=fIn.readLine();
			count++;
		}
		if (count!=0)
		fOut.println(sum/count);//avg		
		fIn.close();
		fOut.close();
	}
}