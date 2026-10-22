import java.util.*;
class Person implements Comparator
{
	 private int age;
     private String name;     
   
     public Person(String name, int age)
     {
     	this.name = name;     	
     	this.age = age;     	
     }     
     public String toString()
     {
    	return age+"\t"+name;
     }
     public int compare(Object object1, Object object2)
     {
     	Person person1 = (Person) object1;
     	Person person2 = (Person) object2;
     	return person2.name.compareTo(person1.name);
     }
} 

