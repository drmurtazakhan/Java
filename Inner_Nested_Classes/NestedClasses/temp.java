protected class Pair implements MaxMin{
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
   public class Course2Test{
     public static void main(String [] args){
        Course2 c2 = new Course2(10);
        Course2.MaxMin cs = c2.new Pair();
        cs.bestAndWorst();
        System.out.println(cs);
     }
   }
