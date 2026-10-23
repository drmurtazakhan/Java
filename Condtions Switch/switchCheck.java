public class switchCheck
{
	public static void main (String[] args)
	{
		double gpa=2.65;
		switch((int)gpa)
		{
			case 0:
			System.out.println("RED ");
			break;
			case 1:
			System.out.println("red");
			break;
			case 2:
			if (gpa>=2.5)
			System.out.println("GREEN");
			else
			System.out.println("YELLOW");
			break;
			default:
			System.out.println("White");		
		}
	}
}
		