/*
 * SelectionSort.java	1.2 07/24/2000   Laurentiu Cristofor
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
 * Implementation of the selection sort algorithm.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.2, July 24th, 2000
 * */
public class SelectionSort implements SortInterface
{
  public void sort(SInteger[] A)
  {
    selectionSort(A);
  }

  public static void selectionSort(SInteger[] A)
  {
    selectionSort(A, 0, A.length - 1);
  }
    
  public static void selectionSort(SInteger[] A, int left, int right)
  {
    int j, max;
      
    for (int i = right; i > left; i--)
      {
	// find maximum element between left ... i - 1
	for (j = left, max = i; j < i; j++)
	  if (A[j].compareTo(A[max]) > 0)
	    max = j;
	  
	A[i].exchange(A[max]);
      }
  }
}
