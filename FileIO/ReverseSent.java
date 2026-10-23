import java.util.StringTokenizer;

class ReverseSent {
	
	String sentence;
	
	public ReverseSent (String sentence) {
		this.sentence = sentence;
	}
	
	void reverse(){
		StringTokenizer stok = new StringTokenizer(sentence, " .;,!:?", true);
		String newString = "";
		while(stok.hasMoreTokens()){
			newString += (new StringBuffer(stok.nextToken())).reverse();
		}
		
		sentence = newString;
	}
	public String toString(){
		return sentence;
	}
	
	public static void main(String args[]) {
		ReverseSent reverseSent = new ReverseSent("I said to him: Go ye, now!");
		System.out.println("Input : " + reverseSent);
		reverseSent.reverse();
		System.out.println("Output: " + reverseSent);

	}
}
