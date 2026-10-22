class RecursionTest2{
  public static void main(String [] s){
     myMethod(2);
  }
  public static void myMethod(int n){
     if(n>0){
       myMethod(n-1);
       System.out.println("ICS");
       myMethod(n-1);
       System.out.println("COE");
     }
  }
}
