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

public class ManagerTest1
{  public static void main(String[] args)
   {  Employee[] staff = new Employee[3];
   
      Manager boss= new Manager("Carl Cracker",75000,new Day(1987,12,15));
      boss.setSecretaryName("Harry Hacker");
      boss.setManagerName("Carl Cracker");

      staff[0]=boss;
      staff[1] = new Employee("Harry Hacker", 35000, 
         new Day(1989,10,1));
      
      staff[2] = new Employee("Tony Tester", 38000, 
         new Day(1990,3,15));
         
      
         
      int i;
      for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
      for (i = 0; i < 3; i++) staff[i].print();

      System.out.println(boss.getManagerName()+"'s current secretary is "+
                         boss.getSecretaryName());
   }
}

class Employee
{  public Employee(String n, double s, Day d)
   {  name = n;
      salary = s;
      hireDay = d;
   }
   public void print()
   {  System.out.println(name + " " + salary + " " 
         + hireYear());
   }
   public void raiseSalary(double byPercent)
   {  salary *= 1 + byPercent / 100;
   }
   public int hireYear()
   {  return hireDay.getYear();
   }

   private String name;
   private double salary;
   private Day hireDay;
}

class Manager extends Employee
{  public Manager(String n, double s, Day d)
   {  super(n, s, d);
      secretaryName = "";
   }

   public void raiseSalary(double byPercent)
   {  // add 1/2% bonus for every year of service
      Day today = new Day();
      double bonus = 0.5 * (today.getYear() - hireYear());
      super.raiseSalary(byPercent + bonus);
   }
   
   public void setSecretaryName(String n)
   {  secretaryName = n;
   }
   
   public void setManagerName(String n)
   {  managerName = n;
   }
   

   public String getSecretaryName()
   {  return secretaryName;
   }
   
   public String getManagerName()
   {  return managerName;
   }
   
   
   
   private String secretaryName;
   private String managerName;
   
}


