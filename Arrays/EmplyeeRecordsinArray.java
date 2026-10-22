import java.util.*;
import java.io.*;
class EmplyeeRecordsinArray{
	public static void main(String []args) throws IOException
	{
	   StringTokenizer z;
	   BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
       char cont;
       int count=0;
       String[] name=new String[100];
       double[] salary =new double[100];
       int[] code=new int[100];
       double[] bonus=new double[100];
       
       do{
		System.out.print("Please enter the employee name:");
		name[count]=stdin.readLine();
		System.out.print("Please enter the employee salary:");
		salary[count]=Double.parseDouble(stdin.readLine());
		System.out.print("Please enter the employee status code"+
		                 "(1=married, 2=single, 3=married with):");
		code[count]=Integer.parseInt(stdin.readLine());
		switch(code[count]){
		case 1:	
		   bonus[count]=0.05*salary[count];
		   break;
		case 2:
		   bonus[count]=0.08*salary[count];
		   break;
		case 3:
		   bonus[count]=0.12*salary[count];
		}        
		count++;
		System.out.print("Do you want to continue?");
		InputStreamReader r = new InputStreamReader(System.in);
		cont = (char) r.read();
	  } while(cont=='y'||cont=='Y');
	  
	
	for(int i=0; i<count; i++)
	  System.out.println(name[i]+"\t"+salary[i]+"\t"+code[i]+"\t"+bonus[i]);
	
	}
}
