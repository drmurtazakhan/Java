class Stu
{
	private String name;
	private double gpa ;
	
	public Stu()
	{
		name="No Name";
		gpa=4.0;
	}
		
	public void print()
	{
		System.out.println(name);
		System.out.println(gpa);
	}
}
public class StuTest
{
    public static void main(String[ ] args)
    {
    	Stu s1 = new Stu();
    	s1.print();
    	RA r1 =new RA();
    	r1.print();
    	    	
    }
}

class RA extends Stu
{
	private double workLoad;
	public void print()
	{
		super.print();
		System.out.println(workLoad);
		//System.out.println(name); error
	} 
}
