class SuperclassA
{
	String s="Ibn Al-Haitham";
	public SuperclassA()
	{
		System.out.println(s);
		System.out.println("Al-Khwarizmi");
	}
	public SuperclassA(String s)
	{
		System.out.println(s);
	}
	
}
class SubclassB extends SuperclassA
{
	public SubclassB()
	{ 
		this("Abbas Ibn Firnas");
		System.out.println("Al-Khwarizmi");
	}    
	public SubclassB(String s)
	{ 
		System.out.println(s);
	}
}
public class MuslimScientists
{
	public static void main(String args[])
	{
		new SuperclassA("Al-Razi");
		new SubclassB();
		
	}
}
