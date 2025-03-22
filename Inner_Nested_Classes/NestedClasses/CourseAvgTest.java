import java.util.*;
  class Course1{
     private static double [] grades;
     interface Average{ double average();}
     static class Pair implements Average{        
        public double average(){
             double sum=0.0;
             for(int i=1; i<grades.length; i++){
                sum=sum+grades[i];
             }
        	return sum/grades.length;   
        }
     }
	Course1(int size){
        grades = new double[size];
        for(int i=0; i<size; i++)
          grades[i] = 100*Math.random();
     }
     public Average getPair(){
        return new Pair();
     }
  }
  
  public class CourseAvgTest{
     public static void main(String [] args){
        Course1 c1 = new Course1(10);
        Course1.Average cs = new Course1.Pair(); // Pair object is created by with class name outer class        
        System.out.println(cs.average());
     }
  }