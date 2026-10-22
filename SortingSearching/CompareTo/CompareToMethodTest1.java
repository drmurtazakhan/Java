class Student implements Comparable
{	private String name;
    private int id;
    public Student(String name, int id)
    {  	this.name = name;    
    	this.id = id;     	
    }
    public String toString()
    {    
    	//return +name+" "+id;
    	return "("+name+" "+id+")";
    }
    public int compareTo(Object other)
    {	Student s = (Student) other;
   		if (this.name.compareTo(s.name) < 0)
	    return -1;
	    else if (this.name.compareTo(s.name) > 0)
	    return 1;
	    else
	    return 0;           
    }    
} 
public class CompareToMethodTest1
{	public static void main(String[] args)
	{	Student[] s = new Student[4];
		
		/*s[0] = new Student("N",4);
        s[1] = new Student("H",8);
        s[2] = new Student("M",2);
        s[3] = new Student("A",6);*/
        s[0] = new Student("O",6);
        s[1] = new Student("D",5);
       	s[2] = new Student("N",8);
      	s[3] = new Student("B",4);
      	/*
      	s[0] = new Student("J",1);
        s[1] = new Student("G",7);
        s[2] = new Student("I",3);
        s[3] = new Student("C",5);*/

        test(s);
    }
    public static void test(Student[] a)
    {	for (int i = 0; i < a.length-1; i++)
		{	for (int j=i+1; j<a.length; j++)
			{   // calling compareTo method from Student class
				if ( a[j].compareTo(a[i])==-1 )
				method1(a,i,j);
			}
			System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]);
		}		
	}
	public static void method1 (Student[] a,int i,int j)
	{	Student d;
		d=a[i];
		a[i]=a[j];
		a[j]=d;
	}
}
	