class ASCIICodes
{	public static void main(String [] s)
	{	String a[]={"ias","ae","ce","chem","cem","ee","fin","ics"};		
		for (int i=0; i<a.length; i++)
		{	int x=getCode(a[i]);
			int y=x%13;
			System.out.println(a[i]+"-->"+x+"-->"+y);
		}
	}
	
	public static int getCode(String s)
	{	int code=0;
		for (int i=0; i<s.length(); i++)
		{	code=code+(int)s.charAt(i);
		}
		return code;
	}
}
