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
 * @version 1.00 11 Mar 1997
 * @author Cay Horstmann
 */

import corejava.*;
import java.math.*;

public class BigIntegerTest1
{  public static BigInteger addBigs(BigInteger num1, BigInteger num2)
   {  BigInteger sumtwo = num1.add(num2);
      
      return sumtwo;
   }

   public static void main(String[] args)
   { 

     BigInteger number1=new BigInteger("12345678900123456789012345678901234567890");
     BigInteger number2=new BigInteger("24680246802468024680246802468024680246800");
     
     System.out.println("First Big integer is       "+number1);
     System.out.println("Second Big integer is      "+number2);
     
     BigInteger sum = addBigs(number1, number2);

     System.out.println("Sum of two Big integes is  "+sum);
   }
}
