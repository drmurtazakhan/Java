import java.io.* ;
import java.text.* ;

class Car
{
	private float fuelTankCapacity ;
	private float kilometerPerLiter ;
	private float distance ;
	
	Car(float kpl , float l )
	{
		kilometerPerLiter = kpl ;
		fuelTankCapacity = l ;
	}
	
	public void distance(float k , float l1)
	{
		distance = k * l1 ;
	}
		
	public float getdistance()
	{
		return distance ;
	}
	
	public float getkilometerPerLiter()
	{
		return kilometerPerLiter ;
	}
}
class Fuel
{
	private float petrolPricePerLiter ;
	
	Fuel(float pppl)
	{
		petrolPricePerLiter = pppl ;
	}
	
	public float getpetrolPricePerLiter()
	{
		return petrolPricePerLiter ;
	}
	
	public void setpetrolPricePerLiter(float newpetrolPricePerLiter)
	{
		petrolPricePerLiter = newpetrolPricePerLiter ;
	}
}
public class CarTest2
{
	public static void main(String[] args)
	{
		BufferedReader cf = new BufferedReader(new InputStreamReader (System.in));
		
		
		
		try
		{
			NumberFormat formater = NumberFormat.getNumberInstance();
		formater.setMaximumFractionDigits(4);
		formater.setMinimumFractionDigits(4);
			
			System.out.println("Enter the FuelTankCapacity : ");
			float l2=Float.parseFloat(cf.readLine().trim());
			
			System.out.println("Enter the KilometerPerLiter : ");
			float kpl2=Float.parseFloat(cf.readLine().trim());
			
			System.out.println("Enter the PetrolPricePerLiter : ");
			float pppl2=Float.parseFloat(cf.readLine().trim());
			
			Car distance2 = new Car(kpl2 , l2);
			Fuel f2 = new Fuel(pppl2);
			
			float p = f2.getpetrolPricePerLiter() * l2 ;
			
			System.out.println("Enter the Numder of Fuel Tanks : ");
			float t=Float.parseFloat(cf.readLine().trim());
			distance2.distance(kpl2,l2);
			float d = distance2.getdistance() * t ;
			
			float fd2=distance2.getdistance();
			System.out.println("The Distance is : "+formater.format(fd2)+" Kilometers");
			System.out.println("The Cost of the Fuel is : "+formater.format(p)+" Saudi Riyals");
			System.out.println("The Total Distance is : "+formater.format(d)+" Kilometers");
			
			
		}
		catch(IOException e)
		{
		 	System.out.println("There is an I/O error ");
		}
		
	}
}
