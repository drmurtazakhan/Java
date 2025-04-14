import java.util.*;
class Person implements Comparator
{	private String name;
	private int age;
	public Person(String name, int age)
	{	this.name=name;
		this.age=age;
	}
	public Person()
	{	this("",0);
	}	
	public int compare(Object o1, Object o2)
	{	Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		return p1.name.compareTo(p2.name);
	}
	public String toString()
	{	return name+"\t"+age;
	}
}

public class PersonTest2
{	public static void main (String args[])
	{	Person p1= new Person("Ali",28);
		Person p2= new Person("Majed",27);
		Comparator obj=new Person();
		if (obj.compare(p1,p2)<0)
		{	System.out.println("By name "+p1+" is before "+p2);
		}
		else if (obj.compare(p1,p2)>0)
		{	System.out.println("By name "+p2+" is before "+p1);
		}
		else
		{	System.out.println("By name"+p1+" is equal to "+p2);
		}
	}
}