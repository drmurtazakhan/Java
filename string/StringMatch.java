public class StringMatch
{
	//static int i=0;
	public static void main(String args[])
	{
		String s="FABjD";
		String t="L";
		System.out.println(find (s,t));
	}
	public static int find(String s, String t)
	{
		int i=0;
		if (i <= s.length() - t.length()) {
			
		//if (i+t.length() > s.length() )
		//	return -1;
		//else
		//{	
		if ( ( t.equals(s.substring(i,t.length()+i) )) )
			//return i;	
			{ }		
		else {
				i=i+1;				
				find(s,t); 
				}
		return i;
				
				
		}
	}
}