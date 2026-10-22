import java.io.*;
import java.awt.*;
public class TestArc
{	public static void main(String args[])
	{ 
	  
	  //Circle c1= new Circle(4,5,10);
	   //System.out.println(area1);  
	  	  
	}
	void arc8(Graphics g, int r)
	{  int x = 0, y = r, u = 1, v = 2 * r - 1, e = 0;
	   while (x <= y)
	   {  
	   	  System.out.println("x= "+x+"y= "+y);
	   	  putPixel(g, x, y);
	      x++; e += u; u += 2;
	      if (v < 2 * e){y--; e -= v; v -= 2;}
	   }
	}

    // draw pixe at (x,y)
	void putPixel(Graphics g, int x, int y)
	{  g.drawLine(x, y, x, y);
	}
	
}