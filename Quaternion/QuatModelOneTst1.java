package mak2000.quaternion;
import mak2000.searching.*;
import javax.vecmath.Quat4d;
import java.io.*;
public class QuatModelOneTst1
{
	public static void main(String[] args)  throws IOException
	{	      
    	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));  
    	Quat4d qa=new Quat4d(0.4317,-0.4817,0.4739,-0.5975);
    	Quat4d qb=new Quat4d(-0.4317,0.4817,-0.4739,0.5975);
    	Quat4d qc=new Quat4d();
    	Quat4d[] qAry=new Quat4d[3];
    	qAry[0]=qa;
    	qAry[1]=qb;
    	qAry[2]=qc;
    	
    	QuatModelOne[] qmarray=QuatModelOne.createObjsFromQuat4dAry(qAry);
    	QuatModelOne.printQuatModelOneAry(qmarray);
    	System.out.println("----------------------------------------");
    	 
        QuatModelOne[] qmAry=new QuatModelOne[8];		
		qmAry[0]=new QuatModelOne("qR",qa);
		qmAry[1]=new QuatModelOne("qG",qb);
		qmAry[2]=new QuatModelOne("qX",new Quat4d(1,0,0,0));
		qmAry[3]=new QuatModelOne("qY",new Quat4d(0,1,0,0));
		qmAry[4]=new QuatModelOne("qZ",new Quat4d(0,0,1,0));
		qmAry[5]=new QuatModelOne("qW",new Quat4d(0,0,0,1));
		qmAry[6]=new QuatModelOne("qXW",new Quat4d(1,0,0,1));
		qmAry[7]=new QuatModelOne("q0");
		
		
		QuatModelOne.printQuatModelOneAry(qmAry);

    	
		System.out.print("\nEnter Quaternion ID to be search: ");
		String id=console.readLine();		
		//BinarySearchTest(qmAry,id); // qmAry should be sorted before binary search
		LinearSearchTest(qmAry,id);

    }
    
    public static void BinarySearchTest(QuatModelOne[] qmAry,String id) 
    {
 		Comparable v = new QuatModelOne(id);
		int j = SearchUtil.bsearch(qmAry, v);
		if (j != -1)
		System.out.println("Applied Binary Search>>Found at Index "+j+" position " + (j+1));
		else
		System.out.println("Applied Binary Search>>Not found");    	
    }
    
    public static void LinearSearchTest(QuatModelOne[] qmAry,String id)
    {
		
		int j = QuatModelOne.lsearch(qmAry,id);
		if (j != -1)
		{
			System.out.println("Applied Linear Search>>Found at Index "+j+" position " + (j+1));
			System.out.println(qmAry[j]);
		}
		
		else
		System.out.println("Applied Linear Search>>Not found");    	
    }
}