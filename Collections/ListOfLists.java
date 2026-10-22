import java.util.ArrayList;
 class ListOfLists{
     public static void main(String s[]){
        ArrayList kfupm=new ArrayList();
        ArrayList ics=new ArrayList();
        ArrayList coe=new ArrayList();
        ArrayList mis=new ArrayList();
        String[] icsBasics={"ics102", "ics103", "ics201", "ics202"};
        String[] coeBasics={"coe200", "ics102", "ics201", "ics202"};
       String[] misBasics={"mis105", "mis345", "mis301", "ics201"};
       for (int i=0; i<icsBasics.length; i++) {
          ics.add(icsBasics[i]);
          coe.add(coeBasics[i]);
          mis.add(misBasics[i]);
       }
       kfupm.add(ics);
       kfupm.add(coe);
       kfupm.add(mis);
       System.out.println(kfupm);
    }
 }
