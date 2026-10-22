
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;

public class GraphicsObjectByRadioButtons extends JFrame {

    public static final int FW = 800;
    public static final int FH = 600;

    private static int MAX_SHAPES = 10;
    private Shape shapeAry[] = new Shape[MAX_SHAPES];
    private static int shapeCount = 0;

    Point startDrag;
    Point endDrag;

    private Line2D.Double line;

    private Polygon poly = new Polygon();

    private static final JRadioButton[] radioButton = new JRadioButton[4];
    private static final String[] sizeStr = {"Line", "Rectangle", "Ellipse", "Polygon"};

    public static void main(String[] args) {
        GraphicsObjectByRadioButtons gui = new GraphicsObjectByRadioButtons();
    }

    public GraphicsObjectByRadioButtons() {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Draw Graphics Objects");
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        PaintPanel paintPanelObj = new PaintPanel(FW, FH);
        add(paintPanelObj, BorderLayout.CENTER);

        JPanel chooseShapePanel = new JPanel();
        chooseShapePanel.setBackground(Color.WHITE);
        chooseShapePanel.setLayout(new GridLayout(sizeStr.length, 1));

        chooseShapePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Shapes"));

        //Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();

        //Create the radio buttons.
        for (int i = 0; i < sizeStr.length; i++) {
            radioButton[i] = new JRadioButton(sizeStr[i]);
            bgroup.add(radioButton[i]);
            chooseShapePanel.add(radioButton[i]);
        }
        radioButton[3].setSelected(true); // default selection 

        add(chooseShapePanel, BorderLayout.WEST);
        setVisible(true);
        pack();
    }

    private class PaintPanel extends JPanel {

        private int PW; // panel-width
        private int PH; // panel-height

        public PaintPanel(int W, int H) {
            PW = W;
            PH = H;
            setPreferredSize(new Dimension(PW, PH)); // set width & height of panel 
            setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(), "Canvas"));

            MouseClickListener listener = new MouseClickListener();
            addMouseListener(listener);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setStroke(new BasicStroke(2f));
            g2.setColor(Color.yellow);
            g2.drawLine(0, 0, PW, PH);

            if (shapeCount == MAX_SHAPES) {
                shapeCount = 0;
            }

            g2.setColor(Color.blue);
            if (radioButton[0].isSelected()) {
                makeLine(g2);
            } else if (radioButton[1].isSelected()) {
                makeRectangle(g2);
            } else if (radioButton[2].isSelected()) {
                makeEllipse(g2);
            } else if (radioButton[3].isSelected()) {
                addPointsInPoly(g2);
            } else {

            }

            /**
             * Handling the case when polygon is selected and some points are
             * added to it. After that some other object(e.g, line, rectangle)
             * is selected. The do following: 1) Create polygon from the
             * previously selected points 2) Reset polygon object, so that next
             * time when it is selected then a new polygon object shall be
             * created
             *
             */
            if (radioButton[0].isSelected() || radioButton[1].isSelected()
                    || radioButton[2].isSelected()) {
                if (poly.npoints > 0) {
                    shapeAry[shapeCount] = poly;
                    shapeCount++;
                    poly = new Polygon();
                }

            }

            // draw all the shapes stored in the shape array
            if (shapeCount > 0) {
                for (int k = 0; k < shapeCount; k++) {
                    g2.draw(shapeAry[k]);
                }
            }
        }

        public void makeLine(Graphics2D g2) {
            if (startDrag != null && endDrag != null) {
                shapeAry[shapeCount] = new Line2D.Double(startDrag, endDrag);
                shapeCount++;
            }
        }

        public void makeRectangle(Graphics2D g2) {
            if (startDrag != null && endDrag != null) {
                int x = (startDrag.x < endDrag.x) ? startDrag.x : endDrag.x;
                int y = (startDrag.y < endDrag.y) ? startDrag.y : endDrag.y;
                int width = Math.abs(endDrag.x - startDrag.x);
                int height = Math.abs(endDrag.y - startDrag.y);
                shapeAry[shapeCount] = new Rectangle2D.Double(x, y, width, height);
                shapeCount++;
            }
        }

        public void makeEllipse(Graphics2D g2) {
            if (startDrag != null && endDrag != null) {
                int x = (startDrag.x < endDrag.x) ? startDrag.x : endDrag.x;
                int y = (startDrag.y < endDrag.y) ? startDrag.y : endDrag.y;
                int width = Math.abs(endDrag.x - startDrag.x);
                int height = Math.abs(endDrag.y - startDrag.y);
                shapeAry[shapeCount] = new Ellipse2D.Double(x, y, width, height);
                shapeCount++;
            }
        }

        public void addPointsInPoly(Graphics2D g2) {
            if (endDrag != null) {
                
                int x = (int) endDrag.x;
                int y = (int) endDrag.y;                
                
                // draw each point of mouse release	
                line = new Line2D.Double(x, y, x, y);
                g2.draw(line);

                // add points in polygon and draw it
                poly.addPoint(x, y);
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
