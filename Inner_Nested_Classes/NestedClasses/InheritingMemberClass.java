class Course4{
     public Course4(){
        System.out.println("Course4 constructor.");
     }
     protected class Pair {
         public Pair(){
           System.out.println("Course4.Pair constructor.");
         }
         void f(){
           System.out.println("Method f() From Course4.Pair.");
         }
      }
  }
  class InheritingMemberClass extends Course4{
     public InheritingMemberClass(){
        System.out.println("InheritingMemberClass constructor.");
        new Pair().f();
     }
     public static void main(String [] args){
        new InheritingMemberClass().new Pair();
     }
  }
