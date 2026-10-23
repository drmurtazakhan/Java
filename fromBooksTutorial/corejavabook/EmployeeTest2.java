/*
 * Cay S. Horstmann & Gary Cornell, Core Java
 * Published By Sun Microsystems Press/Prentice-Hall
 * Copyright (C) 1997 Sun Microsystems Inc.
 * All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this 
 * software and its documentation for NON-COMMERCIAL purposes
 * and without fee is hereby granted provided that this 
 * copyright notice appears in all copies. 
 * 
 * THE AUTHORS AND PUBLISHER MAKE NO REPRESENTATIONS OR 
 * WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE AUTHORS
 * AND PUBLISHER SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED 
 * BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING 
 * THIS SOFTWARE OR ITS DERIVATIVES.
 */
 
/**
 * @version 1.00 07 Feb 1996 
 * @author Cay Horstmann
 */

import java.util.*;
import corejava.*;

public class EmployeeTest2
{  public static void main(String[] args)
   { 
      
      Vector staffVector=new Vector();
      String more,name;
      double salary;
      boolean done=false;
      boolean found=false;
      while (!done)
      {
      name=Console.readString   ("Employee Name  : ");
      salary=Console.readDouble("Employee Salary: ");
      Employee e=new Employee(name,salary);
      staffVector.addElement(e);
      System.out.println("More data? (Y/N) ");
      more=Console.readString();
      if (!more.toUpperCase().equals("Y")) done=true;
      }
      Employee[] staff=new Employee[staffVector.size()];
      staffVector.copyInto(staff);
      
      int i,count=0;
      
      for (i = 0; i <staff.length; i++) staff[i].print();
      name=Console.readString   ("Search for employee(s) of name : ");
      
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
   private String name;
   private double salary;
   
}


