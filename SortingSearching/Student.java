public class Student implements Comparable
{
	private int id;
    private String name;
    private double gPA;
    public Student(int id, String name, double gPA)
    {
    	this.id = id;
     	this.name = name;
     	this.gPA = gPA;
    }
    
    public String toString()
    {
    	return id+"\t"+name+"\t"+gPA;
    }
    
    public int compareTo(Object other)
    {
    	Student s = (Student) other;
        if (id < s.id)
        return -1;
        else if (id > s.id)
        return 1;
        else
        return 0;           
    }
} 

