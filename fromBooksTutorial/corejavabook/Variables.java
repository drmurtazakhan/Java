public class Variables
{  public static void main(String[] args)
   {  String greeting[] = new String[1];
      greeting[0] = "Variables Check";
      int i=0;
      double x=9.997,y=9.9;
      boolean check,a=true,b=false;
      System.out.println(greeting[i]);
      int nx=(int)x; // type casting
      int round_x=(int)Math.round(x); // round off
      System.out.println("x="+x);
      System.out.println("y="+y);
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("Type casting x to integer nx="+nx);
      System.out.println("round_x="+round_x);
      check=(x>y);
      System.out.println("check x>y is "+check);
      check=a&&b;
      System.out.println("check a AND b is "+check);
      check=a||b;
      System.out.println("check a OR is "+check);
      
      
   }
}
      
      
      
