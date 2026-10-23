import java.io.*;
public class EvenOddSeparator
{	public static void main(String[] args) throws IOException
	{	BufferedReader fIn = new BufferedReader(new FileReader("numbers.txt"));
		PrintWriter fOut1 = new PrintWriter(new FileWriter("even.txt"));		
		PrintWriter fOut2 = new PrintWriter(new FileWriter("odd.txt"));		
		
		int num=0,ec=0,oc=0;
		
		String line=fIn.readLine();		
		while(line != null)
		{	num=Integer.parseInt(line);
			if(num%2==0)
			{	ec++;
				fOut1.println(num);
			}
			else
			{	oc++;
				fOut2.println(num);
			}
			line=fIn.readLine();		
		}
		System.out.println("Total Even numbers are: "+ec);
		System.out.println("Total Odd numbers are: "+oc);		
		fIn.close();
		fOut1.close();
		fOut2.close();
	}
}