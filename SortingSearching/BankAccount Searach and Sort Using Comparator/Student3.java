import java.util.*;
class Student3 implements Comparator
{
	 private int iDNumber;
     private String name;
     private double gPA;
   
     public Student3(int iDNumber, String name, double gPA)
     {
     	this.iDNumber = iDNumber;
     	this.name = name;
     	this.gPA = gPA;
     }
     public Student3(String name)
     {
     	this(0,name,0.0);
     }
     public Student3()
     {
     	this(0,"",0.0);
     }
     public String toString()
     {
    	return iDNumber+"\t"+name+"\t"+gPA;
     }
     public int compare(Object object1, Object object2)
     {
     	Student3 student1 = (Student3) object1;
     	Student3 student2 = (Student3) object2;
     	return student2.name.compareTo(student1.name);
     }
} 

