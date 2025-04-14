 class Person implements Comparable
{
	private String name;
	public Person(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int compareTo(Object other)
	{
		Person p = (Person) other;
		if ( name.compareTo(p.name) < 0 ) return -1;
		if ( name.compareTo(p.name) > 0 ) return 1;
		return 0;
	}
}

public class PersonTest
{
	public static void main (String args[])
	{
		
		Person p1= new Person("Majed");
		Person p2= new Person("Ali");
		
		int value=p1.compareTo(p2);
		if (value==0)
		System.out.println("Same Order");
		if (value<0)
		System.out.println(p1.getName()+ " comes before "+p2.getName());
		else
		System.out.println(p1.getName()+ " comes after "+p2.getName());
	}
}