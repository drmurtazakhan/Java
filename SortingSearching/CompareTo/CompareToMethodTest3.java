class Student 
{	private String name;    
    private String dept;    
    public Student(String name, String dept)
    {  	this.name = name;        	
    	this.dept = dept;     	
    }
    public String toString()
    {    return name+" "+dept;
    }
    public int compTo1(Object other)
    {	Student s = (Student) other;
   		if (this.name.compareTo(s.name) < 0)
	    return -1;
	    else if (this.name.compareTo(s.name) > 0)
	    return 1;
	    else
	    return 0;           
    }
    public int compTo2(Object other)
    {	Student s = (Student) other;
   		if (this.dept.compareTo(s.dept) < 0)
	    return -1;
	    else if (this.dept.compareTo(s.dept) > 0)
	    return 1;
	    else
	    return 0;           
    }    
} 
public class CompareToMethodTest3
{	public static void main(String[] args)
	{	Student[] s = new Student[6];		
		s[0] = new Student("C","se");
        s[1] = new Student("N","coe");
       	s[2] = new Student("B","ics");
       	s[3] = new Student("B","se");
      	s[4] = new Student("M","ics");
      	s[5] = new Student("J","coe");
      	insertionSort1(s);      	
      	insertionSort2(s);
      	for (int i=0; i<s.length; i++)
      	System.out.println(s[i]);      	      	      	
    }
    
    public static void insertionSort1(Student[] a)
	{	int  i, j;
		Student cs;
		for (i = 1; i < a.length; i++)
		{	cs = a[i];
			for(j=i;j>0&&cs.compTo1(a[j-1])<0;j--)
			a[j] = a[j-1];
			a[j] = cs;			
		}
	}
	public static void insertionSort2(Student[] a)
	{	int  i, j;
		Student cs;
		for (i = 1; i < a.length; i++)
		{	cs = a[i];
			for(j=i;j>0&&cs.compTo2(a[j-1])<0;j--)
			a[j] = a[j-1];
			a[j] = cs;			
		}
	}    
}
	