/*
 * MergeExchangeSort.java	1.0 07/27/1999   Laurentiu Cristofor
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
 * Implementation of the merge exchange sort algorithm.
 * (K. E. Batcher 1964)
 *
 * @author	Laurentiu Cristofor
 * @version 	1.0, July 27th, 1999
 * */
public class MergeExchangeSort implements SortInterface
{
  public void sort(SInteger[] A)
  {
    mergeExchangeSort(A);
  }

  public static void mergeExchangeSort(SInteger[] A)
  {
    mergeExchangeSort(A, 0, A.length - 1);
  }

  // see Knuth - "Art of Computer Programming",
  // vol III "Sorting and Searching", 2nd edition, page 111
  public static void mergeExchangeSort(SInteger[] A, int left, int right)
  {
    int N = right - left + 1;

    if (N > 1)
      {
	int t, p, q, r, d;

	// M1. [Initialize p]
	t = (int)(Math.log(N) / Math.log(2));
	if (pow2(t) < N)
	  t++;
	p = pow2(t - 1);

	while (true)
	  {
	    // M2. [Initialize q, r, d]
	    q = pow2(t - 1);
	    r = 0;
	    d = p;

	    while (true)
	      {
		// M3. [Loop on i]
		for (int i = 0; i < N - d; i++)
		  if ((i & p) == r)
		    {
		      // M4. [Compare/exchange R_{i+1}:R_{i+d+1}]
		      if (A[left + i].compareTo(A[left + i + d]) > 0)
			A[left + i].exchange(A[left + i + d]);
		    }

		// M5. [Loop on q]
		if (q != p)
		  {
		    d = q - p;
		    q = q / 2;
		    r = p;
		  }
		else 
		  break;
	      }

	    // M6. [Loop on p]
	    p = p / 2;
	    if (p == 0)
	      break;
	  }
      }
  }

  // Computes 2 to the power of exp. 
  // Works correctly for exp >= 0.
  private static int pow2(int exp)
  {
    int res = 1;
    for (int i = 1; i <= exp; i++)
      res *= 2;
    return res;
  }
}
