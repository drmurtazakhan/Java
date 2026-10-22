class Parcel
{
	class Contents
	{
		private int i = 11;
		public int value()
		{
			return i;
		}
	} // End of inner class Contents
	
	class Destination
	{
		private String label;
		Destination(String whereTo)
		{
			label = whereTo;
		}  // End of Destination constructor
		String readLabel()
		{
			return label;
		} // End of method readLabel()
	} // End of inner class Destination
     
     public void ship(String dest)
     {
     	Contents c = new Contents();
     	Destination d = new Destination(dest);
     	System.out.println(d.readLabel());
     } // End of method ship()
}  // End of Outer class Parcel

public class TestParcel
{
	public static void main(String[] args)
	{
		Parcel p = new Parcel();
		p.ship("Algeria");
    }  // End of method main()
}  // End of TestParcel class

