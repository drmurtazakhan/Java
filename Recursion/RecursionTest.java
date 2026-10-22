class RecursionTest{
  public static void main(String [] s){
     myMethod(3);
  }
  public static void myMethod(int n){
     if(n>0){
       System.out.println("MIS Shabab");
       myMethod(n-1);
       System.out.println("ICS Shabab");
       myMethod(n-1);
     }
  }
}
