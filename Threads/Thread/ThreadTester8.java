class ThreadClass1 extends Thread {
  public void run() {
  	for (int i=0; i<2; i++)
  	ThreadTester8.count++;
  }
}
class ThreadClass2 extends Thread {
private int c2=0;		
  public void run() {
  	for (int j=0; j<3; j++){
  		ThreadTester8.count++;
  		new ThreadClass1().start();
  	}
  	System.out.println(ThreadTester8.count);
  }
}
public class ThreadTester8{
	public static int count=0;
	public static void main(String[] args){
		new ThreadClass2().start();  	
		
	}
}

