/*
 * MergeSort.java	1.0 07/21/1999   Laurentiu Cristofor
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
 * Implementation of the mergesort algorithm. 
 * uses the ideas from Sedgewick's book "Algorithms in C++" (ed. 1992).
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 21st, 1999
 * */
public class MergeSort implements SortInterface
{
  public void sort(SInteger[] A)
  {
    mergeSort(A);
  }

  public static void mergeSort(SInteger[] A)
  {
    // scratch array for mergeSort
    SInteger[] scratch = new SInteger[A.length];

    for (int i = 0; i < A.length; i++)
      scratch[i] = new SInteger();

    mergeSort(A, scratch, 0, A.length - 1);
  }

  public static void mergeSort(SInteger[] A, SInteger[] scratch,
			       int left, int right)
  {
    if (right > left)
      {
	int i, j, k, middle;
	  
	middle = (left + right) / 2;
	  
	mergeSort(A, scratch, left, middle);
	mergeSort(A, scratch, middle + 1, right);
	  
	// at the end of the loop i will equal left
	for (i = middle + 1; i > left; i--)
	  scratch[i - 1].assign(A[i - 1]);
	  
	// the second subarray is copied in reverse order
	// at the end of the loop j will equal right
	for (j = middle; j < right; j++)
	  scratch[right + middle - j].assign(A[j + 1]);
	  
	// merge the two subarrays into the original array
	for (k = left; k <= right; k++)
	  if (scratch[i].compareTo(scratch[j]) <= 0) // <= to make it stable
	    A[k].assign(scratch[i++]);
	  else
	    A[k].assign(scratch[j--]);
      }
  }
}
