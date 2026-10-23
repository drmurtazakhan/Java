class ShortCircuitTest1
{
	public static void main(String[]args) 
	{
		int a=4;
		int b=3;  			
		int c=5;	
		if ((a > b) || (c > b++))
	 	 System.out.println("b="+b);	 	 
 	
		if ((a > b) | (c > b++))
	 	 System.out.println("b="+b);	 	 
	}
}
