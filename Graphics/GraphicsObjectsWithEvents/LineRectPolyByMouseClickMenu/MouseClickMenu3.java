import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.io.*;

public class MouseClickMenu3 extends JApplet {
	public static void main(String s[]) {
		JFrame frame = new JFrame();
		frame.setTitle("Mouse Event Handling");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new MouseClickMenu3();
		applet.init();
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
	}

	public void init() {
		JPanel panel = new MyPanel();
		getContentPane().add(panel);
	}
}

class MyPanel extends JPanel {
	private static final int FW = 600;
	private static final int FH =600;
	
	Point startDrag, endDrag;
	
	private Line2D.Double line;
	
	private Rectangle2D.Double rec;
	
	private int x, y, width, height;
	
	private Polygon poly ;
			  
    String itemSelected="";
    
    String colorSelected="";
    
	public MyPanel() {
		setPreferredSize(new Dimension(FW, FH));
		this.setBackground(Color.white);

		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
	
		//draw point, mouse pressed
		if (startDrag != null){
			g2.setStroke(new BasicStroke(10f));
			g2.setPaint(Color.RED);
			line=new Line2D.Double(startDrag, startDrag);
			g2.draw(line);
		}
		
		//draw point, mouse released
		if (endDrag != null){
			g2.setStroke(new BasicStroke(10f));
			g2.setPaint(Color.RED);
			line=new Line2D.Double(endDrag, endDrag);
			g2.draw(line);
		}
		
		g2.setPaint(Color.BLACK);
		g2.setStroke(new BasicStroke(1.5f));
			
		// Line
		if (itemSelected.equals("Line")){
			if (startDrag != null && endDrag != null){
				line=new Line2D.Double(startDrag, endDrag);
				g2.draw(line);
			}						
		}
										
		// Rectangle							
		else if (itemSelected.equals("Rectangle")){
			if (startDrag != null && endDrag != null){				
				x = (startDrag.x < endDrag.x) ? startDrag.x : endDrag.x;
				y = (startDrag.y < endDrag.y) ? startDrag.y : endDrag.y;
				width=Math.abs(endDrag.x-startDrag.x);
				height=Math.abs(endDrag.y-startDrag.y);	
				rec=new Rectangle2D.Double(x, y, width, height);
				g2.draw(rec);
			}						
			
		}
			
		// Polygon	
		else if (itemSelected.equals("Polygon")){
			if (startDrag != null && endDrag != null){
				poly.addPoint((int) startDrag.x, (int) startDrag.y);	
				poly.addPoint((int) endDrag.x, (int) endDrag.y);
				Shape myShape = poly;
				g2.draw(myShape);
				for (int i=0; i < poly.npoints; i++){
					g2.setStroke(new BasicStroke(10f));
			        g2.setPaint(Color.RED);					
					line=new Line2D.Double(poly.xpoints[i], poly.ypoints[i],
					                       poly.xpoints[i], poly.ypoints[i]);					
					g2.draw(line); 
				}
						
			}			
		}
		
	} // end of paintComponent method

    
	// inner class to handle mouse events
	private class MouseClickListener extends MouseAdapter{	
		
   	
		public void mousePressed(MouseEvent event){
          startDrag = new Point(event.getX(), event.getY());
          endDrag = startDrag;
          
			if (event.isPopupTrigger())
				doPop(event);
		}
		
		public void mouseReleased(MouseEvent event){
			endDrag = new Point(event.getX(), event.getY());
			if (event.isPopupTrigger())
				doPop(event);
			repaint();				
		}

		private void doPop(MouseEvent event){
			PopUpDemo menu = new PopUpDemo();
			menu.show(event.getComponent(), event.getX(), event.getY());
			
			poly = new Polygon();
			startDrag = null;
			endDrag = null;
		}

	} // end of MouseClickListener

	class PopUpDemo extends JPopupMenu {
		JMenu [] items = new JMenu [3];
				
		String[] itemNames={"Line", "Rectangle", "Polygon"};
				
		// creating of color sub menu
        JMenu subMenu1=new JMenu("color");
        JMenuItem [] subItems1=new JMenuItem[3];
        String[] menuItems1={"Red", "Green", "Blue"};
             
        //creating of filling sub menu
        JMenu subMenu2=new JMenu("Filling");
        JMenuItem [] subItems2=new JMenuItem[2];
        String[] menuItems2={"Fill","UnFill"};

		public PopUpDemo(){
								
			for(int i=0; i<3; i++){
				items[i]=new JMenu(itemNames[i]);
				add(items[i]);	        		
			}
			
            add(subMenu1);
            for(int x=0; x<subItems1.length; x++){
            	subItems1[x]=new JMenuItem(menuItems1[x]);
            	subMenu1.add(subItems1[x]);	        		
            }
                        

            add(subMenu2);
            for(int m=0; m<subItems2.length; m++){
            	subItems2[m]=new JMenuItem(menuItems2[m]);
            	subMenu2.add(subItems2[m]);	        		
            }
                     

			for(int j=0; j<items.length; ++j)
			{
				items[j].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt)
					{
						JMenuItem currentItem = (JMenuItem) evt.getSource();
						itemSelected = currentItem.getText();
					}
				});
			}            

		}
			
	} // end of PopUpDemo class	

}
