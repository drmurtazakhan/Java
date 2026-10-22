import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PieChartTest1 {
  public static void main(String[] args) {
     PieChart pie = new PieChart();
     pie.setTitle("Simple Pie Chart Drwaing");
     pie.setSize(400, 400);
     pie.show();
   } // End of main method
} // End of class PieChartTest1

class PieChart extends Frame {  
  public void paint(Graphics g) {  	
    g.setColor(Color.red);
    g.fillArc(50,50,100,100,0,90);  
    g.setColor(Color.blue);
    g.fillArc(50,50,100,100,90,135);    
    g.setColor(Color.yellow);
    g.fillArc(50,50,100,100,135,180);                
    g.setColor(Color.green);
    g.fillArc(50,50,100,100,0,0);                
    //g.setColor(Color.yellow);
    //g.fillArc(50,50,100,100,287,360);                
  } // End of paint() method
} // End of PieChart class