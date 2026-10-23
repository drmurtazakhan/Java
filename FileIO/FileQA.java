import java.io.*;
import java.util.*;

import java.text.*;
public class FileQA
{
	public static void main(String args[]) throws IOException
	{
		int MaxNoOfQs= 3;
		int[] ans = new int[MaxNoOfQs];
		boolean finish=false;
		String quesFile="ques.txt";
		String stuansFile="stuans.txt";
		String corransFile="corrans.txt";
		String resultFile="result.txt"; 
		
		StringTokenizer tokenizer;
		String inputLine,strToken,firstToken;
		String delimiters;
		int choiceCount=0;
		int qCount=0;
		String c1,c2,c3,c4; // choices
		c1=c2=c3=c4="";
		String choice="";
		String q=""; //question
		String stuChoice="";
		
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter you ID ");
		String  id  =  stdin.readLine( ) ;
		
		BufferedReader  inputStream  =  new BufferedReader(new FileReader(quesFile));
		PrintWriter  out = new PrintWriter(new FileWriter(stuansFile,true));
		out.print("st"+id+"\t");		
		while((inputLine = inputStream.readLine( )) != null)
		{
			choice="";				
			tokenizer = new StringTokenizer(inputLine);				
			firstToken = tokenizer.nextToken( );
			while( tokenizer.hasMoreTokens( )) // inner while loop
			{
				strToken = tokenizer.nextToken( );
				if (firstToken.equals("#"))
				q=q+strToken+" ";
				if (strToken.equals("#"))
				{
					q=q.trim();
					q=q.substring(0,q.length()-1);
					System.out.println("Q."+(qCount+1)+" "+q+"\n");
					q="";
					firstToken="";
				}
				if (firstToken.equals("|"))	
				choice=choice+strToken+" ";
				if (strToken.equals("|"))
				{
					choice=choice.trim();
					choice=choice.substring(0,choice.length()-1);
					choiceCount=choiceCount+1;
					System.out.println("("+choiceCount+") "+choice);					
					firstToken="";			
				}				
			} // end of inner while loop
			if (choiceCount==4)
			{
				System.out.print("Enter your choice b/w [1-4] ");
				stuChoice    =  stdin.readLine( ) ;
				if (stuChoice.equals("1"))
				ans[qCount]=1; 		
				else if (stuChoice.equals("2"))
				ans[qCount]=2;		
				else if (stuChoice.equals("3"))
				ans[qCount]=3;		
				else if (stuChoice.equals("4"))
				ans[qCount]=4; 	
				else
				ans[qCount]=0;
				choiceCount=0;
				qCount++; 	
				System.out.println();
			}
			
		} // end of outer while loop
		for (int i=0; i<MaxNoOfQs; i++)
		//System.out.println(ans[i]);
		out.print(ans[i]);
		out.println();
		inputStream.close();
		out.close();	 	
		finish=true;
		
	}	
}