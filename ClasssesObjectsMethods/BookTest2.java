import java.io.*;
public class BookTest2
{	
	public static void main(String[] args)
	{		
		Book b1= new Book("Computing Concepts with Java", "Cay Hortsmann", 40);
		Book b2= new Book("Java and Software Design", "Nell Dale");
		b2.setPrice(50);
		System.out.println(b1);
		System.out.println("--------------------------------");
		System.out.println(b2);	
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
	
	public Book(String title, String author)
	{	
		this(title,author,0.0);
	}
	
	public void setPrice(double price)
	{		bookPrice=price;
	}		
			
	public String toString()
	{
		return
		"Title :"+bookTitle+"\n"+
		"Author :"+bookAuthor+"\n"+
		"Price :"+bookPrice+"\n";		
	}
}

