/**
 *
 */
 
class Student2 implements Comparable
{
	/** ghghghg*/
	 private int iDNumber;
     private String name;
     private double gPA;
   
     public Student2(int iDNumber, String name, double gPA)
     {
     	this.iDNumber = iDNumber;
     	this.name = name;
     	this.gPA = gPA;
     }
     public Student2(String name)
     {
     	this(0,name,0.0);
     }
     public String toString()
     {
    	return iDNumber+"\t"+name+"\t"+gPA;
     }
     
     public int compareTo(Object other)
     {
    	Student2 s = (Student2) other;
        if (name.compareTo(s.name) < 0)
        return -1;
        else if (name.compareTo(s.name) > 0)
        return 1;
        else
        return 0;           
     }
     /*
         public int compareTo(Object other)
     {
    	Student2 s = (Student2) other;
        if (name.compareTo(s.name) < 0)
        return -1;
        else if (name.compareTo(s.name) > 0)
        return 1;
        else
        return 0;           
     }
     */
} 

