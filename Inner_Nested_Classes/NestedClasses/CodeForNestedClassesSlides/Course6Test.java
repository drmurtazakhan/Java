import java.util.*;
  class Course6{
     private static double [] grades;
     interface MaxMin{ void bestAndWorst();}
     Course6(int size){
        grades = new double[size];
        for(int i=0; i<size; i++)
          grades[i] = 100*Math.random();
     }
     public MaxMin getPair(){
        class Pair implements MaxMin{
           private double best;
           private double worst;
           public String toString(){
              return "Best grade: "+this.best+"\nWorst grade: "+this.worst+"\n";
          }
          public void bestAndWorst(){
             if(grades.length > 0){
               best = grades[0];
               worst= grades[0];
               for(int i=1; i<grades.length; i++){
                  if (this.best < grades[i]) best = grades[i];
                  else if (worst > grades[i]) worst = grades[i];
               }
             }
          }
       }
       return new Pair();
     }
 }
 public class Course6Test{
    public static void main(String [] args){
       Course6 c6 = new Course6(10);
       Course6.MaxMin cs = c6.getPair();
       cs.bestAndWorst();
       System.out.println(cs);
    }
 }
