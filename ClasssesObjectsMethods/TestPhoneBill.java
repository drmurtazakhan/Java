import java.io.*;
import java.text.*;
class PhoneBill 
{	
	private String name;
	private int phoneNo;
	private int monthlyNoOfCalls;
	private static final int monthlyFee=500;
			
	public PhoneBill(String hisName, int hisPhoneNo, int hisMonhtlyNoOfCalls)
	{
		name= hisName;
		phoneNo=hisPhoneNo;
		monthlyNoOfCalls=hisMonhtlyNoOfCalls;
	}
	
	public double computeBill()
	{
		double callCharges;
		if (monthlyNoOfCalls>=1000)
		callCharges=2.5*monthlyNoOfCalls;
		else if (monthlyNoOfCalls>=500)
		callCharges=2*monthlyNoOfCalls;
		else if (monthlyNoOfCalls>=200)
		callCharges=1.5*monthlyNoOfCalls;
		else
		callCharges=1.0*monthlyNoOfCalls;
		
		return (callCharges+monthlyFee);
	}	
}
public class TestPhoneBill
{
	public static void main(String[] args) throws IOException
	{
		NumberFormat formater = NumberFormat.getNumberInstance();
	    formater.setMaximumFractionDigits(2);
	    formater.setMinimumFractionDigits(2);		
	    
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Name of Phone Owner: ");
		String name=stdin.readLine();
		
		System.out.print("Enter Phone Number : ");
		int number =Integer.parseInt(stdin.readLine());
		
		System.out.print("Enter Number of Calls per month : ");
		int callCount=Integer.parseInt(stdin.readLine());
		
		PhoneBill person1 =new PhoneBill(name,number,callCount); // object
				
	   System.out.println("Montly Bill of Mr. "+name+" is "+formater.format(person1.computeBill())+" SR");
	}
}

 
