public abstract class AbstractGenerator implements Generator{
   protected int current; // last generated value saved

   // provide constructors
   public abstract void next();
   private int initial;
   public AbstractGenerator(int current){
   	this.current=current;
   	initial=current;
   }   

   public int get(){
    // returns the current value of the sequence
    return current;
   }
   public void reset(){
    current=initial;
   }
   
   
}

