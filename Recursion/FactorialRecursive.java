// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ


class FactorialRecursive{
  public static void main(String [] s){
     factorial(5);
  }
  public static int factorial(int n){
  	int x,y;
  	System.out.println(n);	
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
