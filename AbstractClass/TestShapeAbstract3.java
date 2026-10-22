abstract class Shape{
	public abstract double area();
	private int x;
	private int y;
	
	public Shape (int x , int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}	
	
	public String toString(){
    	return "("+x+", "+y+")" ;    	
    }		
}

class Circle extends Shape{
	private double radius;
	
	public Circle(int x, int y, double r){
		super(x,y);
		radius=r;
	}
	
	public double area(){
		return 3.142*radius*radius; 
	}
	
	public String toString(){
		return super.toString()+", "+"Radius="+radius;    	
    }
}

class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle (int x, int y,double w, double h){
		super(x,y);
		width=w;
		height =h;
	}
	
	public double area(){
		return width*height; 
	}
	
	public String toString(){
		return super.toString()+", "+"Width="+width+", "+"Height="+height;    	    		
    }

}

public class TestShapeAbstract3{
	public static void main(String[] args){
		
		Shape[] list = new Shape[2]; 
		list[0] = new Circle(50,60,2); 
    	list[1] = new Rectangle(40,30,4,5); 
     	     	
     	for (int i = 0; i <list.length ; i ++){
     		System.out.println(list[i]);
     		System.out.println("Area="+list[i].area());
     		System.out.println("--------------------");
     	} 
	}
	
}
