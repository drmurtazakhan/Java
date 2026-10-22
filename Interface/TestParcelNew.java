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
	
	// Modified ship() method
	public void ship(String dest)
	{
		Contents c = cont();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	} // End of method ship()

     
     // to(): New method added to Parcel class
     public Destination to(String s)
     {
     	return new Destination(s);
     }
     
     // cont(): New method added to Parcel class
     public Contents cont()
     {
     	return new Contents();
     } // End of method cont()
}  // End of Outer class Parcel

public class TestParcelNew
{
	// Modified main() method
	public static void main(String[] args)
	{
		Parcel p = new Parcel();
		p.ship("Algeria");
		Parcel q = new Parcel();
		// Defining references to inner classes
		Parcel.Contents c = q.cont();
		Parcel.Destination d = q.to("Saudi Arabia");
		System.out.println(d.readLabel());
	} // End of method main()

}  // End of TestParcel class

