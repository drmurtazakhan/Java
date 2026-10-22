
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class RectsLinesByMouseClickStoreInShapeArray extends JFrame {

    private static final int FW = 800; // frame width
    private static final int FH = FW; // frame height

    public RectsLinesByMouseClickStoreInShapeArray() {

        setLayout(new BorderLayout()); // layout of frame
        setSize(FW, FH);                // set width & height of frame
        setTitle("Rectangles & Lines By Mouse Click");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapesDrawingPanel panel = new ShapesDrawingPanel(FW, FH);
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new RectsLinesByMouseClickStoreInShapeArray();
    }
}

class ShapesDrawingPanel extends JPanel {

    private static int RW = 200;  // rectangle width
    private static int RH = 100;  // rectangle height
    
    private static int MAX_SHAPES = 8;
    private Shape shapeAry[] = new Shape[MAX_SHAPES];
    private static int shapeCount = 0;

    private static int FW; // panel-width
    private static int FH; // panel-height

    public ShapesDrawingPanel(int W, int H) {
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
        g2.setColor(Color.blue);

        if (shapeCount > 0) {
            for (int k = 0; k < shapeCount; k++) {

                if (k % 2 == 0) {
                    g2.setColor(Color.blue);
                } else {
                    g2.setColor(Color.red);
                }

                g2.draw(shapeAry[k]);
            }
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

            if (shapeCount == MAX_SHAPES) {
                shapeCount = 0;
                lineX1 = 0;
                lineY1 = 0;
            }

            shapeAry[shapeCount] = new Rectangle2D.Double(mouseX, mouseY, RW, RH);
            shapeCount++;

            shapeAry[shapeCount] = new Line2D.Double(lineX1, lineY1, mouseX, mouseY);
            shapeCount++;

            lineX1 = mouseX;
            lineY1 = mouseY;

            System.out.println("shapeCount = " + shapeCount);
            System.out.println("mouseX, mouseY = " + mouseX + "," + mouseY);

            repaint();
        }
    }

}
