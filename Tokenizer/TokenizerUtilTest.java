import mak2000.Tokenizer.TokenizerUtil;

public class TokenizerUtilTest{
	public static void main(String[ ] args){
		String s1="We	like\n"+
                   "KFUPM\n"+
                   "very\tmuch";
        
        System.out.println(s1);           
        System.out.println("----------------------");
        
        String s2=TokenizerUtil.getStrFromTokToEndwithDlim(s1,2); 
        System.out.println(s2); 
        System.out.println("----------------------");
        
        String s3=TokenizerUtil.getStrFromTokToEndwithDlim(s1,3); 
        System.out.println(s3);                  
        System.out.println("----------------------");         
                   
	}
}