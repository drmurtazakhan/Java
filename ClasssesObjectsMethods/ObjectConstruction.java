class SuperclassA
{
	
	public SuperclassA( )						// (1)
	{
		System.out.println("Constructor in SuperclassA");
    }
    private int x=2; 
	
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
        System.out.println(i);
    }
    
    private int value = initializerExpression();  // (6)
    
    {                                                      // (4)
        System.out.println("Instance initializer block in SubclassB");
      value = 2;                                // (5) Not Ok
	}
    
    private int initializerExpression()          // (7)
    {
        System.out.println("Instance initializer expression in SubclassB");
        return 1;
    }
        
}
public class ObjectConstruction
{
	public static void main(String args[])
	{
        new SubclassB();
        //SubclassB obj = new SubclassB();						// (1);                          // (8)
                                 // (8)
    }
}

