/**
 * @(#)StringManager.java
 *
 *
 * @author 
 * @version 1.00 2007/8/17
 */

import mak2000.string.StringUtil;
import mak2000.string.StringAryUtil;
import mak2000.FileIO.FileUtil;
import java.io.*;
import java.util.*;

public class StringManagerTest1 {
	
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static String[] strAry1={""};
	static String[] strAry2={""};
	String inputLine="";
	
	public static void mainMenu() throws IOException{
		int choice=0;
        String str1=""; String str2="";
        int k1=0; int k2=0;
         
        System.out.println("------------------------------------------");		
		System.out.println("0  Exit Program");
		System.out.println("1  Read Records From a File");
		System.out.println("2  Display Records");
		System.out.println("3  Write Records To a File");
		System.out.println("4  Extract Records For a Given Sub-string");
		System.out.println("5  Extract Records of Delimited Strings");
		System.out.println("6  Replace String in Records");
		System.out.println("7  Delete String From Records");
		System.out.println("8  Add String To End of Records");
		System.out.println("9  Sort Records");
		System.out.println("10 Delete Duplicate Records From Sorted Records");
		System.out.println("11 Mark Duplicate Records in Sorted Records");
		System.out.println("12 Delete Another Set of Records From Main Unique & Sorted Records");
		System.out.println("13 Mark Another Set of Records in Main Unique & Sorted Records");
		System.out.println("14 Delete Marked Records");

		System.out.print("Enter Choice: ");
		choice=(Integer.parseInt(stdin.readLine()));
		
		switch(choice)
		{
			case 0:
				System.exit(0);
				break;
			case 1:				
				System.out.print("Enter name of input file (for example input.txt ): ");
		        strAry1=FileUtil.fillstrAryFromFileSkipBlankLines(stdin.readLine());
		        strAry1=StringAryUtil.trimStringAry(strAry1);
		        System.out.println(strAry1.length+" records are read.");
		        break;
			case 2:
				StringAryUtil.printlnStringAry(strAry1);
				break;
			case 3:
				System.out.print("Enter name of output file (for example output.txt ): ");
				FileUtil.writeStringAryToFile(strAry1,stdin.readLine());
				System.out.println(strAry1.length+" records are written.");
				break;				
			case 4:
				System.out.print("Enter sub-string (for example @ ): ");
				String subStr=stdin.readLine();
				strAry1=StringAryUtil.extractStrofSubStr(subStr, strAry1);
				System.out.println(strAry1.length+" records are extracted.");
				StringAryUtil.printlnStringAry(strAry1);
				break;
			case 5:
				System.out.print("Enter Beginning Delimiter: ");
				str1=stdin.readLine();
				System.out.print("Enter Ending Delimiter: ");
				str2=stdin.readLine();
				strAry1=StringAryUtil.extractDelimitedStr(str1, str2, strAry1);
				System.out.println(strAry1.length+" records are extracted.");
				break;
			case 6:
				System.out.print("Enter Old String: ");
				str1=stdin.readLine();
				System.out.print("Enter New String: ($, /, ^ not allowed) ");
				str2=stdin.readLine();				
				strAry1=StringAryUtil.replaceStrInStrAry(str1, str2, strAry1);
				break;
			case 7:
				System.out.print("Enter the String to be deleted: ");
				str1=stdin.readLine();
				str2=""; // replace with empty string				
				strAry1=StringAryUtil.replaceStrInStrAry(str1, str2, strAry1);				
				break;
			case 8:
				System.out.print("Enter String To Be Applended: ");
				str1=stdin.readLine();
				strAry1=StringAryUtil.AppendString(strAry1,str1);
				break;
			case 9:
				Arrays.sort(strAry1);
				System.out.println(strAry1.length+" records are sorted.");
				break;
			case 10:
				System.out.println("Caution: Records must already be sorted ");
				k1=strAry1.length;
				strAry1=StringAryUtil.removeDuplicateFromSorted(strAry1);
				k2=strAry1.length;
				System.out.println((k1-k2)+" duplicate records are found and deleted");
				break;
			case 11: 
				System.out.println("Caution: Records must already be sorted ");
				System.out.print("Enter Mark To Be Pre-appended in Duplicate Records: ");
				str1=stdin.readLine();				
				strAry1=StringAryUtil.markDuplicateFromSorted(strAry1,str1);				
				System.out.println(" Duplicate records are marked (if any)");				
				break; 
			case 12:
				System.out.println("Caution: Main array of records should be unique and sorted");
				System.out.print("Enter name of input file whose records to be deleted in main set of records: ");
				strAry2=FileUtil.fillstrAryFromFileSkipBlankLines(stdin.readLine());
				strAry2=StringAryUtil.trimStringAry(strAry2);
				System.out.println(strAry2.length+" records are read from input file.");
				k1=strAry1.length; //before deletion
				strAry1=StringAryUtil.deleteStrAry2fromUniqueSortedStrAry1(strAry1, strAry2);
				k2=k1-strAry1.length;
				System.out.println(k2+" elements are deleted from main sorted array");
				break;
			case 13:
				System.out.println("Caution: Main array of records should be unique and sorted");
				System.out.print("Enter name of input file which has records to be marked in main set of records: ");
				strAry2=FileUtil.fillstrAryFromFileSkipBlankLines(stdin.readLine());
				strAry2=StringAryUtil.trimStringAry(strAry2);
				System.out.println(strAry2.length+" records are read from input file.");
				System.out.print("Enter Mark To Be Pre-appended : ");
				str1=stdin.readLine();
				k1=strAry1.length; //before marking
				strAry1=StringAryUtil.markStrAry2InUniqueSortedStrAry1(strAry1,strAry2,str1);
				System.out.println(strAry2.length+" records are marked.");
				k2=k1-strAry1.length;
				System.out.println(k2+" elements are marked in main sorted array");
				break;
			case 14:
				System.out.println("Records marked with given string would be deleted");	
				System.out.print("Enter the string: ");
				str1=stdin.readLine();
				k1=strAry1.length; //before deleting
				strAry1=StringAryUtil.removeLinesofStrFromStrAry(str1,strAry1);	
				k2=k1-strAry1.length; // after deleting	
				System.out.println(k2+" marked records are deleted");
				break;
		}
		mainMenu();					
	}    
    public static void main(String[] args) throws IOException {    	
       mainMenu(); 
        /*  	
       	String[] strAry={"Aa","Bb", "Cc"};
       	StringAryUtil.printlnStringAry(strAry);
       	strAry=new String[3];
       	StringAryUtil.printlnStringAry(strAry);
       	*/
    }    
    
}