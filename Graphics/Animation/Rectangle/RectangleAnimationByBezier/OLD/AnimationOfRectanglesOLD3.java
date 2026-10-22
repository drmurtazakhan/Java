
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class AnimationOfRectangles extends JFrame {

    private static final int FW = 800; // frame-width
    private static final int FH = 800; // frame-height

    public AnimationOfRectangles() {

        setLayout(new BorderLayout());     // layout of frame
        setSize(FW, FH); // set width & height of frame
        setTitle("Animation of 2D Rectangles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawingPanel panel = new MyDrawingPanel();
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

        new AnimationOfRectangles();
    }

}

class MyDrawingPanel extends JPanel implements Runnable {

    private static final int PANEL_W = 400; // panel width
    private static final int PANEL_H = 400; // panel height

    private static final int RECT_W = PANEL_W / 8; // rectangle width
    private static final int RECT_H = RECT_W;    // rectangle height


    private static Rectangle2D.Double rec1, rec2, rec3, rec4;

    private static final int N = 63;
    
    // points that define top-left corner of four rectangles 
    private static Point A, B, C, D;

    // coordinates of top-left corner of four rectangles
    private static int x1, y1, x2, y2, x3, y3, x4, y4;

    private static int[][] aryABCDA; // 2D array to store aryAB, aryBC, aryCD, aryDA

    // variables to update indices in aryABCDA 
    // these indices will update top-left corner coordates of four rectangles
    private static int k1, k2 , k3, k4;

    Thread mythread;

    public MyDrawingPanel() {
        setPreferredSize(new Dimension(PANEL_W, PANEL_H));
        this.setBackground(Color.white);

        initPoints(); // initialize points
        
        //aryABCDA = pathAry(A, B, C, D); // global path array of four rectangles
        
                
        Object[] arrayObjects = pathAry(A, B, C, D);

        aryABCDA = (int[][]) arrayObjects[0];
        k1 = (int) arrayObjects[1];
        k2 = (int) arrayObjects[2];
        k3 = (int) arrayObjects[3];
        k4 = (int) arrayObjects[4];

        System.out.println("length of aryABCDA is " + aryABCDA.length + " by " + aryABCDA[0].length);

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {

        // animation loop
        boolean flag = true;
        
        // variables to update indices in aryABCDA 
        // these indices will update top-left corner coordates of four rectangles
        //int k1 = 0, k2 = 0, k3 = 0, k4 = 0;

        while (flag) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }

            // anmiate rec1 infinitely
            k1 = k1 % (aryABCDA[0].length);
            x1 = aryABCDA[0][k1];
            y1 = aryABCDA[1][k1];
            k1++;

            // anmiate rec2 infinitely
            k2 = k2 % (aryABCDA[0].length);
            x2 = aryABCDA[0][k2];
            y2 = aryABCDA[1][k2];
            k2++;

            // anmiate rec3 infinitely
            k3 = k3 % (aryABCDA[0].length);
            x3 = aryABCDA[0][k3];
            y3 = aryABCDA[1][k3];
            k3++;

            // anmiate rec4 infinitely
            k4 = k4 % (aryABCDA[0].length);
            x4 = aryABCDA[0][k4];
            y4 = aryABCDA[1][k4];
            k4++;
            
            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        rec1 = new Rectangle2D.Double(x1, y1, RECT_W, RECT_H);
        g2.setColor(Color.red);
        g2.fill(rec1);

        rec2 = new Rectangle2D.Double(x2, y2, RECT_W, RECT_H);
        g2.setColor(Color.green);
        g2.fill(rec2);

        rec3 = new Rectangle2D.Double(x3, y3, RECT_W, RECT_H);
        g2.setColor(Color.blue);
        g2.fill(rec3);

        g2.setColor(Color.yellow);
        rec4 = new Rectangle2D.Double(x4, y4, RECT_W, RECT_H);
        g2.fill(rec4);

    }

   /*
    *initialize points that will define coordinates of top-left corner of four rectangles
    */
    public static void initPoints() {
        A = new Point(0, 0);
        B = new Point(PANEL_W - RECT_W, 0);
        C = new Point(PANEL_W - RECT_W, PANEL_H - RECT_H);
        D = new Point(0, PANEL_H - RECT_H);
    }

    /**
     * Linear Bezier P(t) = (1 - t)*P0 + t*P1
     */
    public static int[][] linearBezier(Point P0, Point P1, int N) {

        int[][] Pxy = new int[2][N + 1];

        double x, y;
        double delta = 1.0 / N;
        double t = 0;

        System.out.println("Linear Bezier");
        DecimalFormat formater1 = new DecimalFormat("0.000");
        // computer n+1 uniform parameterized values b/w 0 and 1
        for (int i = 0; i <= N; i++) {
            t = i * delta;
            x = (1 - t) * P0.getX() + t * P1.getX();
            y = (1 - t) * P0.getY() + t * P1.getY();
            Pxy[0][i] = (int) Math.round(x);  //store x-coordinate
            Pxy[1][i] = (int) Math.round(y);  //store y-coordinate

            //System.out.println("i=" + i + ", " + "t=" + formater1.format(t) + "\t" + "P=" + "(" + Pxy[0][i] + "," + Pxy[1][i] + ")");
        }

        System.out.println("length of Pxy is " + Pxy.length + " by " + Pxy[0].length);

        return Pxy;

    }

    public static int[][] mergeFourArrays(int[][] A, int[][] B, int[][] C, int[][] D) {

        // A, B, C, D are local arrays for each interploation
        
        // number of columns in local array A, B, C, D
        int nA = A[0].length; 
        int nB = B[0].length;
        int nC = C[0].length;
        int nD = D[0].length;
        
        // Create a global array
        int[][] ABCD = new int[2][nA + nB + nC + nD];

        // merge local arrays into global arrays
        int c = 0;
        for (int k = 0; k < nA; k++) {
            ABCD[0][c] = A[0][k];
            ABCD[1][c] = A[1][k];
            c = c + 1;
        }

        for (int k = 0; k < nB; k++) {
            ABCD[0][c] = B[0][k];
            ABCD[1][c] = B[1][k];
            c = c + 1;
        }

        for (int k = 0; k < nC; k++) {
            ABCD[0][c] = C[0][k];
            ABCD[1][c] = C[1][k];
            c = c + 1;
        }

        for (int k = 0; k < nD; k++) {
            ABCD[0][c] = D[0][k];
            ABCD[1][c] = D[1][k];
            c = c + 1;
        }

        System.out.println("length of ABCD is " + ABCD.length + " by " + ABCD[0].length);

        return ABCD;

    }

    /*
     *get local array of interpolated values b/w each pair of points AB, BC, CD, DA
     *merge local arrays into a global array ABCDA.
     *global array serve as the moving path of four rectangles
     *each rectangle will haves its position in the global array based on points A, B, C, and D
     *initiazie (x,y) of each rectangle to appropriate index in the global array     
     */
    
    	public static Object[] pathAry(Point A, Point B, Point C, Point D) {

        int[][] AB; // 2D array to store x,y values b/w point AB
        int[][] BC; // 2D array to store x,y values b/w point BC
        int[][] CD; // 2D array to store x,y values b/w point CD
        int[][] DA; // 2D array to store x,y values b/w point DA

        int[][] ABCDA;

        AB = linearBezier(A, B, N);
        BC = linearBezier(B, C, N);
        CD = linearBezier(C, D, N);
        DA = linearBezier(D, A, N);

        int lengthAB = AB[0].length; // number of columns in AB
        int lengthBC = BC[0].length; // number of columns in BC
        int lengthCD = CD[0].length; // number of columns in CD
        int lengthDA = DA[0].length; // number of columns in DA

        System.out.println("length of array AB is " + AB.length + " by " + lengthAB);

        ABCDA = mergeFourArrays(AB, BC, CD, DA);

        // find the indices of AB in ABCDA
        int startAB = 0;
        int endAB = startAB + (lengthAB - 1);
        System.out.println("endAB =" + endAB);

        x1 = ABCDA[0][startAB];
        y1 = ABCDA[1][startAB];
        System.out.println("x1, y1 " + x1 + "," + y1);

        // find the indices of BC in ABCDA
        int startBC = endAB + 1;
        int endBC = startBC + (lengthBC - 1);
        x2 = ABCDA[0][startBC];
        y2 = ABCDA[1][startBC];
        System.out.println("x2, y2 " + x2 + "," + y2);

        // find the indices of CD in ABCDA
        int startCD = endBC + 1;
        int endCD = startCD + (lengthCD - 1);
        x3 = ABCDA[0][startCD];
        y3 = ABCDA[1][startCD];

        // find the indices of DA in ABCDA
        int startDA = endCD + 1;
        int endDA = startDA + (lengthDA - 1);
        x4 = ABCDA[0][startDA];
        y4 = ABCDA[1][startDA];

        Object[] arrayObjects = new Object[5];
        arrayObjects[0] = ABCDA;
        arrayObjects[1] = startAB;
        arrayObjects[2] = startBC;
        arrayObjects[3] = startCD;
        arrayObjects[4] = startDA;

        return arrayObjects;

    }

}
