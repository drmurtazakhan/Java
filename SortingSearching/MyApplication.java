interface Sortable
{
	// 	  compare(): Compare this object to another object
  	//    Returns:  //    0 if this object is equal to obj2
  	//    a value < 0 if this object < obj2
  	//    a value > 0 if this object > obj2
  	int compare(Object obj2);
}

abstract class Sort
{
	public static void sortObjects(Sortable[] items)
	{
		// Step through the array comparing and swapping;
		// do this length-1 times
		for (int i = 1; i < items.length; i++)
		{
			for (int j = 0; j < items.length - 1; j++)
			{
				if (items[j].compare(items[j+1]) > 0) // calls "compare" method from the class
				{                                     // that implements Sortable interface 
					Sortable tempitem = items[j+1];
					items[j+1] = items[j];
					items[j] = tempitem;
				}
			}
		}
	}
}

class Movie implements Sortable
{
	String title; 
	int timeLength ;
	public Movie(String newTitle,int timeLength)
	{
		title = newTitle;
		this.timeLength = timeLength;
	}	
	public String getTitle()
	{
		return title;
	}
	public String toString()
	{
		return title+" "+timeLength+ " minutes";
	}
	public int compare(Object movie2)
	{
		String title1 = this.title;
		String title2 = ((Movie)movie2).getTitle();
		return(title1.compareTo(title2)); // compareTo method of String class is used
	}			
}  
public class MyApplication
{
	public static void main(String args[])
	{
		Movie[] movielist = new Movie[4];
		movielist[0]= new Movie("Matrix",135);
		movielist[1]= new Movie("Labyrinth",140);
		movielist[2]= new Movie("Die Hard",120);
		movielist[3]= new Movie("Short Circuit",130);
		// build the array of Movie
		Sort.sortObjects(movielist); // call sortObjects method from class Sort
		System.out.println("Sorted with respect to Title");
		System.out.println("____________________________");
		for (int i=0; i<movielist.length ; i++)
		System.out.println(movielist[i]);
	}	 
}