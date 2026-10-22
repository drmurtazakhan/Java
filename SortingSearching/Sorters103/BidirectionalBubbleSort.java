/*
 * BidirectionalBubbleSort.java	1.0 08/05/1999   Laurentiu Cristofor
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
 * Another implementation of the bubble sort algorithm.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, August 5th, 1999
 * */
public class BidirectionalBubbleSort implements SortInterface
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
    boolean fExchanged = false;

    while (left < right)
      {
	// go from left to right
	for (int i = left; i < right; i++)
	  if (A[i].compareTo(A[i + 1]) > 0)
	    {
	      A[i].exchange(A[i + 1]);
	      fExchanged = true;
	    }

	if (!fExchanged)
	  break;

	// the maximum element has been pushed to the right
	right--;
	fExchanged = false;

	// go from right to left
	for (int i = right; i > left; i--)
	  if (A[i - 1].compareTo(A[i]) > 0)
	    {
	      A[i - 1].exchange(A[i]);
	      fExchanged = true;
	    }

	if (!fExchanged)
	  break;

	// the minimum element has been pushed to the left
	left++;
	fExchanged = false;
      }
  }
}
