import java.util.*;
public class ReplaceStringInLine
{
	
	public static void main(String args[])
	{
		String line="ICS 102 is prerequisite of ICS            201";
		System.out.println(line);
		String oldStr="ICS";
		String newStr="ICS-";
		System.out.println(replaceString(line,oldStr,newStr));
	}
	public static String replaceString(String line,String strOld, String strNew)
	{
		int i = line.indexOf(strOld);	
		String lineNew="";
		String token="";
		
		StringTokenizer strTok = new StringTokenizer(line);		
		
		while (strTok.hasMoreTokens())
		{
			token=strTok.nextToken();
			if (token.equals(strOld))
			lineNew=lineNew+strNew+" ";
			else
			lineNew=lineNew+token+" ";
		}
		return lineNew;	
	}
}