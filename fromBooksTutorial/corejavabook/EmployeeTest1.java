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

public class EmployeeTest1
{  public static void main(String[] args)
   {  Employee[] staff = new Employee[3];

      staff[0] = new Employee("Harry Hacker", 35000, 
         new Day(1989,10,1));
      staff[1] = new Employee("Carl Cracker", 75000, 
         new Day(1987,12,15));
      staff[2] = new Employee("Tony Tester", 38000, 
         new Day(1990,3,15));
         
         
      Department[] dept = new Department[3];

      dept[0] = new Department("Finance", "Carl Cracker"); 
      dept[1] = new Department("Engineering", "Tony Tester");
      dept[2] = new Department("Personnal", "Harry Hacker");
               
      int i;
      for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
      for (i = 0; i < 3; i++) staff[i].print_emp();
      System.out.println("Departments & Managers\n");
      for (i = 0; i < 3; i++) dept[i].print_Dept();
       
   }
}

class Employee
{  public Employee(String n, double s, Day d)
   {  name = n;
      salary = s;
      hireDay = d;
   }
   public void print_emp()
   {  System.out.println(name +";"+ "Salary= " + salary + "; " 
         + ServiceYear()+" of service");
   }
   public void raiseSalary(double byPercent)
   {  salary *= 1 + byPercent / 100;
   }
   public int ServiceYear()
   { 
     Day today=new Day();
     return today.daysBetween(hireDay)/365;
   }

   private String name;
   private double salary;
   private Day hireDay;
}


class Department
{ public Department(String dname,String mname)
  {
   dept_name=dname;
   mngr_name=mname;
   
  }
  
  public void print_Dept()
  {
  System.out.println(dept_name+"\t"+mngr_name);
  }
  private String dept_name;
  private String mngr_name; 
}
