public class StringMatch2
{
	
	public static void main(String args[])
	{
		String s="FABjD";
		String t="jD";
		int k= s.length();
		
		int j=find(s,t);
		System.out.println("j is"+j);
		System.out.println(s);
		
		
		
		if (j==-1)
		System.out.println(j);	
		else
		System.out.println(k-j);
		
		
		
	}
	public static int find(String s, String t)
	{
		
		//String f;
		if ( t.length() > s.length()) 
		return -1;
		else
		{
			if(t.equals(s.substring(0,t.length())))
			{;}
			else
			{
				s=s.substring(s.length()-(s.length()-1));
				System.out.println(s);
				System.out.println("length of s in method "+s.length());
				find(s,t);
			
			}
			int l=s.length();
			return  l;
		}
		
	}
}