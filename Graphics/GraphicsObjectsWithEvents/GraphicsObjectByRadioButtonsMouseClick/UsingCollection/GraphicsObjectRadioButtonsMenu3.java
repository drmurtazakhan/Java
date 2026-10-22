
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.util.*;

public class GraphicsObjectRadioButtonsMenu3 extends JFrame implements ActionListener {

    private static final int FW = 800;
    private static final int FH = 600;

    private Point p1;
    private Point p2;
    private Polygon poly = new Polygon();

    Collection<Shape> shapeList = new ArrayList<Shape>();

    private static final JButton clearBtn = new JButton("Clear");
    private static final JButton colorBtn = new JButton("Choose Color");

    private static final JRadioButton[] radioButton = new JRadioButton[4];
    private static final String[] radioButtonStr = {"Line", "Rectangle", "Ellipse", "Polygon"};

    public static void main(String[] args) {
        new GraphicsObjectRadioButtonsMenu3();
    }

    public GraphicsObjectRadioButtonsMenu3() {
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

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1, 2));
        southPanel.add(clearBtn);
        southPanel.add(colorBtn);

        clearBtn.addActionListener(this);

        //Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();

        //Create the radio buttons.
        for (int i = 0; i < radioButtonStr.length; i++) {
            radioButton[i] = new JRadioButton(radioButtonStr[i]);
            bgroup.add(radioButton[i]);
            chooseShapePanel.add(radioButton[i]);
            radioButton[i].addActionListener(this);
        }
        radioButton[0].setSelected(true); // default selection 

        add(paintPanelObj, BorderLayout.CENTER);
        add(chooseShapePanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent event) {
        String eventString = event.getActionCommand();

        if (event.getSource() == clearBtn) {
            p1 = null;
            p2 = null;
            poly = new Polygon();
            shapeList.removeAll(shapeList);
            revalidate();
            repaint();

        }
        if (event.getSource() == colorBtn) {

        }

        
        /** 
         * -------------------------------------------------------------------
         * Handling the situation when initially polygon is selected and some
         * points are added to it. After that some other object(e.g, line,
         * rectangle) is selected. The do following: 1) Create polygon from the
         * previously selected points 2) Reset polygon object, so that next time
         * when it is selected then a new polygon object shall be created. There
         * should be atleast two points in polygon to store in the collection
         */
        // a loop to check all radio buttons except polygon 
        for (int i = 0; i < radioButton.length - 1; i++) {
            if (event.getSource() == radioButton[i]) {

                revalidate();
                repaint();

                if (poly.npoints > 1) {
                    shapeList.add(poly);
                    poly = new Polygon(); //reset polygon object
                }
                p1 = null;
                p2 = null;

            }
        }
        /* ------------------------------------------------------------------- */

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
            setBackground(Color.WHITE);
            addMouseListener(new MouseClickListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            //g2.drawLine(0, 0, PW, PH);
            g2.setStroke(new BasicStroke(2f));
            g2.setColor(Color.red);

            g2.setColor(Color.blue);

            if (radioButton[0].isSelected()) {
                makeLine(g2);
                //resetShapes();

            } else if (radioButton[1].isSelected()) {
                makeRectangle(g2);
                //resetShapes();

            } else if (radioButton[2].isSelected()) {
                makeEllipse(g2);
                //resetShapes();

            } else if (radioButton[3].isSelected()) {
                addPointsInPoly(g2);
            }

            // draw all the shapes stored in the collection
            Iterator itr = shapeList.iterator();
            while (itr.hasNext()) {
                g2.draw((Shape) itr.next());
            }

            
        }

        public void makeLine(Graphics2D g2) {
            if (p1 != null && p2 != null) {
                shapeList.add(new Line2D.Double(p1, p2));
            }
        }

        public void makeRectangle(Graphics2D g2) {
            if (p1 != null && p2 != null) {
                int x = (p1.x < p2.x) ? p1.x : p2.x;
                int y = (p1.y < p2.y) ? p1.y : p2.y;
                int width = Math.abs(p2.x - p1.x);
                int height = Math.abs(p2.y - p1.y);
                shapeList.add(new Rectangle2D.Double(x, y, width, height));
            }
        }

        public void makeEllipse(Graphics2D g2) {
            if (p1 != null && p2 != null) {
                int x = (p1.x < p2.x) ? p1.x : p2.x;
                int y = (p1.y < p2.y) ? p1.y : p2.y;
                int width = Math.abs(p2.x - p1.x);
                int height = Math.abs(p2.y - p1.y);
                shapeList.add(new Ellipse2D.Double(x, y, width, height));
            }
        }

        public void addPointsInPoly(Graphics2D g2) {
            if (p1 != null && p2 != null) {

                // draw each p2  point                
                g2.draw(new Line2D.Double(p1, p2));

                // add points in polygon and draw polygon
                poly.addPoint(p2.x, p2.y);
                Shape myShape = poly;
                g2.draw(myShape);

            }
        }

    }

    private class MouseClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent event) {
            p1 = new Point(event.getX(), event.getY());
        }

        public void mouseReleased(MouseEvent event) {
            p2 = new Point(event.getX(), event.getY());
            repaint();
        }
    }

}
