import java.util.StringTokenizer;
public class ItemTest
{	public static void main(String[] args)
	{
		Item i1= new Item("Printer", 200);
		Item i2= new Item("Scanner", 300);
		i1.discount();
		i2.discount(10);
		System.out.println(i1);
		System.out.println("--------------------------------");
		System.out.println(i2);		
	}
}
class Item
{	private String itemName;
	private double itemPrice;	
	private double discount;	
	public Item(String itemN, double itemP) //constructor
	{
		itemName=itemN;
		itemPrice=itemP;
		
	}
	public double discount()
	{	discount=itemPrice*5.0/100;
		return discount;
	}
	public double discount(double percentage)
	{	discount=itemPrice*percentage/100;
		return discount;
	}
	public double netPrice()
	{
		return itemPrice-discount;
	}
	public String toString()
	{
		 return
		"Item Name :"+itemName+"\n"+
		"item Price :"+itemPrice+"\n"+
		"Discount :"+discount+"\n"+
		"Net Price :"+netPrice();		
	}
	
	
}