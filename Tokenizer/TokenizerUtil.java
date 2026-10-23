package mak2000.Tokenizer; 
import java.io.*;
import java.util.*;

public class TokenizerUtil {
	
	/**
	 * get string from specified token index to end of String
	 * delimiter are also treated as tokens
	 */
	public static String getStrFromTokToEndwithDlim(String str1,int from){
		
		String str2="";
		//String tok="";
     	StringTokenizer strTok = new StringTokenizer (str1," \t\n\r\f",true);
     	int k=0;
     	while( strTok.hasMoreTokens( ) )
     	{
     		k=k+1;
     		if (k<from)
     			strTok.nextToken( );
     		else{
     			str2=str2+strTok.nextToken( );
     		}
     			
     		
     	}
		return str2;
	}
}

