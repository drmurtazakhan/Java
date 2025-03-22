import java.util.*;
  class Course1{
     private static double [] grades;
     interface MaxMin{ void bestAndWorst();}
     static class Pair implements MaxMin{
        private double best;
        private double worst;
        public String toString(){
           return "Best grade: "+best+"\nWorst grade: "+worst+"\n";
        }
        public void bestAndWorst(){
           if(grades.length > 0){
             best = grades[0];
             worst = grades[0];
             for(int i=1; i<grades.length; i++){
                if (best < grades[i]) best = grades[i];
                else if (worst > grades[i]) worst = grades[i];
             }
           }
        }
     }
	Course1(int size){
        grades = new double[size];
        for(int i=0; i<size; i++)
          grades[i] = 100*Math.random();
     }
     public MaxMin getPair(){
        return new Pair();
     }
  }
  
  public class Course1Test{
     public static void main(String [] args){
        Course1 c1 = new Course1(10);
        Course1.MaxMin cs = new Course1.Pair(); // Pair object is created by with class name outer class
        cs.bestAndWorst();
        System.out.println(cs);
     }
  }