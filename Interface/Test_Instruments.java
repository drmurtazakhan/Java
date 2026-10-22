interface Instrument {
int i = 2; // static & final
// Cannot have method definitions:
void play(); // Automatically abstract and public
String what();// Automatically abstract and public
} 

class Wind implements Instrument {
	public void play() {
	    System.out.println("Wind.play()");
	}
	public String what() { 
             return "Wind"; 
	} 	
} // End of class Wind
class Percussion implements Instrument {
	public void play() {
	    System.out.println("Percussion.play()");
	}
	public String what() { 
	   return "Percussion"; 
	}
	
} // End of class Percussion

public class Test_Instruments {
	public static void main(String[] args) {
	     Instrument[] orchestra = new Instrument[2];
	     
	     // Upcasting during addition to the array:
	     orchestra[0] = new Wind();
	     orchestra[1] = new Percussion();	     
	     for (int i=0; i<orchestra.length ; i++)
	     { 
			 System.out.println( orchestra[i].what() );
			 orchestra[i].play();
		 }	     
	} // End of main() method
} // End of class TestInstruments