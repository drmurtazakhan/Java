import java.io.*;
import java.util.StringTokenizer;
public class TestLibraryRecords
{   
	public static void main(String[ ] args) throws IOException
    {
    	BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
    	BufferedReader fin1 = new BufferedReader(new FileReader("authors.txt"));    	
    	BufferedReader fin2 = new BufferedReader(new FileReader("titles.txt"));    	
    	String[] author = new String[100];    	
    	String[] title = new String[100];
    	String inputLine1,inputLine2;
    	StringTokenizer tokenizer;
    	int recordCount=0;
    	// assuming both files contain equal number of lines
		while( ( inputLine1 = fin1.readLine( )) != null)
		{			
			author[recordCount]=inputLine1;
			inputLine2 = fin2.readLine();
			title[recordCount]=inputLine2;		
			recordCount++;			
		}
    	
    	
    	int choice;    	
    	do
    	{
    		System.out.println("\n1. Display All Records");
    		System.out.println("2. Search book from Author");    		
    		System.out.println("3. Exit");
    		System.out.println();
    		System.out.print("Enter your choice [1-3]: ");    		    		
    		choice=Integer.parseInt(stdin.readLine());
    		switch (choice)
    		{
    			case 1:
    			for (int i=0; i<recordCount; i++)    			
    			System.out.println(author[i]+"\t"+title[i]);
    			System.out.println("--------------------------------------------------");
    			System.out.println(recordCount+" Record(s) Found");
    			break;
    			case 2:
    			System.out.print("Enter Author Name: ");    		    			
    			String anAuthor=stdin.readLine();    			
    			int findCount=0;
    			for (int i=0; i<recordCount; i++)
    			{
    				if (anAuthor.equalsIgnoreCase(author[i]))    	
    				{
    					System.out.println(author[i]+"\t"+title[i]);    					
    					findCount++;
    				}
    			}
    			System.out.println("--------------------------------------------------");    			
    			System.out.println(findCount+" Record(s) Found");
    			break;
    			case 3:
    			break;
    			default:
    			System.out.println("Wrong input");
    		} //end of switch
    	}
    	while(choice!=3);
    } // end of main method
}

