class SuperclassA
{
	int a=45;
	{
		System.out.println("Instance initializer block in SuperclassA "+a);
	}
	public SuperclassA( )						// (1)
	{
		System.out.println("Constructor in SuperclassA");
    }
}
class SubclassB extends SuperclassA
{
	public SubclassB()                          // (2)
	{
        this(3);
        System.out.println("Default constructor in SubclassB");
    }
    public SubclassB(int i)                     // (3)
    {
        System.out.println("Non-default constructor in SubclassB");
        value = i;
        //System.out.println(i);
    }
    {                                                      // (4)
        System.out.println("Instance initializer block in SubclassB");
    //  value = 2;                                // (5) Not Ok
    }
    private int value = initializerExpression();  // (6)
    private int initializerExpression()          // (7)
    {
        System.out.println("Instance initializer expression in SubclassB");
        return 1;
    }
}
public class ObjectConstruction2
{
	public static void main(String args[])
	{
        new SubclassB();                          // (8)
    }
}

