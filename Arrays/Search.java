import java.io.*;
public class Search{
	public static void main(String args []) throws IOException {
		int [] a = {12,56,34,26,79,83,51,98,26,46};
		int choice, target;
		boolean found;
	BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
		do {
		System.out.println("1. Search");	
		System.out.println("2. Sum");	
		System.out.println("3. Exit");	
		System.out.println();	
		System.out.print("Enter the choice : ");	
		choice = Integer.parseInt(stdin.readLine());
		switch(choice) {
			case 1:  do {
					System.out.print("Enter the target number [10-99]: ");
					target = Integer.parseInt(stdin.readLine());
				   }while(target <10 || target>99);
				   found = false;
				 for(int i=0;i<10;i++)
				 	if(target == a[i])
				 		found = true;
				 if(found)
				 	System.out.println("The target found in Array");
				 else
				 	System.out.println("The target not found in Array");
					 break;
			case 2:
					 int sum=0;
					 for(int i=0;i<10;i++)
					 	sum+=a[i];
				 System.out.println("Sum of all numbers in array is: "+sum);
					 break;
			case 3:
					 System.out.println("Program Exiting...");
					 break;
			default:
					 System.out.println("Invalid Choice");
		}
		}while(choice !=3);
	}
}
