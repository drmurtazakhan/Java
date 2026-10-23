package mak2000.transformation;
import javax.swing.*;
import javax.vecmath.*;
import java.util.*;

public class TransformUtil
{
	
	public static void main(String[] args)
	{

		test_dcmDeg();
	}
	
	public static void test_dcmDeg()
	{
		double xDeg=10; 
		double yDeg=20; 
		double zDeg=30; 
		//System.out.println(dcmDeg(xDeg,yDeg,zDeg, "ypy"));
		System.out.println(dcmDeg(xDeg,yDeg,zDeg, "rpy"));
		System.out.println(dcmDeg(xDeg,yDeg,zDeg, "ryp"));
		System.out.println(dcmDeg(xDeg,yDeg,zDeg, "pry"));
		System.out.println(dcmDeg(xDeg,yDeg,zDeg, "pyr"));
		System.out.println(dcmDeg(xDeg,yDeg,zDeg, "yrp"));
		System.out.println(dcmDeg(xDeg,yDeg,zDeg, "ypr"));
		
	}
	
	/**
	 * computes discreate consine matrix from given rotation angles (in radians)
	 * around x(roll), y(pitch) and z(yaw) axis in the given order
	 */
	public static Matrix3d dcmRad(double xRad,double yRad,double zRad, String order)
	{
		Matrix3d rM=new Matrix3d(1, 0              ,  0             ,
	                             0, Math.cos(xRad) ,  Math.sin(xRad),
	                             0, -Math.sin(xRad),  Math.cos(xRad));
	                             
		Matrix3d pM=new Matrix3d(Math.cos(yRad), 0 ,  -Math.sin(yRad),
	                             0             , 1 ,  0              ,
	                             Math.sin(yRad), 0 ,  Math.cos(yRad));
  
  
  		Matrix3d yM=new Matrix3d(Math.cos(zRad) , Math.sin(zRad) ,  0,
	                             -Math.sin(zRad), Math.cos(zRad) ,  0,
	                             0              , 0              ,  1);
  	    
  	    Matrix3d DCM=new Matrix3d(); 
  	    
		if( order.equalsIgnoreCase("xyz") || order.equalsIgnoreCase("rpy") )
		{
		    //DCM=(yM*pM)*rM;  
      	    DCM.mul(yM,pM);
	  	    DCM.mul(rM);
		}

		else if( order.equalsIgnoreCase("xzy") || order.equalsIgnoreCase("ryp") )
		{
			//DCM=(pM*yM)*rM;
    	    DCM.mul(pM,yM);
	  	    DCM.mul(rM);			
		}
		    
		else if( order.equalsIgnoreCase("yxz") || order.equalsIgnoreCase("pry") )
		{
			//DCM=(yM*rM)*pM;
 	  	    DCM.mul(yM,rM);
	  	    DCM.mul(pM);			
		}
		    
		else if( order.equalsIgnoreCase("yzx") || order.equalsIgnoreCase("pyr") )
		{
			//DCM=(rM*yM)*pM;
 	  	    DCM.mul(rM,yM);
	  	    DCM.mul(pM);			
		}
		    
		else if( order.equalsIgnoreCase("zxy") || order.equalsIgnoreCase("yrp") )
		{
			//DCM=(pM*rM)*yM;
 	  	    DCM.mul(pM,rM);
	  	    DCM.mul(yM);
		}
		    
		else if( order.equalsIgnoreCase("zyx") || order.equalsIgnoreCase("ypr") )
		{
			//DCM=(rM*pM)*yM;
 	  	    DCM.mul(rM,pM);
	  	    DCM.mul(yM);			
		}
    
		else
		{
			JOptionPane jp = new JOptionPane();
			jp.showMessageDialog(jp,  "Could not recognize the order of rotation: "+order);
		}			    
		return DCM;
	}
	
	/**
	 * computes discreate consine matrix from given rotation angles (in degrees)
	 * around x,y and z axis in the given order
	 */	
	public static Matrix3d dcmDeg(double xDeg,double yDeg,double zDeg, String order)
	{
		return dcmRad(Math.toRadians(xDeg), Math.toRadians(yDeg),Math.toRadians(zDeg),order);
	}	
	
}