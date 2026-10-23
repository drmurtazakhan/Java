/** 
 * @author Dr. Murtaza Khan 
 */

import java.io.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RemoveNonNumericCharacters {
	
    
    public static void main(String[] args) {   	
    	
		String str1 = "a91.674tyz.377x";
		
		String str2 = str1.replaceAll("[^\\d.]", "");  // keep .
		String str3 = str1.replaceAll("[^\\d]", "");  
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
				    	
    }
}
    
