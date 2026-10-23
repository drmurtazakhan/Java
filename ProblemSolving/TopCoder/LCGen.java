import java.util.*;

public class LCGen {

	
	//3 2 5 1 7
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		long A=3;
		long B=2;		
		long X=5;		
		long K=1;
		long M=7;
		*/
		
		long[] X = new long[6];
		long A = sc.nextInt();
	    long B = sc.nextInt();
	    X[0] = sc.nextInt();
	    long K = sc.nextInt();
	    long M = sc.nextInt();
			
		
		//X[0]=5;
		
		for (int i=0; i<X.length-1; i++){			
			X[i+1]=(A* X[i]+B)%M;			
		}
		
		for (int i=0; i<X.length-1; i++){
			System.out.println(X[i]);	
		}
		System.out.println();
			
	}
	
	

}