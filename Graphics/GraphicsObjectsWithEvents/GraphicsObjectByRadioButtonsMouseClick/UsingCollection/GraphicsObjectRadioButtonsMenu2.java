
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.util.*;

public class GraphicsObjectRadioButtonsMenu2 extends JFrame {

    private static final int FW = 800;
    private static final int FH = 600;

    private Point startDrag;
    private Point endDrag;
    private Polygon poly = new Polygon();

    private static final JRadioButton[] radioButton = new JRadioButton[5];
    private static final String[] radioButtonStr = {"Line", "Rectangle", "Ellipse", "Polygon", "Clear"};

    public static void main(String[] args) {
        new GraphicsObjectRadioButtonsMenu2();
    }

    public GraphicsObjectRadioButtonsMenu2() {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Draw Graphics Objects");
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        PaintPanel paintPanelObj = new PaintPanel(FW, FH);

        JPanel chooseShapePanel = new JPanel();
        //chooseShapePanel.setBackground(Color.WHITE);
        chooseShapePanel.setLayout(new GridLayout(radioButtonStr.length, 1));
        chooseShapePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Shapes"));

        //Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();

        //Create the radio buttons.
        for (int i = 0; i < radioButtonStr.length; i++) {
            radioButton[i] = new JRadioButton(radioButtonStr[i]);
            bgroup.add(radioButton[i]);
            chooseShapePanel.add(radioButton[i]);
        }
        radioButton[0].setSelected(true); // default selection 

        add(paintPanelObj, BorderLayout.CENTER);
        add(chooseShapePanel, BorderLayout.WEST);

        setVisible(true);
        pack();
    }

    private class PaintPanel extends JPanel {

        private int PW; // panel-width
        private int PH; // panel-height

        Collection<Shape> shapeList = new ArrayList<Shape>();

        public PaintPanel(int W, int H) {
            PW = W;
            PH = H;
            setPreferredSize(new Dimension(PW, PH)); // set width & height of panel 
            setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(), "Canvas"));

            addMouseListener(new MouseClickListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.drawLine(0, 0, PW, PH);

            g2.setStroke(new BasicStroke(2f));
            g2.setColor(Color.red);

            g2.setColor(Color.blue);

            if (radioButton[0].isSelected()) {
                makeLine(g2);
            } else if (radioButton[1].isSelected()) {
                makeRectangle(g2);
            } else if (radioButton[2].isSelected()) {
                makeEllipse(g2);
            } else if (radioButton[3].isSelected()) {
                addPointsInPoly(g2);
            } else if (radioButton[4].isSelected()) {
                shapeList.removeAll(shapeList);
                revalidate();
                repaint();
            }

            /**
             * Handling the situation when initially polygon is selected and
             * some points are added to it. After that some other object(e.g,
             * line, rectangle) is selected. The do following: 1) Create polygon
             * from the previously selected points 2) Reset polygon object, so
             * that next time when it is selected then a new polygon object
             * shall be created. There should be atleast two points in polygon
             * to store in the collection
             */
            if (!radioButton[3].isSelected()) {
                if (poly.npoints > 1) {
                    shapeList.add(poly);
                    poly = new Polygon(); //reset polygon object
                }

            }
            


            // draw all the shapes stored in the collection
            Iterator itr = shapeList.iterator();
            while (itr.hasNext()) {
                g2.draw((Shape) itr.next());
            }

            // reset
            startDrag = null;
            endDrag = null;

        }

        public void makeLine(Graphics2D g2) {
            if (startDrag != null && endDrag != null) {
                shapeList.add(new Line2D.Double(startDrag, endDrag));
            }
        }

        public void makeRectangle(Graphics2D g2) {
            if (startDrag != null && endDrag != null) {
                int x = (startDrag.x < endDrag.x) ? startDrag.x : endDrag.x;
                int y = (startDrag.y < endDrag.y) ? startDrag.y : endDrag.y;
                int width = Math.abs(endDrag.x - startDrag.x);
                int height = Math.abs(endDrag.y - startDrag.y);
                shapeList.add(new Rectangle2D.Double(x, y, width, height));
            }
        }

        public void makeEllipse(Graphics2D g2) {
            if (startDrag != null && endDrag != null) {
                int x = (startDrag.x < endDrag.x) ? startDrag.x : endDrag.x;
                int y = (startDrag.y < endDrag.y) ? startDrag.y : endDrag.y;
                int width = Math.abs(endDrag.x - startDrag.x);
                int height = Math.abs(endDrag.y - startDrag.y);
                shapeList.add(new Ellipse2D.Double(x, y, width, height));
            }
        }

        public void addPointsInPoly(Graphics2D g2) {
            if (endDrag != null) {

                // draw each endDrag  point                
                g2.draw(new Line2D.Double(startDrag, endDrag));

                // add points in polygon and draw polygon
                poly.addPoint(endDrag.x, endDrag.y);
                Shape myShape = poly;
                g2.draw(myShape);

            }
        }

    }

    private class MouseClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent event) {
            startDrag = new Point(event.getX(), event.getY());
        }

        public void mouseReleased(MouseEvent event) {
            endDrag = new Point(event.getX(), event.getY());
            repaint();
        }
    }

}
