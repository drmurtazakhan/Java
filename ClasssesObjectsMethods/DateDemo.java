import java.io.*;
import java.util.*;
public class DateDemo
{	public static void main(String[] args) throws IOException
	{	BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a date (dd/mm/yyyy): ");
		String d=stdin.readLine();
		while(!d.equalsIgnoreCase("Q"))
		{	StringTokenizer st=new StringTokenizer(d, "/");
			int day=Integer.parseInt(st.nextToken());
			int month=Integer.parseInt(st.nextToken());
			int year=Integer.parseInt(st.nextToken());
			Date dt=new Date(day, month, year);
			System.out.println("Date before change: "+dt.getDate());
			dt.setDate("1/1/1999");
			System.out.println("Date after change: "+dt.getDate());
			d=stdin.readLine();
		}
	}
}
class Date
{	private int day;
	private int month;
	private int year; 
	Date()
	{	day=1;		month=1;		year=1900;
	}
	Date(int y)
	{	day=1;		month=1;		year=y;
	}
	Date(int m, int y)
	{	day=1;		month=m;		year=y;
	}
	Date(int d, int m, int y)
	{	day=d;		month=m;		year=y;
	}

	public int getDay()
	{	return day;
	}
	public int getMonthr()
	{	return month;
	}
	public int getYear()
	{	return year;
	}
	public String getDate()
	{	return day+"/"+month+"/"+year;
	}
	public void setDate(int d, int m, int y)
	{	day=d;		month=m;		year=y;
	}
	public void setDate(String d)
	{	StringTokenizer st=new StringTokenizer(d, "/");
		day=Integer.parseInt(st.nextToken());
		month=Integer.parseInt(st.nextToken());
		year=Integer.parseInt(st.nextToken());
	}
}

