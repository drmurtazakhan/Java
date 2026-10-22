import java.util.*;
  class Course4{
     private static double [] grades;
     interface MaxMin{ void bestAndWorst();}
     public class Pair implements MaxMin{
        private double best;
        private double worst;
        public String toString(){
           return "Best grade: "+this.best+"\nWorst grade: "+this.worst+"\n";
       }
       public void bestAndWorst(){
          if(Course4.this.grades.length > 0){
            this.best = Course4.this.grades[0];
            this.worst = Course4.this.grades[0];
            for(int i=1; i<Course4.this.grades.length; i++){
               if (this.best < Course4.this.grades[i]) this.best = Course4.this.grades[i];
               else if (this.worst > Course4.this.grades[i]) this.worst = Course4.this.grades[i];
            }
          }
       }
    }
   Course4(int size){
       Course4.this.grades = new double[size];
       for(int i=0; i<size; i++)
         Course4.this.grades[i] = 100*Math.random();
    }
    public MaxMin getPair(){
       return new Pair();
    }
 }
 public class Course4Test{
    public static void main(String [] args){
       Course4 c2 = new Course4(10);
       Course4.MaxMin cs = c2.new Pair();
       cs.bestAndWorst();
       System.out.println(cs);
    }
 }
