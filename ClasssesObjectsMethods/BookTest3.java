import java.io.*;
public class PurchaseTest
{	
	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Title of book: ");
		String title=stdin.readLine();
		
		System.out.print("Enter Author of book: ");
		String author=stdin.readLine();
		
		System.out.print("Enter Price of book: ");
		double price=Double.parseDouble(stdin.readLine());
		
		Book2 b1= new Book2(title, author, price);
		b1.displayRecord();		
		
	
	}
}
class Book2
{
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	
	public Book2(String title, String author, double price)
	{
		bookTitle=title;
		bookAuthor=author;
		bookPrice=price;
	}
	
	
	
	public double computeDiscount()
	{
		double discount;
		if (bookPrice>=500)
		discount=bookPrice *(20.0/100.0);
		else if (bookPrice>=300)
		discount=bookPrice *(15.0/100.0);
		else if (bookPrice>=200)
		discount=bookPrice *(10.0/100.0);
		else if (bookPrice>=100)
		discount=bookPrice *(5.0/100.0);
		else 
		discount=0;
		return discount;
	}
	
	public double computeNetPrice()
	{
		double netPrice=bookPrice-computeDiscount();
		return netPrice;
	}
			
	public void displayRecord()
	{
		System.out.println("_____________________________________");
		System.out.println("Title :"+bookTitle);
		System.out.println("Author :"+bookAuthor);
		System.out.println("Price :"+bookPrice+ " SR");
		System.out.println("Discount :"+computeDiscount()+ " SR");
		System.out.println("Net Price :"+computeNetPrice()+ " SR");
		System.out.println("_____________________________________");
	}
}

