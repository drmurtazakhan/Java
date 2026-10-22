abstract class Message
{
	private String sender;
	private Date date;
	public Message (String from)
	{
		sender = from;
	} 
	
	public Date getDate()
	{
		return Date;
	}
	public String getSenderName()
	{
		return sender;
	}
	public abstract void readMessage(); 
} 

class TextMessage extends Message
{
	private  String text;
	public TextMessage(String from, String txt)
	{
		super(from);
		text = txt;
	}
	public void readMessage()
	{
		System.out.println(text);
	}
} 

public class TestAbstractMessage
{
	public static void main(String args[])
	{
		TextMessage tm = new TextMessage("Ali","Hello");
		System.out.println(tm.getDate()+" "+tm.getSenderName+" "+tm.readMessage());
		
	}
}