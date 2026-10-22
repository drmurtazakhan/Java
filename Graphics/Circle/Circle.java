// Exercise #4
public class Circle
{	private double radius; // instance varibles
    private double x;
    private double y;
    public Circle(double x1, double y1, double radius1)
    { 	x=x1;
    	y=y1;
    	radius=radius1;
    }
    public double area()
    {  	return Math.PI*radius*radius;
    }  
    public double circum()
    {  	return 2*Math.PI*radius;
    }
    public double distance(Circle c)
    {
    	double d2=Math.pow(this.x-c.x,2)+Math.pow(this.y-c.y,2);
    	double d=Math.sqrt(d2);
    	return d;
    }
    public boolean intersect(Circle c)
    {
    	double dist=this.distance(c);
    	if (dist<=(this.radius+c.radius) )
    	return true;
    	else 
    	return false;
    }
    
    
    
}