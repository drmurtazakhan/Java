 class Course5{
    int x = 7;
    public Course5(){
       System.out.println("Course5 constructor.");
    }
    protected class Pair {
        public Pair(){
          System.out.println("Course5.Pair constructor.");
        }
    }
 }
 class ExtendingMemberClass extends Course5.Pair{
    public ExtendingMemberClass(Course5 c5){
       c5.super();
       System.out.println("ExtendingMemberClass constructor.");
       System.out.println(c5.x);
    }
    public static void main(String [] args){
       Course5 c5 = new Course5();
       //Course5 c5 = new Course5().new Pair();
       new ExtendingMemberClass(c5);
    }
 }
