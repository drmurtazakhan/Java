public class NestedForLoop {
	public static void main(String[] args) {
		
		int i,j;
		int c=0;
		
		for (i=0; i<3; i++) {
		   for (j=0; j<4; j++) 
		   {
	   	     System.out.print("("+i+","+j+")"+"\t"); 
	   	     c++;
	   	   }
	       System.out.println();	  
		}
		System.out.println("--------------");	  
		System.out.println(c);	  
		
	}
}
