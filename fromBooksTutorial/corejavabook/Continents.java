import corejava.*;

public final class Continents
{
   public static final int AISA=1;
   public static final int AFRICA=2;
   public static final int EUROPE=3;
   public static final int SOUTH_AMERICA=1;
   public static final int NORTH_AMERICA=1;
   public static final int AUSTRALIA=1;
   public static final int ANTARCATICA=1;
   
   
   public static void main(String[] args)
   {
   //System.out.println("v="+v);
   }
   public Continents(int v)
   {
   value=v;
   }
   
   public int getValue()
   {
   return value;
   }
   
   public String toString()
   {
   String v;
   
   if (value==ASIA) v="Asia";
   else if(value==AFRICA) v="Africa";
   else if(value==EUROPE) v="Europe";
   else if(value==SOUTH_AMERICA) v="South America";
   else if(value==NORTH_AMERICA) v="Norht America";
   else if (value==AUSTRALIA) v="Australia";
   else v="Antarcatica";
   
   System.out.println("v="+v);
   return v;
   }
   private int value;
}   
