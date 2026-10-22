interface Instrument
{
	int i = 2; // static & final
	// Cannot have method definitions:
	void play(); // Automatically abstract and public
	String what();// Automatically abstract and public
	void adjust();// Automatically abstract and public
} 

class Wind implements Instrument
{
	public void play()
	{
	    System.out.println("Wind.play()");
	}
	public String what()
	{ 
	    return "Wind"; 
	}
 	public void adjust()
 	{
	}
} // End of class Wind

class Percussion implements Instrument
{
	public void play()
	{
	    System.out.println("Percussion.play()");
	}
	public String what()
	{ 
	   return "Percussion"; 
	}
	public void adjust()
	{
  	}
} // End of class Percussion


public class TestInstruments
{
	static void tune(Instrument i)
	{
		i.play();
	}
	static void tuneAll(Instrument[] e)
	{
		for(int i = 0; i < e.length; i++)
		tune(e[i]);
	}
	public static void main(String[] args)
	{
	     Instrument[] orchestra = new Instrument[2];
	     int i = 0;
	    // Upcasting during addition to the array:
	     orchestra[0] = new Wind();
	     orchestra[1] = new Percussion();
	     tuneAll(orchestra);
	     Instrument i2 = new Percussion();
	     tune(i2);
	     
	} // End of main() method
} // End of class TestInstruments