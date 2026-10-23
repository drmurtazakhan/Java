import java.util.StringTokenizer;

public class ReverseSentence {
	
	public static String reverseSent(String sentence){
		StringTokenizer stok = new StringTokenizer(sentence, " .;,!:?", true);
		String word = "";
		String revWord = "";
		String rev = "";
		while(stok.hasMoreTokens()){
			word=stok.nextToken();
			if(word.length()>1)
			word=reverseWord(word);
			rev=rev+word;
		}		
		return rev;
	}
	
	public static String reverseWord(String word){
		String r="";
		for (int i=0; i<word.length(); i++)
		r=word.charAt(i)+r;
		return r;
	}
	
	
	public static void main(String args[]) {
		
		String sentence="I said        to him: Go ye, now!";
		System.out.println("Input : " + sentence);
		String rev=reverseSent(sentence);
		System.out.println("Output: " + rev);

	}
}
