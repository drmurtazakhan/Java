class SuperclassA
{
	int a=45;
	{
		System.out.println(a);
	}
	public SuperclassA( )
	{
		System.out.println("A");
    }
}
class SubclassB extends SuperclassA
{
	public SubclassB()
	{
        
        System.out.println("B");
    }    
}
public class ObjectConstruction4
{
	public static void main(String args[])
	{
        new SubclassB();
    }
}
