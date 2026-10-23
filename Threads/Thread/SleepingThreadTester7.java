class ThreadClass1 extends Thread {
  public void run() {
  	for (int i=0; i<2; i++)
  	System.out.println("red");    
  }
}
class ThreadClass2 extends Thread {
private int c2=0;		
  public void run() {
  	for (int j=0; j<3; j++){
  		System.out.println("green");    
  		new ThreadClass1().start();
  	}
  }
}
public class SleepingThreadTester7{
	public static void main(String[] args){
		new ThreadClass2().start();  	
	}
}

