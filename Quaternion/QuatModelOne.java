package mak2000.quaternion;
import mak2000.searching.*;
import javax.vecmath.Quat4d;
import java.text.NumberFormat;
public class QuatModelOne implements Comparable
{
	private Quat4d q;
	private String id;
	
	public QuatModelOne(String id)
	{
		this(id, new Quat4d()); //x=y=z=w=0
	}
	
	public QuatModelOne(String id, Quat4d q)
	{
		this.id=id;
		this.q=q;
	}
	
	public String get_id()
	{
		return id;
	}
	
	public Quat4d get_q()
	{
		return q;
	}

	public int compareTo(Object other)
	{
		// comparing quaternions based on id (lexicographically)
		QuatModelOne qn = (QuatModelOne) other;		
        if ( id.compareTo(qn.id) < 0 )
        return -1;
        else if ( id.compareTo(qn.id) > 0 )
        return 1;
        else
        return 0;                   
    }
    public String toString()
    {
    	NumberFormat formater = NumberFormat.getNumberInstance();
        formater.setMaximumFractionDigits(4);
        formater.setMinimumFractionDigits(4);
     	
    	return "<id,x,y,z,w> "+"<"+
    	id+",\t"+
    	formater.format(q.x)+",\t"+
    	formater.format(q.y)+",\t"+
    	formater.format(q.z)+",\t"+
    	formater.format(q.w)+
    	">";	
    }
    
    /** Create array of QuatModelOne objects from array of 
     *  Quat4d Objects. ids of objects is automatic assigned*/
    public static QuatModelOne[] createObjsFromQuat4dAry(Quat4d[] qAry)
    {
    	QuatModelOne[] qmAry=new QuatModelOne[qAry.length];
    	for (int i = 0; i < qmAry.length; i++)
    	{
    		qmAry[i]=new QuatModelOne("q"+(i+1),qAry[i]);
    	}
    	return qmAry;
    }
    
    public static void printQuatModelOneAry(QuatModelOne[] qmAry)
    {
    	for (int i = 0; i < qmAry.length; i++)
		System.out.println(qmAry[i]);

    }
    
    public static int lsearch(QuatModelOne[] qmAry, String id) 
    {
		Comparable v = new QuatModelOne(id);
		return SearchUtil.lsearch(qmAry, v);
    }  
      
	public static void main(String[] args)
	{	         		
 
    }
}