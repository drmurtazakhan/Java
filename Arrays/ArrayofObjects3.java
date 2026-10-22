class People
{	private String name;
	public People(String n)
	{	name = n;
	}
	public static void m1(People[] pp)
	{	for (int i=0; i<(pp.length-1)/2 ; i++)
		{		People d= pp[i];
    			pp[i]=pp[pp.length-i-1];
    			pp[pp.length-i-1]=d;    		
    	}
	}
	public String toString()
	{		return name;
	}
}
public class ArrayofObjects3
{   public static void main(String[ ] args)
    {  People[] p = new People[5];
    	p[0]= new People("K");
    	p[1]= new People("H");
    	p[2]= new People("N");
    	p[3]= new People("M");
    	p[4]= new People("A");
    	People.m1(p);
    	for (int i=0; i<p.length ; i++)
    	System.out.println(p[i]);    	
    }
}