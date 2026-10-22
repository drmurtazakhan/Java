/*
 * QuickSort_S.java	1.1 04/22/2002   Laurentiu Cristofor
 *
 * Copyright (c) 1999-2002 Laurentiu Cristofor
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
 * Another implementation of the quicksort algorithm.
 * The pivot is chosen to be the middle element.
 * Uses Robert Sedgewick's partitioning scheme.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.1, April 22nd, 2002
 * */
public class QuickSort_S implements SortInterface
{
  // helper method for QuickSort_S
  private static int partition(SInteger[] A, int left, int right)
  {
    int i, j, middle;
      
    middle = (left + right) / 2;

    A[right].exchange(A[middle]);

    for (i = left - 1, j = right; ; )
      {
	while (A[++i].compareTo(A[right]) < 0)
	  ;
	while (j > i && A[--j].compareTo(A[right]) > 0)
	  ;
	if (i >= j)
	  break;
	A[i].exchange(A[j]);
      }
      
    A[right].exchange(A[i]);

    return i;
  }

  public void sort(SInteger[] A)
  {
    quickSort(A);
  }

  public static void quickSort(SInteger[] A)
  {
    quickSort(A, 0, A.length - 1);
  }

  public static void quickSort(SInteger[] A, int left, int right)
  {
    if (left < right)
      {
	int p = partition(A, left, right);
	quickSort(A, left, p - 1);
	quickSort(A, p + 1, right);
      }
  }
}
