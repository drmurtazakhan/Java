class Course3{
    public Course3(){
       System.out.println("Course3 constructor.");
       new Pair().f();
    }
    protected class Pair {
        public Pair(){
          System.out.println("Course3.Pair constructor.");
        } 
        void f(){
          System.out.println("Method f() From Course3.Pair.");
        } 
     }
 }
 class OverridingMemberClass extends Course3{
    public OverridingMemberClass(){
       System.out.println("OverridingMemberClass constructor.");
       //new Pair().f();
       new Course3().new Pair().f();
    }
    protected class Pair {
        public Pair(){
          System.out.println("OverridingMemberClass.Pair constructor."); 
        }
        void f(){
           System.out.println("OverridingMemberClass.Pair Method f().");
        } 
    }
    public static void main(String [] args){
       new OverridingMemberClass();
    }
 }
