/*
 * QuickSort_L.java	1.0 07/21/1999   Laurentiu Cristofor
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
 * Implementation of the quicksort algorithm (C. A. R. Hoare 1962).
 * The pivot is chosen to be the middle element.
 * Uses Nico Lomuto's partitioning scheme.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 21st, 1999
 * */
public class QuickSort_L implements SortInterface
{
  // helper method for QuickSort_L
  // Jon Bentley mentions he learned this method from
  // Nico Lomuto of Alsys Inc. ("Programming Pearls")
  private static int partition(SInteger[] A, int left, int right)
  {
    int i, p, middle;
      
    middle = (left + right) / 2;

    A[left].exchange(A[middle]);

    // Invariant: A[left+1:p] < A[left] and A[p+1:i-1] >= A[left]
    for (p = left, i = left + 1; i <= right; i++)
      if (A[i].compareTo(A[left]) < 0)
	A[++p].exchange(A[i]);
      
    A[left].exchange(A[p]);

    return p;
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
