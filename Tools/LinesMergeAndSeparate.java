import java.io.*;
import java.util.*;
public class LinesMergeAndSeparate
{
	public static void main(String[ ] args) throws IOException
	{
		String inputFile; 
		String[] strAry;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try
		{	
			System.out.print("Enter input file name ( for example input.txt ): ");
			inputFile=stdin.readLine();		
			BufferedReader  fin  = new BufferedReader(new FileReader(inputFile));			
			strAry=fillstrAryFromFile(inputFile);		
			fin.close( );
			
			System.out.print("\nEnter separator string e.g. , (comma) ");
			String sep=stdin.readLine();
			
			System.out.println("Enter Number of lines of input file to be merge in one line of output file: ");
			int x=Integer.parseInt(stdin.readLine());
		
			writeToFile(strAry, x, sep, inputFile);
			System.out.println("Done Successfully. ");
			System.out.println("See the output file "+inputFile+"out");
		}
		catch(IOException e)
		{
			System.out.println("Input File Error");
		}

	 }
	 
	 public static String[] fillstrAryFromFile(String fname) throws IOException
	 {
        BufferedReader  fin = new BufferedReader(new FileReader(fname));
    	Vector vect=new Vector(1000,100);
    	String input=fin.readLine();
    	while (input!= null)
    	{
            vect.add(input);
            input=fin.readLine();    	
        }        
        fin.close();
    	vect.trimToSize();
		String[] strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;
      }
      
      /* This method writes the contents of String array to output file     */
    public static void writeToFile(String[] array, int x, String sep,String fname) {
          if (x==0) return;
          try {
               PrintWriter  fout = new PrintWriter(new FileWriter(fname+"out"));
                  
               for (int i=0; i< array.length; i++) {
               		fout.print(array[i]+sep);                    
                    if ( (i+1) % x==0)
                    fout.println();  // go to new line
               }      
       
               fout.close(); 
          }              
          catch(IOException e) {
               System.out.println("Output File Error");
           }

    } // writeToFile
}
