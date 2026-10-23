public class Table
{
	public static void main (String[] args)
	{
		final int COLUMN_WIDTH=7;
		boolean done;
		int j=1;
		//System.out.println(done);
	
		for (int x=1; x<=10; x++)
		{
			for (int y=1; y<=5; y++)
			{
				int p = (int)Math.pow(x,y);
				String pstr = ""+p;  
				while (pstr.length() < COLUMN_WIDTH)
				pstr=" "+pstr; // right justified
				System.out.print(pstr);
			}
			System.out.println(); // outer loop			
		}
		
		//String test="ab";
		//System.out.print("11111111"+"\t"+test);
	}
}

	