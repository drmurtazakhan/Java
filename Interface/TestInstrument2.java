interface Instrument1{
// Cannot have method definitions:
void play(); // Automatically abstract and public
} 

interface Instrument2 extends Instrument1 {
String what();// Automatically abstract and public
}

class Wind implements Instrument1 {
	public void play() {
	    System.out.println("Wind.play()");
	}
} // End of class Wind

class Percussion implements Instrument2 {
	public void play() {
	    System.out.println("Percussion.play()");
	}
	
	public String what() { 
	   return "Percussion"; 
	}
} // End of class Percussion


public class TestInstrument2 {
	
	public static void main(String[] args) {
	
	     Instrument1 a = new Wind();
	     Instrument2 b= new Percussion();
	     a.play();
	     b.play();
	} // End of main() method
} // End of class TestInstruments