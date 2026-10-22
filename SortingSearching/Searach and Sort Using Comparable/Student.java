class Student implements Comparable
{
	 private int iDNumber;
     private String name;
     private double gPA;
   
     public Student(int iDNumber, String name, double gPA)
     {
     	this.iDNumber = iDNumber;
     	this.name = name;
     	this.gPA = gPA;
     }
     public Student(int iDNumber)
     {
     	this(iDNumber,"",0.0);
     }
     public String toString()
     {
    	return iDNumber+"\t"+name+"\t"+gPA;
     }
     public int compareTo(Object other)
     {
    	Student s = (Student) other;
        if (iDNumber < s.iDNumber)
        return -1;
        else if (iDNumber > s.iDNumber)
        return 1;
        else
        return 0;           
     }
} 

