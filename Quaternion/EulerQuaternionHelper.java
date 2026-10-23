package mak2000.quaternion;
import javax.vecmath.Quat4d;

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** @ Copyright M A Khan
*   khan_goodluck@yahoo.com
*/


public class EulerQuaternionHelper
{  
   

   public static void main(String[] args) throws IOException
   {
	Quat4d q1=new Quat4d(0.4317,-0.4817,0.4739,-0.5975);
	Quat4d q2=new Quat4d(0.4317,-0.4817,0.4739,-0.5975);
	Quat4d q12=new Quat4d();
	
	System.out.println(q1);
	q12.interpolate(q1,q2,2.3);
	System.out.println(q1);
	
	//q12.interpolate(q1,q2,2.3);
	//q12=EulerQuaternionHelper.add(q1,q2);
	q12.add(q1,q2);
	System.out.println(q12);
	Quat4d qa=EulerQuaternionHelper.eulerToQuat(0.3,0.35,0.15,"XYZ");
	System.out.println(qa);
	
	//String fname="data2.txt";
	//String fnameout="out"+fname;
	//e2qRadFile(fname,fnameout);
	/*
	//--------------------------------------------------
	// angles in in degree 
	double rx=10;
	double ry=20;
	double rz=30; 	
	// converting degree to radians
    rx=Math.toRadians(rx);
	ry=Math.toRadians(ry);
	rz=Math.toRadians(rz);		
	System.out.println(eulerToQuat(rx,ry,rz,"xyz"));	
	System.out.println(eulerToQuat(rx,ry,rz,"xzy"));	
	System.out.println(eulerToQuat(rx,ry,rz,"yxz"));	
	System.out.println(eulerToQuat(rx,ry,rz,"yzx"));	
	System.out.println(eulerToQuat(rx,ry,rz,"zxy"));	
	System.out.println(eulerToQuat(rx,ry,rz,"zyx"));
	//--------------------------------------------------
	*/

   }
   
   public static void e2qRadFile(String fname,String fnameout) throws IOException
   {
   	 NumberFormat formater = NumberFormat.getNumberInstance();
     formater.setMaximumFractionDigits(4);
     formater.setMinimumFractionDigits(4);
     String sep="\t";
   	 String order="";
	 double rx=-1;
	 double ry=-1;
	 double rz=-1;

   	 String[] strAry1=fillstrAryFromFile(fname); //euler 
	 String[] strAry2=fillstrAryFromFile(fname); //euler+quat
	 
	 
	 
	 //checking three or four tokens
	 StringTokenizer tok1 = new StringTokenizer(strAry1[1]);
	 int tokCount=tok1.countTokens();
 	 if (tokCount<4)
 	 {
 		order=new PopupOrderOfRot().getOrder();
 	 }
	 
		for (int i=0; i<strAry1.length; i++)
		{
			StringTokenizer tok = new StringTokenizer(strAry1[i]);
	    	while( tok.hasMoreTokens( ) )
	    	{
	    	 	rx=Double.parseDouble(tok.nextToken());
	    	 	ry=Double.parseDouble(tok.nextToken());
	    	 	rz=Double.parseDouble(tok.nextToken());
	    	 	if (tokCount>=4)
	    	 	{
	    	 		order=tok.nextToken();
	    	 	}
	    	}
	    	Quat4d q=eulerToQuat(rx,ry,rz,order);
	    	strAry2[i]=formater.format(rx)+sep+formater.format(ry)+sep+formater.format(rz)+sep+
	    	           formater.format(q.w)+sep+formater.format(q.x)+sep+
	    	           formater.format(q.y)+sep+formater.format(q.z)+sep+order;

		}
		writeStringAryToFile(fnameout,strAry2);   	
   }
   
   public static Quat4d q12Intrp(Quat4d q1, Quat4d q2, double alpha)
   {
   	      Quat4d qIntrp=new Quat4d();
          qIntrp.interpolate(q1,q2,alpha);
          return qIntrp;
   		
   }
   
