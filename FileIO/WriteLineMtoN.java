import java.io.*;
public class WriteLineMtoN
{	public static void main(String[] args) throws IOException
	{	BufferedReader fIn = new BufferedReader(new FileReader("file1.txt"));
		PrintWriter fOut = new PrintWriter(new FileWriter("file2.txt"));
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter m: ");		
		int m=Integer.parseInt(stdin.readLine());				
		System.out.print("Enter n: ");		
		int n=Integer.parseInt(stdin.readLine());
		String line;
		line=fIn.readLine();
		int count=1;
		while(line != null)
		{	
			if (count>=m && count<=n)
			fOut.println(line);		
			line=fIn.readLine();
			count++;
		}
		fIn.close();
		fOut.close();
	}
}