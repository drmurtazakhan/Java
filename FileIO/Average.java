import java.io.*;
public class Average
{
	public static void main(String[ ] args) 
	{
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader("grades2.txt"));
			String inputLine;
			float grade, sum = 0.0F;
			int count = 0;
			while( ( inputLine = fin.readLine( )) != null)
			{
				grade = Float.parseFloat(inputLine);
				sum += grade;
				count++;
				System.out.println(grade);
			}
			if(count == 0)
			System.out.println("Error - no grades were read");
			else
			{
				System.out.println("\nThe average is"+sum/count);
				System.out.println("\n"+count+" lines are read");
			}
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
		catch(NumberFormatException e)
		{	
		System.err.println("Error - An invalid float number read");
		}
	}
}