import java.io.*;
import javax.vecmath.Quat4d;
public class TestQuaternion1
{
	public static void main(String[ ] args) throws IOException
	{
		//in java Quat4d the quaternion is always normalized.
	    /*
	    BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
	    System.out.println("Enter year :") ;
	    String  line  =  stdin.readLine( ) ;
	    int year=Integer.parseInt(line);
	    */
	    double x=4; 
	    double y=5;
	    double z=3;
	    double w=6;
	    
	    double Norm=Math.sqrt(x*x+y*y+z*z+w*w);
	    System.out.println(Norm);
	    System.out.println(x/Norm+" "+y/Norm+" "+z/Norm+" "+w/Norm);
	    
	    Quat4d q1=new Quat4d(x, y, z, w); //x,y,z,w
	    Quat4d q2=new Quat4d(2, 4, 1, 5);
	    Quat4d q12=new Quat4d();
	    
	    q12.mul(q1,q2); 
	    
	    //System.out.println(q1.w); 
	    System.out.println(q1);
	    //System.out.println(q12);
	    
	    Quat4d qc=new Quat4d();
	    Quat4d qi=new Quat4d();
	    Quat4d qn=new Quat4d();
	    
	    qc.conjugate(q1);
	    qi.inverse(q1); 
	    qn.normalize(q1);

	    System.out.println(qc);
	    System.out.println(qi);
	    System.out.println(qn);
	    
	    
	    
	}
}

