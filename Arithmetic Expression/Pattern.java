public class Pattern {
	public static void main(String [] args) 
	{   
		int i=1, j;
		while(i<=10)
		{
			j=1;
			while(j<=20)
			{
				if((i+j)%2 == 0) // check for odd number to print ><><....
					System.out.print(">");
				else
					System.out.print("<");
				j++;	
			}
			i++;
			System.out.println();
		}
	}
}