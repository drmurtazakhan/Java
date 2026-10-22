/*
 * Sorters.java	1.03 04/22/2002   Laurentiu Cristofor
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

import java.util.Random;
import java.util.Vector;

/**
 * Application for testing and evaluating different sorting algorithms.
 * <TT>java Sorters -h</TT> will display all available options.
 *
 * @author	Laurentiu Cristofor
 * @version 	1.03, April 22nd, 2002
 * */
public class Sorters
{
  private static final int RAN = 0;
  private static final int ASC = 1;
  private static final int DES = 2;
  private static final int EQU = 3;

  // keep here the names for the sorting algorithms classes
  private static Vector SortNames;

  // the array that will be sorted
  private static SInteger[] A;
  // used to remember the seed used to initialize A
  private static long seed;
  
  // if true then the array contents are not displayed
  private static boolean bQuiet;
  // if true then the seed used to initialize the array 
  // contents will be reused 
  private static boolean bReuseSeed;
  // can be RAN, ASC, DES or EQU
  private static int inputType;

  // To add a new algorithm to Sorters, just add another line to this method.
  // That's all you need to do! Of course, there must exist a corresponding
  // .java file with the same name that actually implements a sorting
  // algorithm, but I suppose you knew that.
  private static void initSortNames()
  {
    SortNames = new Vector();
    SortNames.addElement("BubbleSort");
    SortNames.addElement("BubbleSort_S");
    SortNames.addElement("BidirectionalBubbleSort");
    SortNames.addElement("InsertionSort");
    SortNames.addElement("BinaryInsertionSort");
    SortNames.addElement("ShellSort");
    SortNames.addElement("MergeExchangeSort");
    SortNames.addElement("SelectionSort");
    SortNames.addElement("HeapSort");
    SortNames.addElement("MergeSort");
    SortNames.addElement("QuickSort_L");
    SortNames.addElement("QuickSort_S");
    SortNames.addElement("QuickSort_S_2");
    SortNames.addElement("QuickSort_S_BI");
    SortNames.addElement("QuickSort_S_I");
    SortNames.addElement("QuickSort_M3_BI");
    SortNames.addElement("QuickSort_M3_I");
  }

  private static void initA()
  {
    Random rand;

    switch (inputType)
      {
      case ASC:
	for (int i = 0; i < A.length; i++)
	  A[i] = new SInteger(i);
	break;

      case DES:
	for (int i = 0, j = A.length; i < A.length; i++, j--)
	  A[i] = new SInteger(j);
	break;

      case EQU:
	for (int i = 0, j = A.length; i < A.length; i++, j--)
	  A[i] = new SInteger(7);
	break;

      case RAN:
	if (seed == 0)
	  seed = System.currentTimeMillis();

	if (bReuseSeed)
	  rand = new Random(seed);
	else
	  // use different seed each time
	  rand = new Random(seed++);
	
	for (int i = 0; i < A.length; i++)
	  A[i] = new SInteger((int)(rand.nextDouble() * A.length));
	break;

      default:
	System.out.println("Internal error");
	System.exit(1);
      }

    SInteger.resetCounts();
  }

  private static void printA()
  {
    if (bQuiet)
      return;

    for (int i = 0; i < A.length; i++)
      System.out.print(" " + A[i]);
    System.out.println("");
  }

  private static void testSort(String sortName)
  {
    SortInterface sortAlg = null;
    long time_elapsed;

    try
      {
	sortAlg = (SortInterface)Class.forName(sortName).newInstance();
      }
    catch (Exception e)
      {
	System.out.println("Error when creating " + sortName + " object !");
	System.exit(1);
      }

    System.out.println("### " + sortName + " ###");

    System.out.print("initializing array...");
    initA();
    System.out.println("\tdone!");

    printA();

    System.out.print("sorting array...");
    long start = System.currentTimeMillis();
    sortAlg.sort(A);
    long stop = System.currentTimeMillis();
    time_elapsed = stop - start;
    System.out.println("\tdone!");

    printA();

    System.out.println("\nComparisons: \t\t" + SInteger.getCountCompare());
    System.out.println("Assignments: \t\t" + SInteger.getCountAssign());
    System.out.println("Exchanges: \t\t" + SInteger.getCountExchange());
    System.out.println("Time elapsed (msec): \t" + time_elapsed);
    System.out.println("------------------------------------------------");
  }

