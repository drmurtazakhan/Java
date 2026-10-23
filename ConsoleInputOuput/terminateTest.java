import java.io.*;
public class terminateTest
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		String str;
		do
		{
			System.out.print("Enter String: ");
			str=stdin.readLine();
		}
		while(!(str.equalsIgnoreCase("exit")));
	}
}