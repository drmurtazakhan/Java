public class StringTester2
{
	
	public static void main(String args[])
	{
		String s1="A";
		String s2="a";
		System.out.println( s1.concat(s2) );
		System.out.println( s1.concat(" B C") );
		System.out.println( "C B ".concat(s1) );
		String s3=" a b c ";
		System.out.println( s3.trim() );
		
		String[] strAry=new String[5];
		for (int i=0; i<strAry.length; i++){
			System.out.println(strAry[i]);
		}
				
	}	
	
}