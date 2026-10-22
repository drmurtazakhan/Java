class People
{	private String name;
	public People(String n)
	{	name = n;
	}
	public static void m1(People[] pp)
	{	for (int i=0; i<pp.length-1 ; i++)
    	for (int j=i+1; j<pp.length; j++)
    	{	if ( (pp[j].name.compareTo(pp[i].name)) >0 )
    		{	People d= pp[i];
    			pp[i]=pp[j];
    			pp[j]=d;
    		}
    	}
	}
	public String toString()
	{		return name;
	}
}
public class ArrayBubbleSort
{   public static void main(String[ ] args)
    {  People[] p = new People[5];
    	p[0]= new People("Khalid");
    	p[1]= new People("Hashim");
    	p[2]= new People("Nasir");
    	p[3]= new People("Majed");
    	p[4]= new People("Abdullah");
    	People.m1(p);
    	for (int i=0; i<p.length ; i++)
    	System.out.println(p[i]);
    	
    }
}