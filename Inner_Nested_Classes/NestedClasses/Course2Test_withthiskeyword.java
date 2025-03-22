import java.util.*;
  class Course2{
     private static double [] grades;
     interface MaxMin{ void bestAndWorst();}
     protected class Pair implements MaxMin{ // Pair is member class
        private double best;
        private double worst;
        public String toString(){
           return "Best grade: "+best+"\nWorst grade: "+worst+"\n";
        }
        public void bestAndWorst(){
           if(Course2.this.grades.length > 0){
             this.best = Course2.this.grades[0]; //Course2.this refers to instance outer class "Course2"
             this.worst = Course2.this.grades[0]; // simple this refers to instance inner class
             for(int i=1; i<grades.length; i++){
                if (best < grades[i]) best = grades[i];
                else if (worst > grades[i]) worst = grades[i];
             }
           }
        }
     }
	Course2(int size){
        grades = new double[size];
        for(int i=0; i<size; i++)
          grades[i] = 100*Math.random();
     }
     public MaxMin getPair(){
        return new Pair();
     }
  }
  
  public class Course2Test_withthiskeyword{
     public static void main(String [] args){
        Course2 c2 = new Course2(10);
        Course2.MaxMin cs = c2.new Pair(); // Pair object is created with ref. of outer class
        cs.bestAndWorst();
        System.out.println(cs);
     }
   }