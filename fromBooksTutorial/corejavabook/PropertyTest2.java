 import java.util.*;
 import ccj.*;

public class PropertyTest2
{  public static void main(String[] args)
   {  
      
      System.out.print("Enter data file name (e.g pt2.txt) : ");
      String filename=Console.in.readWord();
      TextInputStream in=new TextInputStream(filename);
      int n=in.readInt();
      in.readLine();
      Employee[] staff=new Employee[n];
      
      int i;
      for (i=0; i<n; i++)
      {
      Employee e=new Employee();
      e.read(in);
      staff[i]=e;
      }    
      System.out.println("Record of Employees :");
      for (i=0; i<n; i++)
      {
      staff[i].print();
      }
         
      
   }
} // end of class PropertyTest2


class Employee
{  public Employee()
   {  
      name = "";
      salary = 0;
   }
     public void read(TextInputStream in)
   {
      name=in.readLine();
      salary=in.readDouble();
      in.readLine();
   }   
   
   public void print()
   {  System.out.println(name + " " + salary  );
   }
   public void raiseSalary(double byPercent)
   {  salary *= 1 + byPercent / 100;
   }
   
   
      
   private String name;
   private double salary;
   

}  // end of class employee
