public class CompareTest
{
	public static void main (String[] args)
	{
		String s1="hell";
		String s2="helo";
		int num=s2.compareTo(s1);
		if (num>0)
		{
			System.out.println("s2 is "+num+" ahead in dictionary");
		}				
		String status;
		double passMark=65;
		double studentMark=70;
		status=studentMark>=passMark ? "pass":"fail";
		System.out.println(status);
		if (2+3>4)System.out.println("true");
	}
}

	