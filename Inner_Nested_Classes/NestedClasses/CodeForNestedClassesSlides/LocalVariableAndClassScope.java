class LocalVariableAndClassScope{
     interface Doubler{int twice();} // implicitly a static member
     public static void main(String [] args){
       Doubler [] allEven = new Doubler[10];
       for(int i=0; i<allEven.length; i++){
          final int value = i;
          class MyDoubler implements Doubler{
             public int twice(){
                return 2*value;
             }
          }
          allEven[i] = new MyDoubler();
       }
       for(int i=0; i<allEven.length; i++)
          System.out.print(" "+allEven[i].twice());
       System.out.println();
     }
}

