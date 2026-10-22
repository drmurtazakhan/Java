/*
 * BinaryInsertionSort.java	1.0 07/21/1999   Laurentiu Cristofor
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
 * A variant of the insertion sort algorithm that uses binary search
 * to determine the position where it should insert.
 * This was mentioned by John Mauchly in 1946 (Knuth)
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 21st, 1999
 * */
public class BinaryInsertionSort implements SortInterface
{
  // helper method for BinaryInsertionSort
  // return the position in array A where value is found or
  // where it should be inserted
  private static int binarySearch(SInteger[] A, int left, int right,
				  SInteger value)
  {
    int middle, cmp;

    while (left <= right)
      {
	middle = (left + right) / 2;
	cmp = value.compareTo(A[middle]);
	if (cmp == 0)
	  return middle;
	else if (cmp < 0)
	  right = middle - 1;
	else // if (cmp > 0)
	  left = middle + 1;
      }

    return left;
  }

  public void sort(SInteger[] A)
  {
    binaryInsertionSort(A);
  }

  public static void binaryInsertionSort(SInteger[] A)
  {
    binaryInsertionSort(A, 0, A.length - 1);
  }

  public static void binaryInsertionSort(SInteger[] A, int left, int right)
  {
    int i, j, pos;
    SInteger value = new SInteger();

    for (i = left + 1; i <= right; i++)
      {
	value.assign(A[i]);

	pos = binarySearch(A, left, i - 1, value);

	for (j = i; j > pos; j--)
	  A[j].assign(A[j - 1]);
	  
	A[j].assign(value);
      }
  }
}
