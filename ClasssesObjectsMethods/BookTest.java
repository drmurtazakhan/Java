import java.io.*;
public class BookTest
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
		
		Book b1= new Book(title, author, price);
		b1.displayRecord();		
		
	
	}
}
class Book
{
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	
	public Book(String title, String author, double price)
	{
		bookTitle=title;
		bookAuthor=author;
		bookPrice=price;
	}
	
	
	
	public double computeDiscount()
	{
		double discount;
		if (bookPrice>=100)
		discount=bookPrice *(10.0/100.0);
		else
		discount=bookPrice *(5.0/100.0);
		return discount;
	}
	
	public double computeNetPrice()
	{
		double netPrice=bookPrice-computeDiscount();
		return netPrice;
	}
			
	public void displayRecord()
	{
		System.out.println("Title :"+bookTitle);
		System.out.println("Author :"+bookAuthor);
		System.out.println("Price :"+bookPrice);
		System.out.println("Discount :"+computeDiscount());
		System.out.println("Net Price :"+computeNetPrice());
	}
}

