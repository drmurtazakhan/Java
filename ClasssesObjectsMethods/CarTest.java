import java.io.*;
class Car
{
	private double fuelTankCapacity;   // instance variabe
	private double kilometersPerLiter; // instance variabe
	
	public Car(double ftc, double kmpl) // constructor
	{
		fuelTankCapacity=ftc;
		kilometersPerLiter=kmpl;
	}
	
	public double distanceInFullTank() // method to find the distance that a car can 
	{                                  // can travel in one full tank capacity  
		return (fuelTankCapacity*fuelTankCapacity);
	}
	
	public double getKilometersPerLiter()
	{
		return kilometersPerLiter;
	}
}

class Fuel
{
	private double petrolPricePerLiter; // instance variable
	
	public Fuel(double pppl) // constructor
	{
		petrolPricePerLiter=pppl;
	}
	public double getPetrolPricePerLieter() // method to get petrol price per liter
	{
		return petrolPricePerLiter;
	}
	public void setPetrolPricePerLiter(double spppl) // method to set petrol price per liter
	{
		petrolPricePerLiter=spppl;
	}

public class CarTest
{
	public static void main(String args[]) throws IOException
	{
		Car Nissan = new Car (70,8);
	}
	
}
		