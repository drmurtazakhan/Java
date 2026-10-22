/*
 * SInteger.java	1.0 07/21/1999   Laurentiu Cristofor
 *
 * Copyright (c) 1999 Laurentiu Cristofor
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL or COMMERCIAL purposes and
 * without fee is hereby granted provided that this copyright notice
 * appears in all copies.
 * 
 * I MAKE NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. I SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 * */

/**
 * This is a class provided for the use of the comparison sorts used in
 * the Sorters application. It provides accounting for the operations
 * compareTo(), assign() and exchange().
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 21st, 1999
 * */
public class SInteger
{
  private int integer;
  private static int count_compare;
  private static int count_assign;
  private static int count_exchange;

  public SInteger()
  {
    integer = 0;
  }

  public SInteger(int i)
  {
    integer = i;
  }

  public SInteger(SInteger value)
  {
    integer = value.integer;
  }

  public int compareTo(SInteger other)
  {
    count_compare++;
    return integer - other.integer;
  }

  public static int compareTo(SInteger a, SInteger b)
  {
    count_compare++;
    return a.integer - b.integer;
  }

  public void assign(SInteger value)
  {
    count_assign++;
    integer = value.integer;
  }

  public static void assign(SInteger a, SInteger b)
  {
    count_assign++;
    a.integer = b.integer;
  }

  public void exchange(SInteger other)
  {
    count_exchange++;
    // exchange only if object values are different
    if (this != other)
      {
	SInteger temp = new SInteger();
	  
	temp.assign(this);
	assign(other);
	other.assign(temp);
      }
  }

  public static void exchange(SInteger a, SInteger b)
  {
    count_exchange++;
    // exchange only if object values are different
    if (a != b)
      {
	SInteger temp = new SInteger();
	  
	temp.assign(a);
	a.assign(b);
	b.assign(temp);
      }
  }

  public String toString()
  {
    return Integer.toString(integer);
  }

  public int integer()
  {
    return integer;
  }

  public static int getCountCompare()
  {
    return count_compare;
  }

  public static int getCountAssign()
  {
    return count_assign;
  }

  public static int getCountExchange()
  {
    return count_exchange;
  }

  public static void resetCounts()
  {
    count_compare = 0;
    count_assign = 0;
    count_exchange = 0;
  }
}
