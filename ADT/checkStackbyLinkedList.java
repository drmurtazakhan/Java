public class checkStackbyLinkedList
{
	public static void main(String args[])
	{
		String [] courses = {"102", "201", "202", "232", "313"};
		StackLinkedList s = new StackLinkedList(); 
		for(int i=0; i< courses.length; i++)
		{
			s.push(courses[i]);
		}	
		String output = new String();
		while (! s.isEmpty())
		{
			String st = (String) s.peek();
			System.out.println(st);    
			output=output + st;
			s.pop();
		}		
	}
}