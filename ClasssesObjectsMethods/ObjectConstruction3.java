public class ObjectConstruction3
{
	public static void main(String args[])
	{
        new SubclassB();
    }
}
class SubclassB extends SuperclassA
{
	public SubclassB()
	{
        
        System.out.println("yellow");
    }    
}
class SuperclassA
{
	String s="white";
	{
		System.out.println(s);
	}
	public SuperclassA( )
	{
		this("green");
		System.out.println("blue");
    }
    public SuperclassA(String s )
	{
		System.out.println(s);
    }
}



