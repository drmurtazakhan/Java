/*
 * QuickSort_M3_BI.java	1.0 08/05/1999   Laurentiu Cristofor
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
 * Another implementation of the quicksort algorithm.
 * I use BinaryInsertionSort for small subarrays (<= 16 elements).
 * Uses the median-of-three partitioning scheme.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, August 5th, 1999
 * */
class QuickSort_M3_BI implements SortInterface
{
  // helper method for QuickSort_M3_BI
  private static int partition(SInteger[] A, int left, int right)
  {
    int i, j, middle;

    middle = (left + right) / 2;

    sort3(A, left, middle, right);

    // now left and right will serve as sentinels
    // the partitioning element will be put in A[right - 1]
    right = right - 1;

    A[right].exchange(A[middle]);

    for (i = left, j = right; ; )
      {
	while (A[++i].compareTo(A[right]) < 0)
	  ;
	while (A[--j].compareTo(A[right]) > 0)
	  ;
	if (i >= j)
	  break;
	A[i].exchange(A[j]);
      }
      
    A[right].exchange(A[i]);
      
    return i;
  }

  private static void sort3(SInteger[] A, int i, int j, int k)
  {
    if (A[i].compareTo(A[j]) > 0)
      A[i].exchange(A[j]);
    if (A[i].compareTo(A[k]) > 0)
      A[i].exchange(A[k]);
    if (A[j].compareTo(A[k]) > 0)
      A[j].exchange(A[k]);
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
    if ((right - left) > 15)
      {
	int p = partition(A, left, right);
	  
	quickSort(A, left, p - 1);
	quickSort(A, p + 1, right);
      }
    else
      BinaryInsertionSort.binaryInsertionSort(A, left, right);
  }
}
