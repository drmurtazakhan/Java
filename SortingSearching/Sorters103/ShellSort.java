/*
 * ShellSort.java	1.0 07/21/1999   Laurentiu Cristofor
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
 * Implementation of the Shellsort algorithm (Donald L. Shell 1959).
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 21st, 1999
 * */
public class ShellSort implements SortInterface
{
  // helper method for shellSort
  private static void deltaInsertionSort(SInteger[] A, 
					 int left, int right, 
					 int delta)
  {
    int i, j;
    SInteger value = new SInteger();
      
    for (i = left + delta; i <= right; i += delta)
      {
	value.assign(A[i]);
	  
	for (j = i ; j > left 
	       && value.compareTo(A[j - delta]) < 0; j -= delta )
	  A[j].assign(A[j - delta]);
	  
	A[j].assign(value);
      }
  }
    
  public void sort(SInteger[] A)
  {
    shellSort(A);
  }

  public static void shellSort(SInteger[] A)
  {
    shellSort(A, 0, A.length - 1);
  }

  public static void shellSort(SInteger[] A, int left, int right)
  {
    int delta = A.length;

    do
      {
	// initially we take delta about one third 
	// the number of elements in the array A
	delta = delta / 3 + 1;
	  
	for (int i = left; i < left + delta; i++)
	  deltaInsertionSort(A, i, right, delta);
      }
    while (delta > 1);
  }
}
