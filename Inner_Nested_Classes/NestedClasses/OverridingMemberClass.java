class Course2{
     public Course2(){
        System.out.println("Couse2 constructor.");
        new Pair();
     }
     protected class Pair {
         public Pair(){
           System.out.println("Course2.Pair constructor.");
         } }
  }
  class OverridingMemberClass extends Course2{
     public OverridingMemberClass(){
        System.out.println("OverridingMemberClass constructor.");
     }
     protected class Pair {
      public Pair(){
       System.out.println("OverridingMemberClass.Pair constructor.");
      }
     }
     public static void main(String [] args){
        new OverridingMemberClass();
     }
  }
