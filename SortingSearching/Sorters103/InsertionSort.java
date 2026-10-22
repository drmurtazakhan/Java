/*
 * InsertionSort.java	1.0 07/21/1999   Laurentiu Cristofor
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
 * Implementation of the insertion sort algorithm.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 21st, 1999
 * */
public class InsertionSort implements SortInterface
{
  public void sort(SInteger[] A)
  {
    insertionSort(A);
  }

  public static void insertionSort(SInteger[] A)
  {
    insertionSort(A, 0, A.length - 1);
  }

  public static void insertionSort(SInteger[] A, int left, int right)
  {
    int i, j;
    SInteger value = new SInteger();

    for (i = left + 1; i <= right; i++)
      {
	value.assign(A[i]);
	  
	for (j = i; j > left && value.compareTo(A[j - 1]) < 0; j--)
	  A[j].assign(A[j - 1]);
	  
	A[j].assign(value);
      }
  }
}
