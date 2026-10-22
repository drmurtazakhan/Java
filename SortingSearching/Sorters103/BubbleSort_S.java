/*
 * BubbleSort_S.java	1.0 08/05/1999   Laurentiu Cristofor
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
 * Another implementation of the bubble sort algorithm. I've seen this 
 * implementation in Sedgewick's book "Algorithms in C++" (ed. 1992).
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, August 5th, 1999
 * */
public class BubbleSort_S implements SortInterface
{
  public void sort(SInteger[] A)
  {
    bubbleSort(A);
  }

  public static void bubbleSort(SInteger[] A)
  {
    bubbleSort(A, 0, A.length - 1);
  }

  public static void bubbleSort(SInteger[] A, int left, int right)
  {
    for (int i = right; i >= left; i--)
      for (int j = left + 1; j <= i; j++)
	if (A[j - 1].compareTo(A[j]) > 0)
	  A[j - 1].exchange(A[j]);
  }
}
