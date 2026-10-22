
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class RecstLinesByMouseClick_ShapeCollection extends JFrame {

    private static final int FW = 800; // frame width
    private static final int FH = FW; // frame height

    public RecstLinesByMouseClick_ShapeCollection() {

        setLayout(new BorderLayout()); // layout of frame
        setSize(FW, FH);                // set width & height of frame
        setTitle("Rectangles & Lines By Mouse Click");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel panel = new DrawingPanel(FW, FH);
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new RecstLinesByMouseClick_ShapeCollection();
    }
}

class DrawingPanel extends JPanel {

    private static int RW = 200;  // rectangle width
    private static int RH = 100;  // rectangle height

    Collection<Shape> shapeList = new ArrayList<Shape>();

    private static int FW; // panel-width
    private static int FH; // panel-height

    public DrawingPanel(int W, int H) {
        FW = W;
        FH = H;

        setPreferredSize(new Dimension(FW, FH)); // set width & height of panel
        this.setBackground(Color.white);

        // register listener
        MouseClickListener listener = new MouseClickListener();
        addMouseListener(listener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        boolean flagColor = false;

        Iterator itr = shapeList.iterator();
        while (itr.hasNext()) {

            if (flagColor) {
                g2.setColor(Color.red);
            } else {
                g2.setColor(Color.blue);
            }

            // toggle flagColor using NOT operator
            flagColor = !flagColor; 
            g2.draw((Shape) itr.next());
            
        }

    } // End of paintComponent() method

    // inner class to handle mouse events
    private class MouseClickListener extends MouseAdapter {
    	
       // starting coordinate (x,y) of line 
	    private int lineX1 = 0;
    	private int lineY1 = 0;

        public void mouseClicked(MouseEvent event) {
            int mouseX = event.getX();
            int mouseY = event.getY();

            // add rectangle to shapeList
            shapeList.add(new Rectangle2D.Double(mouseX, mouseY, RW, RH));

            // add line to shapeList
            shapeList.add(new Line2D.Double(lineX1, lineY1, mouseX, mouseY));
            lineX1 = mouseX;
            lineY1 = mouseY;

            System.out.println("mouseX, mouseY = " + mouseX + "," + mouseY);

            repaint();
        }
    }

}
