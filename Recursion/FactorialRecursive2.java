class FactorialRecursive2{
  public static void main(String [] s){
     factorial(3);
  }
  public static int factorial(int n){
  	int x,y;
  	System.out.println(n);	  	
  	System.out.print(" ");
  	if (n==0){
  		y=1;	  	
  		System.out.println(y);	
  		return 1;
    }
    else{
    	x=n*factorial(n-1);              
    }
    System.out.println(x);	
    return x;    
  }
}
