import java.io.*;
import java.util.StringTokenizer;
public class TestLibraryRecords2
{   
	public static void main(String[ ] args) throws IOException
    {
    	BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
    	BufferedReader fin = new BufferedReader(new FileReader("libraryrecords.txt"));    	
    	String[] author = new String[100];    	
    	String[] title = new String[100];
    	String inputLine;
    	StringTokenizer tokenizer;
    	int recordCount=0;
		while( ( inputLine = fin.readLine( )) != null)
		{
			tokenizer = new StringTokenizer(inputLine,"#");
			author[recordCount]=tokenizer.nextToken().trim();
			title[recordCount]=tokenizer.nextToken().trim();			
			recordCount++;			
		}
    	
    	int choice;    	
    	do
    	{
    		System.out.println("\n1. Display All Records");
    		System.out.println("2. Search book from Author");
    		System.out.println("3. Search book from Title");
    		System.out.println("4. Exit");
    		System.out.println();
    		System.out.print("Enter your choice [1-4]: ");    		    		
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
    			System.out.print("Enter Book Title: ");    		    			
    			String bookTitle=stdin.readLine();
    			findCount=0;
    			for (int i=0; i<recordCount; i++)
    			{
    				if (bookTitle.equalsIgnoreCase(title[i]))
    				{
    					System.out.println(author[i]+"\t"+title[i]);    					
    					findCount++;
    				}
    			}
    			System.out.println("--------------------------------------------------");
    			System.out.println(findCount+" Record(s) Found");
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

