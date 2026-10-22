import java.io.*;
import java.util.StringTokenizer;
class StudentRecord
{
	int idNumber;
	double gpa;
	
	public StudentRecord(int idNumber, double gpa)
	{
		this.idNumber = idNumber;
		this.gpa = gpa;
	}
	
	public static void addRecords(StudentRecord[] record, String dataFile)
	{
				
		try
		{				
			FileWriter writer = new FileWriter(dataFile,true);
			PrintWriter  outStream = new PrintWriter(writer);			     
			
			for (int k=0; k<record.length; k++)
			{
				outStream.println(record[k].idNumber+"\t"+record[k].gpa);
			}
			outStream.close();
		}
		catch(IOException e)
		{
			System.out.println("Error handling files");
		}		
	}
	
	public static double average(String dataFile)
    {
    	double gpa,sum=0;
    	int id;
    	int  count=0;
    	try
    	{
    		BufferedReader  inputStream  =  new BufferedReader(new FileReader(dataFile));
    		StringTokenizer tokenizer;
    		String inputLine;
    		while((inputLine = inputStream.readLine( )) != null)
    		{
    			
    			
    			tokenizer = new StringTokenizer(inputLine);
    			id  = Integer.parseInt(tokenizer.nextToken());
    			gpa = Double.parseDouble(tokenizer.nextToken());			
    			sum=sum+gpa;
    			count++;
    			
    		}
    	}
    	catch(IOException e)
		{
			System.out.println("Error handling files");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Expecting Number"+e);		
		}   
		return (sum/count); 	
    }   
}	

public class StudentRecordTest
{
	static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		int size,id,choice;
		double gpa;
		String dataFile="idgpa.txt";
		//String dataFile="idgpa.num";
		System.out.println("1. Add Records ");
		System.out.println("2. Compute Average ");
		System.out.println("3. End Program ");
		do
		{
			System.out.print("\nEnter your choice ");
			choice = Integer.parseInt(stdin.readLine());
			switch(choice)
			{
				case 1:
				System.out.print("Enter number of students: ");
				size = Integer.parseInt(stdin.readLine());
				StudentRecord[] students = new StudentRecord[size];
				for (int i=0; i<size; i++)
				{
					System.out.print("ID  : ");
					id = Integer.parseInt(stdin.readLine());
					System.out.print("GPA : ");
					gpa = Double.parseDouble( stdin.readLine());
					StudentRecord s = new StudentRecord(id, gpa);
					students[i] =s;
				}
				StudentRecord.addRecords(students,dataFile);              
				break;
				case 2:
				double average = StudentRecord.average(dataFile);
				System.out.println("The Average GPA is "+average);
				break;
				case 3:
				break;				
			} // end of switch   	
		} // end of do while
		while (choice != 3);
    }
}
