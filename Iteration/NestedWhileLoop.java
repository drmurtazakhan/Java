public class NestedWhileLoop
{	public static void main(String[] args)
	{	int i=1,j;
		while(i<=3)
		{	j=1;
			while(j<=4)
			{	System.out.print(i+","+j+"\t"); 
				j++; 
			}
			System.out.println();
			 i++;		  
		}
	}
}