  private static void testAll()
  {
    for (int i = 0; i < SortNames.size(); i++)
      testSort((String)SortNames.elementAt(i));
  }

  private static void usage()
  {
    System.out.println("usage: java Sorters [-d] [-h] [-i type]");
    System.out.println("\t\t    [-n no_values] [-q] [-s seed] [-t alg]\n");
    System.out.println("-d = test each algorithm with different input (no need if -t is used)");
    System.out.println("-h = help, display options");
    System.out.println("-i type = type of input (default = random), type must be one of:");
    System.out.println("\t asc = ordered ascending");
    System.out.println("\t des = ordered descending");
    System.out.println("\t equ = all elements equal");
    System.out.println("-n no_values = specify how many values to sort");
    System.out.println("-q = quiet, print only statistics");
    System.out.println("-s seed = set initial seed (!= 0)");
    System.out.println("-t alg = algorithm to test (default = all), alg must be one of:");
    for (int i = 0; i < SortNames.size(); i++)
      System.out.println("\t " + (i + 1) 
			 + " = " + SortNames.elementAt(i));

    System.exit(1);
  }

  public static void main(String[] args)
  {
    int N = 20;
    int which = 0;

    bQuiet = false;
    bReuseSeed = true;
    inputType = RAN;

    initSortNames();

    if (args.length > 11)
      {
	System.out.println("Too many arguments\n");
	usage();
      }
    else
      for (int i = 0 ; i < args.length; i++)
	{
	  if (args[i].equals("-q"))
	    bQuiet = true;
	  else if (args[i].equals("-d"))
	    bReuseSeed = false;
	  else if (args[i].equals("-h"))
	    usage();
	  else if (args[i].equals("-i"))
	    {
	      i++;
	      if (i == args.length)
		{
		  System.out.println("Missing argument value\n");
		  usage();
		}
	      if (args[i].equals("asc"))
		inputType = ASC;
	      else if (args[i].equals("des"))
		inputType = DES;
	      else if (args[i].equals("equ"))
		inputType = EQU;
	      else
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	    }
	  else if (args[i].equals("-s"))
	    {
	      i++;
	      if (i == args.length)
		{
		  System.out.println("Missing argument value\n");
		  usage();
		}
	      try
		{
		  seed = Long.parseLong(args[i]);
		}
	      catch (NumberFormatException e)
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	      if (seed == 0)
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	    }
	  else if (args[i].equals("-n"))
	    {
	      i++;
	      if (i == args.length)
		{
		  System.out.println("Missing argument value\n");
		  usage();
		}
	      try
		{
		  N = Integer.parseInt(args[i]);
		}
	      catch (NumberFormatException e)
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	      if (N < 1)
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	    }
	  else if (args[i].equals("-t"))
	    {
	      i++;
	      if (i == args.length)
		{
		  System.out.println("Missing argument value\n");
		  usage();
		}
	      try
		{
		  which = Integer.parseInt(args[i]);
		}
	      catch (NumberFormatException e)
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	      if (which < 1 || which > SortNames.size())
		{
		  System.out.println("Invalid argument value\n");
		  usage();
		}
	      // no need for reusing seed if we're running just
	      // one algorithm
	      bReuseSeed = false;
	    }
	  else
	    {
	      System.out.println("Invalid argument\n");
	      usage();
	    }
	}

    A = new SInteger[N];
    
    if (which == 0)
      testAll();
    else
      testSort((String)SortNames.elementAt(which - 1));
  }
}
