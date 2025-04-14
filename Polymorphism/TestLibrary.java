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
	public String objectContents()
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
	public String objectContents()
	{
		return "Book"+"\nAuthor: "+author+super.objectContents();
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
	public String objectContents()
	{
		return "\nPerodical"+super.objectContents()+"\nPublished Frequencey: "+publishFrequency;
	}
	
}
public class TestLibrary
{
	public static void main(String[] args)
	{
		Book b1= new Book("Java Security Handbook","QA76.73.J38.K382 2000","SAMS","Jamie Jaworski & Paul J. Perrone");
		Perodical p1= new Perodical("Computer Aided Design","T385.C56","Elsevier Science","Monthly" );
		describe(b1);
		describe(p1);
	}
	public static void describe(Library l)
	{
		System.out.println( l.objectContents() );
		System.out.println(  );
	}
	
}
