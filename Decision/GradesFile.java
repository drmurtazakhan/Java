import java.io.*;
public class GradesFile
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader fIn = new BufferedReader(new FileReader("grades.txt"));
		PrintWriter fOut = new PrintWriter(new FileWriter("letter.txt"));
		int grade;
		grade=Integer.parseInt(fIn.readLine().trim());
		while(grade!=-1)
		{
			if(grade >=90)
				fOut.println("A+");
			else if (grade >=85)
				fOut.println("A");
			else if (grade >=80)
				fOut.println("B+");
			else if (grade >=75)
				fOut.println("B");
			else if (grade >=65)
				fOut.println("C+");
			else if (grade >=60)
				fOut.println("C");
			else if (grade >=55)
				fOut.println("D+");
			else if (grade >=50)
				fOut.println("D");
			else if (grade <50)
				fOut.println("F");
			grade=Integer.parseInt(fIn.readLine().trim());
		}
		fIn.close();
		fOut.close();
	}
}