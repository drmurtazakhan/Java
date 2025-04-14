class Library
{
	private String title;
	private String callNo;
	private String publisher;
	public Library(String title, String callNo, String publisher)
	{
		this.title=title;
		this.callNo=callNo;
		this.publisher=publisher;
	}	
	public String toString()
	{
		return "\nTitle: "+title+"\nCall Number: "+callNo+" "+"\nPublisher: "+publisher;
	}
}
class Book extends Library
{
	private String author;

	
	public Book(String title, String callNo, String publisher, String author)
	{
		super (title, callNo, publisher);
		this.author=author;		
	}
	public String toString()
	{
		return "Book"+"\nAuthor: "+author+super.toString();
	}
	
}
class Perodical extends Library
{
	private String publishFrequency;
	
	public Perodical(String title, String callNo, String publisher, String publishFrequency)
	{
		super (title, callNo, publisher);
		this.publishFrequency=publishFrequency;		
	}
	public String toString()
	{
		return "\nPerodical"+super.toString()+"\nPublished Frequencey: "+publishFrequency;
	}
	
}
public class TestLibrary2
{
	public static void main(String[] args)
	{
		Book b1= new Book("Java Security Handbook","QA76.73.J38.K382 2000","SAMS","Jamie Jaworski & Paul J. Perrone");
		Perodical p1= new Perodical("Computer Aided Design","T385.C56","Elsevier Science","Monthly" );
		System.out.println(b1);
		System.out.println(p1);
	}	
}
