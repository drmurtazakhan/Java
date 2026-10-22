/*
 * HeapSort.java	1.1 11/14/2000   Laurentiu Cristofor
 *
 * Copyright (c) 1999-2000 Laurentiu Cristofor
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
 * Implementation of the heapsort algorithm.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.1, November 14th, 2000
 * */
public class HeapSort implements SortInterface
{
  // helper method for HeapSort
  private static void siftDown(SInteger[] A, int i, int n)
  {
    SInteger value = new SInteger(A[i]); // value to sift down
      
    for (int j = 2 * i + 1; j <= n; i = j, j = 2 * i + 1)
      {
	// determine which child is greater
	if (j < n)
	  if (A[j + 1].compareTo(A[j]) > 0)
	    j++;
	  
	// break if children are smaller
	if (A[j].compareTo(value) <= 0)
	  break;

	// move child up
	A[i].assign(A[j]);
      }

    // place value into its final position
    A[i].assign(value);
  }

  public void sort(SInteger[] A)
  {
    heapSort(A);
  }

  // heapSort will sort the elements 0 ... length() - 1 of array A
  public static void heapSort(SInteger[] A)
  {
    int last = A.length - 1;
      
    // heapify
    for (int i = (last - 1) / 2; i > 0; i--)
      siftDown(A, i, last);
      
    // the first siftDown call will finish the heapify step
    // then we will extract the top of the heap, exchange it
    // with the last element of the heap, decrease the size of 
    // the heap and start over again
    for (int i = last; i > 0; i--)
      {
	siftDown(A, 0, i);
	A[0].exchange(A[i]);
      }
  }
}
