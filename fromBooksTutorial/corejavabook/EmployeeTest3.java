

//import ccj.*;
import corejava.*;
import java.util.*;


public class EmployeeTest3
{  public static void main(String[] args)
   { 
      String s;
      String datafile=Console.readString("Enter the data file name: ");
      try
      {     
      //FileInputStream in=new FileInputStream("empdata.txt");
      DataInputStream in=new DataInputStream(datafile);
      int n=in.readInt();
      s=inputData.readLine();
      }
      catch(IOException e)
      {System.out.println("An i/o exception occured:"+e);
      return;
      }
      /*
      TextInputStream in=new TextInputStream(datafile);
      int n=in.readInt();
      in.readLine();
      */
      Employee[] staff=new Employee[n];
      int i;
      for (i=0; i<n; i++) staff[i]=readEmployee(in);
      for (i = 0; i <staff.length; i++) staff[i].print();
      
      String  name;
      boolean found=false;
      int count=0;
      name=Console.readString("Search for employee(s) of name : ");
      
      for (i = 0; i <staff.length; i++)
      {
      found=staff[i].foundName(name);
      if (found)
         {
         count++;
         staff[i].print();
         }
     }
     System.out.println(count+" employee(s) found");                
   }
}

class Employee
{  public Employee(String n, double s)
   {  name = n;
      salary = s;     
   }
   public void print()
   {  System.out.println(name + " " + salary );
   }

   public boolean foundName(String n)   
   {
   boolean found=false;
   found=n.equalsIgnoreCase(name);
   return found;
   } 
   Employee readEmployee(FiletInputStream in)
   {
   name=in.readLine();
   salary=in.Console.readDouble();
   in.readLine();
   return new Employee (name,salary);
   }
   private String name;
   private double salary;
   
}


