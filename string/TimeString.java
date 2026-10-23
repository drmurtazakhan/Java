import TextIO;
public class TimeString
{
	static TextIO stdin = new TextIO(System.in);
	public static void main(String[] args) throws java.io.IOException
	{
		
		System.out.print("Enter Time: ");
		String timeString = stdin.readString();
		double timeDouble = Double.parseDouble(timeString);
		
		System.out.println("Time: " + timeString);
		System.out.println("Time: " + timeDouble);
	}
}