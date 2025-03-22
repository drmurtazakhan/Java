class Course2{
     public Course2(){
        System.out.println("Couse2 constructor.");
     }
     protected class Pair {
         public Pair(){
           System.out.println("Pair constructor.");
         }
     }
  }
  class ExtendingMemberClass extends Course2.Pair{
     public ExtendingMemberClass(Course2 c2){
        c2.super();
        System.out.println("ExtendingMemberClass constructor.");
     }
     public static void main(String [] args){
        Course2 c2 = new Course2();
        //Course2 c2 = new Course2().new Pair();
        new ExtendingMemberClass(c2);
     }
  }