   public static Quat4d eulerToQuat(double rx,double ry,double rz,String order)
   {
   	/*
   	 rx , ry & rz should be in radians
	 rx, ry, rz are rotation around x,y & z axis
	 order of rotations should be passed in 'order' parameter as string e.g. 'xyz' or
	 'xzy' etc.
	 Quaterion is expressed as Q=[x y z w]
	 w is scalar component of quaternion
	 x,y,z are vector components of quaternion. For example q=xi+yj+zk+w
	*/

	
	Quat4d Qx=new Quat4d(Math.sin(rx/2),0,0,Math.cos(rx/2.0)); //x,y,z,w
	Quat4d Qy=new Quat4d(0,Math.sin(ry/2),0,Math.cos(ry/2.0));
	Quat4d Qz=new Quat4d(0,0,Math.sin(rz/2),Math.cos(rz/2.0));
	
	Quat4d Q1=new Quat4d();
	Quat4d Q2=new Quat4d();	
	
	if(order.equalsIgnoreCase("xyz"))  
	{	
	    Q1.mul(Qy,Qz);  
	    Q2.mul(Qx,Q1);  		
	}
	    
	else if(order.equalsIgnoreCase("xzy")) 
	{
	    Q1.mul(Qz,Qy);  
	    Q2.mul(Qx,Q1);		
	} 
	    
	else if(order.equalsIgnoreCase("yxz"))
	{
	    Q1.mul(Qx,Qz);  
	    Q2.mul(Qy,Q1);		
	}
	    
	else if(order.equalsIgnoreCase("yzx"))
	{
	    Q1.mul(Qz,Qx);  
	    Q2.mul(Qy,Q1);		
	}
	    
	else if(order.equalsIgnoreCase("zxy"))
	{
	    Q1.mul(Qx,Qy);  
	    Q2.mul(Qz,Q1);		
	}
	    
	else if(order.equalsIgnoreCase("zyx")) 
	{
	    Q1.mul(Qy,Qx);  
	    Q2.mul(Qz,Q1); 		
	}
	else
	{
		System.out.println("could not recognized");
	}
	
	    return Q2;
   }
   
       public static String[] fillstrAryFromFile(String fname) throws IOException {
        BufferedReader  fin = new BufferedReader(new FileReader(fname));
    	Vector vect=new Vector(1000,100);
    	String input=fin.readLine();
    	while (input!= null)
    	{
            vect.add(input);
            input=fin.readLine();    	
        }        
        fin.close();
    	vect.trimToSize();
		String[] strAry=new String[vect.size()];
		vect.copyInto(strAry);
		return strAry;
    }
    
    public static void writeStringAryToFile(String fname,String[] strAry) throws IOException
    { 
    	// overwrite
    	PrintWriter  fout = new PrintWriter(new FileWriter(fname,false));
    	for (int i=0; i<strAry.length; i++)
    	fout.println(strAry[i]);
    	fout.close();
    	
    }    
        
}


class PopupOrderOfRot extends JFrame
	{	
	    private String order;
		ImageIcon icon = new ImageIcon("eulerquat.jpeg");
		public PopupOrderOfRot()
		{
			JOptionPane jp = new JOptionPane();
		    Object[] possibilities = {"XYZ","XZY","YXZ","YZX","ZXY","ZYX"};
			order = (String)JOptionPane.showInputDialog(
	                    jp,
                        "Select Order of Rotation:\n"
                        + "\"X is Roll, Y is Pitch, Z is Yaw\"",
                         "Customized Dialog",
	                    JOptionPane.PLAIN_MESSAGE,
	                    icon,
	                    possibilities,
	                    "XYZ");	        
		    
		}    
	   public String getOrder()
	   {
	   		return order;
	   }
	   
	} // end inner class



