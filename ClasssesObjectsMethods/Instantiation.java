class GrandFather{
   int grandy = 70;
   public GrandFather(int grandy){
      this.grandy = grandy;
      System.out.println("Grandy: "+grandy);
   }
}

class Father extends GrandFather{
   int father = 40;
   public Father(int grandy, int father){
      super(grandy);
      this.father = father;
      System.out.println("Grandy: "+grandy+" Father: "+father);
   }
}

class Son extends Father{
   int son = 10;
   public Son(int grandy, int father, int son){
      super(grandy, father);
	this.son = son;
	System.out.println("Grandy: "+grandy+" Father: "+father+" Son: "+son);
   }
}

public class Instantiation{
   public static void main(String[] args){
      Son s = new Son(65, 35, 5);
   }
}
