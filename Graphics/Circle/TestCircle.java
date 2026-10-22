// Exercise #2
public class TestCircle
{	public static void main(String args[])
	{ 
	  Circle c1= new Circle(4,5,10);
	  Circle c2= new Circle(6,7,5);
	  double area1=c1.area();  // to find area of circle c1
	  System.out.println(area1);
	  
	  double curcum1=c1.circum(); // to find circumfrance of circle c1
	  System.out.println(curcum1);
	  
	  double area2=c2.area(); // to find area of circle c2
	  System.out.println(area2);
	  
	  double curcum2=c2.circum(); // to find circumfrance of circle c2
	  System.out.println(curcum2);
	  
	  double dist=c2.distance(c1); // distance b/w two circles 
	  System.out.println(dist);
	  
	  boolean flag=c2.intersect(c1); // to check intersection
	  System.out.println(flag);
	  	  
	}	
}