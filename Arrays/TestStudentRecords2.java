import java.io.*;
import java.util.StringTokenizer;
public class TestStudentRecords2
{   
	public static void main(String[ ] args) throws IOException
    {
    	BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
    	BufferedReader fin = new BufferedReader(new FileReader("studentrecords.txt"));    	
    	int[] id = new int[100];    	
    	String[] major = new String[100];
    	String inputLine;
    	StringTokenizer tokenizer;
    	int recordCount=0;
		while( ( inputLine = fin.readLine( )) != null)
		{
			tokenizer = new StringTokenizer(inputLine);
			id[recordCount]=Integer.parseInt(tokenizer.nextToken());
			major[recordCount]=tokenizer.nextToken();			
			recordCount++;			
		}
    	
    	int choice;    	
    	do
    	{
    		System.out.println("\n1. Display All Records");
    		System.out.println("2. Searching & Displaying record of a given student");
    		System.out.println("3. Counting Number of Students in a given Major");    		
    		System.out.println("4. Exit");
    		System.out.println();
    		System.out.print("Enter your choice [1-4]: ");    		    		
    		choice=Integer.parseInt(stdin.readLine());
    		switch (choice)
    		{
    			case 1:
    			for (int i=0; i<recordCount; i++)    			
    			System.out.println(id[i]+"\t"+major[i]);
    			break;
    			case 2:
    			System.out.print("Enter id of student you want to search: ");    		    			
    			int anID=Integer.parseInt(stdin.readLine());
    			boolean found=false;
    			for (int i=0; i<recordCount && !found; i++)
    			{
    				if (anID==id[i])    	
    				{
    					System.out.println(id[i]+"\t"+major[i]);
    					found=true;    					
    				}
    			}
    			if (!found)
    			System.out.println("Record Not Found");
    			break;
    			case 3:
    			System.out.print("Enter Major Name: ");    		    			
    			String aMajor=stdin.readLine();
    			int majorCount=0;
    			for (int i=0; i<recordCount; i++)
    			{
    				if (aMajor.equalsIgnoreCase(major[i]))
    				majorCount++;
    			}
    			System.out.println(majorCount+" records found");
    			break;
    			case 4:
    			break;
    			default:
    			System.out.println("Wrong input");
    		} //end of switch
    	}
    	while(choice!=4);
    } // end of main method
}

