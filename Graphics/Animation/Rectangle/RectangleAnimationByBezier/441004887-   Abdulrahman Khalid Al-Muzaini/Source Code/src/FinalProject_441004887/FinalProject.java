package FinalProject_441004887;
/**
 * @StudentName Abdulrahman Khalid Al-Muzaini
 * @StudentID   441004887
 * @InstructorName Murtaza Khan
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import javax.swing.Action;

public class FinalProject {
    public static void main(String[] args) {
        //implemented to fix display issues for some devices
        System.setProperty("sun.java2d.uiScale", "1.0");
        new Settings();
        new SettingsFrame();
    }
}
//Settings class, to store the settings for our animation
class Settings{
    private static int nRecSetting;             //number of rectangles/curves
    private static int animationSetting;        //selected animation
    private static boolean drawCurveSetting;    //draw curve?
    private static String curveClrSetting;      //curve color
    private static String traceOptSetting;      //draw All/One Curve(s)
    private static int curveToTrace;            //if traceOptSetting=="One Curve",
                                                //trace the curve wih tihs number curve
    private static int nSetting;                //N+1 sample points
    private static int sleepSetting;            //sleep interval
    private static String[] recsClrSetting;     //stores the Colors of rectangles
    private static int frameMultSetting;        //Frame Multiplier

    //default constructor, with default Settings
    public Settings() {
        this.nRecSetting = 4;
        this.animationSetting = 0;
        this.drawCurveSetting = false;
        this.curveClrSetting = "White";
        this.traceOptSetting = "All Curves";
        this.curveToTrace = 0;
        this.nSetting = 63;
        this.sleepSetting = 16;
        this.recsClrSetting = new String[]{"Red","Green","Blue","Yellow",
                                           "Magenta","Cyan","White","Orange"};
        this.frameMultSetting = 2;
    }

    //Constructor to update Setings
    public Settings(int nRecSetting, int animationSetting, boolean drawCurveSetting, String curveClrSetting, String traceOptSetting, int curveToTrace, int nSetting, int sleepSetting, String[] recsClrSetting,int frameMultSetting) {
        this.nRecSetting = nRecSetting;
        this.animationSetting = animationSetting;
        this.drawCurveSetting = drawCurveSetting;
        this.curveClrSetting = curveClrSetting;
        this.traceOptSetting = traceOptSetting;
        this.curveToTrace = curveToTrace;
        this.nSetting = nSetting;
        this.sleepSetting = sleepSetting;
        this.recsClrSetting = recsClrSetting;
        this.frameMultSetting=frameMultSetting;
    }

    public static void printSettings(){
        System.out.println("-----Current Settings-----");
        System.out.println("nRecSetting = " + Settings.getnRecSetting());
        System.out.println("animationSetting = " + Settings.getAnimationSetting());
        System.out.println("drawCurveSetting = " + Settings.isDrawCurveSetting());
        System.out.println("curveClrSetting = " + Settings.getCurveClrSetting());
        System.out.println("traceOptSetting = " + Settings.getTraceOptSetting());
        System.out.println("curveToTrace = " + Settings.getCurveToTrace());
        System.out.println("nSetting = " + Settings.getnSetting());
        System.out.println("sleepSetting = " + Settings.getSleepSetting());
        System.out.println("recsClrSetting:");
        for (int i = 0; i < recsClrSetting.length; i++) {
            System.out.print(recsClrSetting[i]+" ");
        }
        System.out.println();
        System.out.println("frameMultSetting = "+frameMultSetting);
        System.out.println("------------------");
    }
    
    //getter methods
    public static int getnRecSetting() {
        return nRecSetting;
    }

    public static int getAnimationSetting() {
        return animationSetting;
    }

    public static boolean isDrawCurveSetting() {
        return drawCurveSetting;
    }

    public static String getCurveClrSetting() {
        return curveClrSetting;
    }

    public static String getTraceOptSetting() {
        return traceOptSetting;
    }

    public static int getCurveToTrace() {
        return curveToTrace;
    }

    public static int getnSetting() {
        return nSetting;
    }

    public static int getSleepSetting() {
        return sleepSetting;
    }

    public static String[] getRecsClrSetting() {
        return recsClrSetting;
    }
    
    public static int getFrameMultSetting(){
        return frameMultSetting;
    }
}
//Settings Frame, this class has the User Interfece
class SettingsFrame extends JFrame implements ActionListener,MouseMotionListener{
    private static final int FW = 1200; // frame-width
    private static final int FH = 600; // frame-height
    //mouse coordinates
    private int mouseX=-1;
    private int mouseY=-1;
    //button width and height
    private int btnW = 250;
    private int btnH = 40;
    //label for animation settings
    JLabel animLabel = new JLabel("Animation");
    //labels for animation radio buttons
    String[] animLabels = {"Clock-wise","Anti-Clock-Wise","Clock-Wise to Center",
                            "Flower Type A","Flower Type B","Flower Type C",
                            "Hour Glass","Diamond","Clock-Wise + Diamond"};
    //Radio buttons to select animation
    JRadioButton[] animBtns = new JRadioButton[animLabels.length];
    //Button group for animation radio buttons
    ButtonGroup animGroup = new ButtonGroup();
    //coordinates for animation settings
    private int animx=10;
    private int animy=50;
    private static int animationSetting;    //variable to update Settings class
    private static int nRecSetting;         //variable to update Settings class
    
    //curve settings label
    JLabel curveLabel = new JLabel("Curve/Trace options:");
    //draw curve checkbox
    JCheckBox curveDrawCheck = new JCheckBox("Draw Curve/Trace?",false);
    private static boolean drawCurveSetting;    //variable to update Settings class
    
    //label for the combobox to select color of the curve
    JLabel curveClrLabel = new JLabel("Curve Color:");
    //array containing the color choices
    String[] clrs = {"Red","Green","Blue","Yellow","Magenta","Cyan","White",
                    "Orange","Gray","Light Gray","Dark Gray","Pink","Black"};
    //combobox containing the color choices
    JComboBox curveClrsBox = new JComboBox(clrs);   
    private static String curveClrSetting;  //variable to update Settings class
    
    //curve option label
    JLabel drawOptLabel = new JLabel("How many Curves to draw?:");
    //array containing curve options
    String[] traceOpt = {"All Curves","One Curve"};
    //combobox for curve options
    JComboBox drawOptBox = new JComboBox(traceOpt);
    private static String traceOptSetting;  //variable to update Settings class
    
    //curve to trace/draw label
    JLabel curveToLabel = new JLabel("Which Curve to trace?:");
    //array to store choices
    String[] traceCurveOpt = {"0","1","2","3"};
    //combobox to choose
    JComboBox curveToBox = new JComboBox(traceCurveOpt);
    private static int curveToTrace;    //variable to update Settings class
    //curve settings coordinates
    private int curx=400;
    private int cury=50;
    
    
    //general settings label
    JLabel generalLabel = new JLabel("General Settings:");
    //N setting label (Number of sample points)
    JLabel nLabel = new JLabel("Number of sample points:");
    //TextField to type value of N setting, Integer
    JTextField nField = new JTextField();
    private static int nSetting;    //variable to update Settings class
    
    //sleep setting label
    JLabel sleepLabel = new JLabel("Sleep intreval:");
    //TextField to type value of sleep setting, Integer
    JTextField sleepField = new JTextField();
    private static int sleepSetting;    //variable to update Settings class
    
    JLabel frameMultLabel = new JLabel("Frame Multiplier:");
    String[] frameMultOpt = {"1","2","3","4"};
    JComboBox frameMultBox = new JComboBox(frameMultOpt);
    private static int frameMultSetting; //variable to update Settings class
    
    private static String[] recsClrSetting; //variable to update Settings class
    //general settings coordinates
    private int genx=curx*2;
    private int geny=cury;
    
    //confirmation button
    JButton confirmButton = new JButton("Confirm");
    
    public SettingsFrame(){
//        new Settings(); //Default Settings
        //making the frame
        this.setLayout(null);
        this.setSize(FW, FH);
        this.setTitle("Settings of Animation Of 2D Rectangles");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(new Color(220,220,220));
        this.setResizable(false);

        //initializing settings to have the default settings
        this.nRecSetting = Settings.getnRecSetting();
        this.animationSetting = Settings.getAnimationSetting();
        this.drawCurveSetting = Settings.isDrawCurveSetting();
        this.curveClrSetting = Settings.getCurveClrSetting();
        this.traceOptSetting = Settings.getTraceOptSetting();
        this.curveToTrace = Settings.getCurveToTrace();
        this.nSetting = Settings.getnSetting();
        this.sleepSetting = Settings.getSleepSetting();
        this.recsClrSetting = Settings.getRecsClrSetting();
        this.frameMultSetting = Settings.getFrameMultSetting();
        
        //initializing the Animation Label for the animation settings
        animLabel.setBounds(animx*2, 5, btnW, btnH);
        animLabel.setFont(new Font(null,Font.BOLD,25));
        //initializing the Animation Radio Buttons and group
        for (int i = 0; i < animBtns.length; i++) {
        animBtns[i] = new JRadioButton(animLabels[i]);
        animBtns[i].setFont(new Font(null,Font.PLAIN,20));
        animBtns[i].setBounds(animx, animy*(i+1), btnW, btnH);;
        animGroup.add(animBtns[i]);
        animBtns[i].addActionListener(this);
        animBtns[i].setFocusable(false);
        }
        //show that the first option (default) is chosen
        animBtns[animationSetting].setSelected(true);
        //adding the animation label and radio buttons to the frame
        this.add(animLabel);
        for (int i = 0; i < animBtns.length; i++) {
            this.add(animBtns[i]);
        }
        
        //initializing the label for the curve settings
        curveLabel.setBounds(curx, 5, btnW, btnH);
        curveLabel.setFont(new Font(null,Font.BOLD,25));
        //adding the label to the frame
        this.add(curveLabel);
        
        //initializing the checkbox to choose weather to draw the curve or not
        curveDrawCheck.setBounds(curx, cury, btnW, btnH);
        curveDrawCheck.setSelected(drawCurveSetting);
        curveDrawCheck.setFont(new Font(null,Font.PLAIN,20));
        curveDrawCheck.setFocusable(false);
        curveDrawCheck.addActionListener(this);
        //adding the checkbox to the frame
        this.add(curveDrawCheck);
        
        //initializing the label for curve color setting
        curveClrLabel.setBounds(curx, cury*2, btnW, btnH);
        curveClrLabel.setFont(new Font(null,Font.PLAIN,20));
        curveClrLabel.setVisible(drawCurveSetting);
        //adding the label to the frame
        this.add(curveClrLabel);
        
        //initializing the combobox to choose which color to draw the curve in
        curveClrsBox.setBounds(curx, cury*3,btnW,btnH);
        curveClrsBox.setSelectedItem(curveClrSetting);
        curveClrsBox.setFont(new Font(null,Font.PLAIN,20));
        curveClrsBox.setEditable(false);
        curveClrsBox.setFocusable(false);
        curveClrsBox.addActionListener(this);
        curveClrsBox.setVisible(drawCurveSetting);
        //adding the combobox to the frame
        this.add(curveClrsBox);
        
        //initializing the label to choose to draw all curves or one curve
        drawOptLabel.setBounds(curx, cury*4, btnW, btnH);
        drawOptLabel.setFont(new Font(null,Font.PLAIN,20));
        drawOptLabel.setVisible(drawCurveSetting);
        //adding the label to the frame
        this.add(drawOptLabel);
        
        //initializing the combobox to choose to draw all curves or one curve
        drawOptBox.setBounds(curx, cury*5,btnW/2,btnH);
        drawOptBox.setSelectedItem(traceOptSetting);
        drawOptBox.setFont(new Font(null,Font.PLAIN,20));
        drawOptBox.setEditable(false);
        drawOptBox.setFocusable(false);
        drawOptBox.addActionListener(this);
        drawOptBox.setVisible(drawCurveSetting);
        //adding the combobox to the frame
        this.add(drawOptBox);
        
        
        curveToLabel.setBounds(curx, cury*6, btnW, btnH);
        curveToLabel.setFont(new Font(null,Font.PLAIN,20));
        curveToLabel.setVisible(traceOptSetting=="One Curve");
        
        this.add(curveToLabel);
        
        
        curveToBox.setBounds(curx, cury*7,50,btnH);
        if (animationSetting==8) {
            nRecSetting=8;
            curveToBox.addItem("4");
            curveToBox.addItem("5");
            curveToBox.addItem("6");
            curveToBox.addItem("7");
        }else{
            nRecSetting=4;
            curveToTrace=0;
            curveToBox.removeItem("4");
            curveToBox.removeItem("5");
            curveToBox.removeItem("6");
            curveToBox.removeItem("7");
        }
        curveToBox.setSelectedIndex(curveToTrace);
        curveToBox.setFont(new Font(null,Font.PLAIN,20));
        curveToBox.setEditable(false);
        curveToBox.setFocusable(false);
        curveToBox.addActionListener(this);
        curveToBox.setVisible(traceOptSetting=="One Curve");
        
        this.add(curveToBox);
        
        
        generalLabel.setBounds(genx, 5, btnW, btnH);
        generalLabel.setFont(new Font(null,Font.BOLD,25));
        
        this.add(generalLabel);
        
        
        nLabel.setBounds(genx, geny, btnW+50, btnH);
        nLabel.setFont(new Font(null,Font.PLAIN,20));
        
        this.add(nLabel);
        
        
        nField.setBounds(genx, geny*2, btnW/4, btnH);
        nField.setFont(new Font(null,Font.PLAIN,20));
        nField.setText(Integer.toString(nSetting));
        nField.setFocusable(false);
        nField.addActionListener(this);
        
        this.add(nField);
        
        
        sleepLabel.setBounds(genx, geny*3, btnW+50, btnH);
        sleepLabel.setFont(new Font(null,Font.PLAIN,20));
        
        this.add(sleepLabel);
        
        
        sleepField.setBounds(genx, geny*4, btnW/4, btnH);
        sleepField.setFont(new Font(null,Font.PLAIN,20));
        sleepField.setText(Integer.toString(sleepSetting));
        sleepField.setFocusable(false);
        sleepField.addActionListener(this);
        
        this.add(sleepField);
        
        
        frameMultLabel.setBounds(genx, geny*5, btnW, btnH);
        frameMultLabel.setFont(new Font(null,Font.PLAIN,20));
        
        this.add(frameMultLabel);
        
        
        frameMultBox.setBounds(genx, geny*6, btnW/4, btnH);;
        frameMultBox.setFont(new Font(null,Font.PLAIN,20));
        frameMultBox.setSelectedItem(Integer.toString(frameMultSetting));
        frameMultBox.setEditable(false);
        frameMultBox.setFocusable(false);
        frameMultBox.addActionListener(this);
        
        this.add(frameMultBox);
        
        
        confirmButton.setBounds((FW/2)-((btnW-100)/2), FH-(btnH*3), btnW-100, btnH);
        confirmButton.setFont(new Font(null,Font.BOLD,25));
        confirmButton.setFocusable(false);
        confirmButton.addActionListener(this);
        
        this.add(confirmButton);
        
        this.addMouseMotionListener(this);
        this.setVisible(true);
        
    }

    
    @Override
    public void actionPerformed(ActionEvent Event) {
        //check if one of the radio buttons was selected
        for (int i = 0; i < animBtns.length; i++) {
            if (Event.getSource()==animBtns[i]) {
                //stores the index of the button to the animationSetting
                animationSetting = i;
                
                //if the selected button is index 8, it needs to add the options
                //4-7 to the curveToBox, which selects which curve to draw if
                //drawCurveSetting is true and traceOptSetting=="One Curve"
                //if index 8 isn't selected it deletes the additional items if they are there
                if (animationSetting==8) {
                    nRecSetting=8;
                    curveToBox.addItem("4");
                    curveToBox.addItem("5");
                    curveToBox.addItem("6");
                    curveToBox.addItem("7");
                }else{
                    nRecSetting=4;
                    curveToTrace=0;
                    curveToBox.removeItem("4");
                    curveToBox.removeItem("5");
                    curveToBox.removeItem("6");
                    curveToBox.removeItem("7");
                }
            }
        }
        
        
        if (Event.getSource()==curveDrawCheck) {
            drawCurveSetting = curveDrawCheck.isSelected();
            if (drawCurveSetting) {
                drawOptLabel.setVisible(true);
                drawOptBox.setVisible(true);
                curveClrLabel.setVisible(true);
                curveClrsBox.setVisible(true);
                if (drawCurveSetting&&traceOptSetting=="One Curve") {
                    curveToLabel.setVisible(true);
                    curveToBox.setVisible(true);
                }
            }else{
                drawOptLabel.setVisible(false);
                drawOptBox.setVisible(false);
                curveClrLabel.setVisible(false);
                curveClrsBox.setVisible(false);
                curveToLabel.setVisible(false);
                curveToBox.setVisible(false);
            }
        }
        if (Event.getSource()==drawOptBox) {
            traceOptSetting = drawOptBox.getSelectedItem().toString();
            if (drawCurveSetting&&traceOptSetting=="One Curve") {
                curveToLabel.setVisible(true);
                curveToBox.setVisible(true);
//                System.out.println(curveToTrace);
            }else{
                curveToLabel.setVisible(false);
                curveToBox.setVisible(false);
            }
        }
        
        
        if (Event.getSource()==curveClrsBox) {
            curveClrSetting = curveClrsBox.getSelectedItem().toString();
        }
        
        if (Event.getSource()==curveToBox) {
            curveToTrace = curveToBox.getSelectedIndex();
        }
        
        if (Event.getSource()==frameMultBox) {
            frameMultSetting = Integer.parseInt(frameMultBox.getSelectedItem().toString());
        }
        
        if (Event.getSource()==confirmButton) {
            //checks if the user entered an integer or not and throws an error if not integer
            boolean nFieldFlag = false;
            try {
                nSetting = Integer.parseInt(nField.getText());
                nFieldFlag = true;
            } catch (Exception e) {
                nField.setForeground(Color.red);
                JLabel errIntLabel = new JLabel("<html><center>ERROR!<br/><center>only enter integers!<html>");
                errIntLabel.setFont(new Font(null,Font.BOLD,25));
                JOptionPane.showMessageDialog(null, errIntLabel, "ERROR: 4887",JOptionPane.WARNING_MESSAGE);
            }
            boolean sleepFieldFlag = false;
            try {
                sleepSetting = Integer.parseInt(sleepField.getText());
                sleepFieldFlag = true;
            } catch (Exception e) {
                sleepField.setForeground(Color.red);
                JLabel errIntLabel = new JLabel("<html><center>ERROR!<br/><center>only enter integers!<html>");
                errIntLabel.setFont(new Font(null,Font.BOLD,25));
                JOptionPane.showMessageDialog(null, errIntLabel, "ERROR: 4887",JOptionPane.WARNING_MESSAGE);
            }
            
            if ((nFieldFlag&&sleepFieldFlag)) {
                /*
                int nRecSetting,
                int animationSetting,
                boolean drawCurveSetting,
                String curveClrSetting,
                String traceOptSetting,
                int curveToTrace,
                int nSetting,
                int sleepSetting, 
                String[] recsClrSetting
                */
                new Settings(
                nRecSetting,
                animationSetting,
                drawCurveSetting,
                curveClrSetting,
                traceOptSetting,
                curveToTrace,
                nSetting,
                sleepSetting,
                recsClrSetting,
                frameMultSetting);
                this.dispose();
                Settings.printSettings();
                new AnimationOf2DRectangles();
            }
            
        }
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
    }

    //MouseMotionListener method
    @Override
    public void mouseMoved(MouseEvent mEvent) {
        mouseX = mEvent.getX();
        mouseY = mEvent.getY();
        
        //checks to see if the mouse is near nField, and allow it to be edited
        //if the mouse is not near it it disables th focus
        //also it changes the color of the text to black, so if it was red from
        //an error message before this, it changes back to black
        if (((getMouseX() >=800)&&(getMouseX()<=880))&&
                ((getMouseY() >=120)&&(getMouseY()<=200))) {
            nField.setFocusable(true);
            nField.setForeground(Color.black);
        }else{
            nField.setFocusable(false);
        }
        
        //checks to see if the mouse is near sleepField, and allow it to be edited
        //if the mouse is not near it it disables th focus
        //also it changes the color of the text to black, so if it was red from
        //an error message before this, it changes back to black
        if (((getMouseX() >=800)&&(getMouseX()<=880))&&
                ((getMouseY() >=210)&&(getMouseY()<=300))) {
            sleepField.setFocusable(true);
            sleepField.setForeground(Color.black);
        }else{
            sleepField.setFocusable(false);
        }
    }
    //mouse coordinates getter methods
    public int getMouseX(){
        return mouseX;
    }
    public int getMouseY(){
        return mouseY;
    }
}


//AnimationOf2DRectangles frame
class AnimationOf2DRectangles extends JFrame {

    private final int FW = 400 * Settings.getFrameMultSetting(); // frame-width
    private final int FH = 300 * Settings.getFrameMultSetting(); // frame-height

    public AnimationOf2DRectangles() {
        this.setLayout(new BorderLayout());
        this.setSize(FW, FH);
        this.setTitle("Animation Of 2D Rectangles");
        this.setLocationRelativeTo(null);
        //when closed, this frame is disposed.
        //the panel will check if it's displayable, if not it will stop the thread
        //and make a new instince of the SettingsFrame, so the user can change
        //the settings or close the program
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        A2DRPanel Panel = new A2DRPanel(FW, FH);
        this.add(Panel, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }
}
//AnimationOf2DRectangles Panel
class A2DRPanel extends JPanel implements Runnable {

    private int PW; // panel width
    private int PH; // panel height

    private int RW; // rectangle width
    private int RH; // rectangle height
    private int nRec;    // number of rectangles, most animations use 4
    Rectangle2D.Double[] recs;
    Color[] recClr;
//    String[] clrs = {"red", "green", "blue", "yellow","m","c","w","o"};
    String[] clrs;
    int[][] cords;
    //coordinates for rectangles
    //cords[rectangle][axis]
    //[rectangle]:
    //0: red, 1: green, 2: blue, 3: yellow

    Point P0, P1, P2, P3, PC, Ptop, Pright, Pdown, Pleft;

    private int N;    // curve will have N+1 points
    private int sleep;
    private int index;

    int[] loc;
    //holds on which curve the rec is at
    int[][][] Pt;
    //Pt[direction][axis][index to get values of t]
    //[direction]:
    //0: right, 1: down, 2: left, 3: up, directions can be changed in constructor

    private String traceOpt;
    private int recToTrace;
    private Color traceClr;

    private Thread thrd; // thread

    public A2DRPanel(int w, int h) {
        PW = w;
        PH = h;

        RW = PW / 8;
        RH = PH / 6;

        this.setPreferredSize(new Dimension(PW, PH));
        this.setBackground(Color.black);
        
        
        nRec = Settings.getnRecSetting();
        recs = new Rectangle2D.Double[nRec];
        recClr = new Color[recs.length];
        clrs = Settings.getRecsClrSetting();
        cords = new int[recs.length][2];
        N = Settings.getnSetting();
        sleep = Settings.getSleepSetting();
        loc = new int[cords.length];
        Pt = new int[recs.length][2][N + 1];
        
        createPoints();
        
        //the animation on which the rectangles will move
        animation(Settings.getAnimationSetting());
        /*
         * 0: clock-wise
         * 1: anti-clock-wise
         * 2: clock-wise towards center
         * 3: flower type A
         * 4: flower type B
         * 5: flower type C
         * 6: hour glass
         * 7: diamond
         * 8: !!requires 8 rectangles, change nRecs to 8
         */
        
        spawnRecs();

        //trace options
        traceOpt = Settings.getTraceOptSetting();
        recToTrace = Settings.getCurveToTrace();
        traceClr = colorDecoder(Settings.getCurveClrSetting());
        /*
         * "" (empty): do not draw trace points
         * "one": draw trace points for rectangle at recToTrace
         * "all": draw trace points for all rectangles
         */
        
        
        
        thrd = new Thread(this);
        thrd.start();
    }

    @Override
    public void run() {
        
        boolean flag = true;
        
        index = 0;
        //buffer so even if machine is slow it can catch up
        int buff=0;
        while (!this.isDisplayable()) {
            System.out.print("");
            buff++;
        }
        System.out.println("buff: "+buff);
        while (flag) {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
            }
            if (this.isDisplayable()) {
                //nothing
            }
            else{
                //makes a new instince of SettingsFrame and stops thread
                new SettingsFrame();
                thrd.stop();
            }
            
            if (index == 0) {
                check();
            }
            
            index++;
            
            move();
            if (index >= N) {
                index = 0;
                recToTrace = (recToTrace + 1) % 4; // and the direction changes
            }
            repaint();
        }
    }

    //factorial method, recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    // binomial coefficient method
    public static int bicoef(int k, int n) {
        int co = (factorial(n)) / ((factorial(k)) * (factorial((n - k))));
        return co;
    }

    // general Bezier method made by the formula from wikipedia
    public void Bezier(int dir, Point... points) {
        int np = points.length - 1;

        double x = 0.0;
        double y = 0.0;
        double delta = 1.0 / N;
        double t = 0;

        for (int j = 0; j <= N; j++) {
            t = j * delta;
            for (int i = 0; i <= np; i++) {
                x += (bicoef(i, np)) * (Math.pow((1 - t), np - i)) * (Math.pow(t, i)) * (points[i].getX());
                y += (bicoef(i, np)) * (Math.pow((1 - t), np - i)) * (Math.pow(t, i)) * (points[i].getY());
            }
            Pt[dir][0][j] = (int) Math.round(x);
            Pt[dir][1][j] = (int) Math.round(y);
            x = 0.0;
            y = 0.0;
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int rec = 0; rec < recs.length; rec++) {
            g2.setColor(recClr[rec]);
            recs[rec] = new Rectangle2D.Double(cords[rec][0], cords[rec][1], RW, RH);
            g2.fill(recs[rec]);
        }
        drawPointArray(g2, traceOpt);
    }

    public void createPoints() {
        // points of corners of panel
        P0 = new Point(0, 0);               //Top Left point
        P1 = new Point(PW - RW, 0);         //Top Right point
        P2 = new Point(PW - RW, PH - RH);   //Bottom Right point
        P3 = new Point(0, PH - RH);         //Bottom Left point

        //Points for flower-like animation
        Ptop = new Point(PW / 2, 0);        //Center Top Point
        Pdown = new Point(PW / 2, PH - RH);   //Center Down Point
        Pleft = new Point(0, PH / 2);       //Center Left Point
        Pright = new Point(PW - RW, PH / 2);  //Center Right Point
        PC = new Point(PW / 2, PH / 2);      //Center Point
    }

    public void spawnRecs() {
        for (int rec = 0; rec < cords.length; rec++) {
            for (int axis = 0; axis < cords[rec].length; axis++) {
                cords[rec][axis] = Pt[rec][axis][0];
            }
            recClr[rec] = colorDecoder(clrs[rec]);
        }
    }

    //checks if rec is at the beginning of the next curve
    public void check() {
        for (int dir = 0; dir < Pt.length; dir++) {
            for (int rec = 0; rec < cords.length; rec++) {
                if ((cords[rec][0] == Pt[dir][0][0]) && (cords[rec][1] == Pt[dir][1][0])) {
                    loc[dir] = rec;
                }
            }
        }

    }

    //method that moves the rectangles
    public void move() {
        for (int dir = 0; dir < loc.length; dir++) {
            for (int axis = 0; axis < cords[dir].length; axis++) {
                cords[loc[dir]][axis] = Pt[dir][axis][index];
            }
        }
    }

    //metho to draw curve
    public void drawPointArray(Graphics2D g2, String opt) {
        g2.setColor(traceClr);
        g2.setStroke(new BasicStroke(7.0f));
        if (!Settings.isDrawCurveSetting()) {
            opt="";
        }
        if (opt != "") {
            switch (opt) {
                case "One Curve":
                case "one curve":
                case "ONE CURVE":
                    for (int i = 0; i <= N; i++) {
                        g2.drawLine(Pt[recToTrace][0][i], Pt[recToTrace][1][i], Pt[recToTrace][0][i], Pt[recToTrace][1][i]);
                    }
                    break;
                case "All Curves":
                case "all curves":
                case "ALL CURVES":
                    for (int dir = 0; dir < Pt.length; dir++) {
                        for (int i = 0; i <= N; i++) {
                            g2.drawLine(Pt[dir][0][i], Pt[dir][1][i], Pt[dir][0][i], Pt[dir][1][i]);
                        }
                    }
            }
        }
    }

    //method to choose which animation to use
    public void animation(int opt) {

        switch (opt) {
            case 0:
                //clock wise
                Bezier(0, P0, P1);    //right
                Bezier(1, P1, P2);    //down
                Bezier(2, P2, P3);    //left
                Bezier(3, P3, P0);    //up
                break;
            case 1:
                //anti-clock wise
                Bezier(0, P0, P3);    //right
                Bezier(1, P3, P2);    //down
                Bezier(2, P2, P1);    //left
                Bezier(3, P1, P0);    //up
                break;
            case 2:
                Bezier(0, P0, PC, P1);    //right
                Bezier(1, P1, PC, P2);    //down
                Bezier(2, P2, PC, P3);    //left
                Bezier(3, P3, PC, P0);    //up
                break;
            case 3:
                Bezier(0, P0, Pleft, PC, Pright, P1);    //right
                Bezier(1, P1, Ptop, PC, Pdown, P2);    //down
                Bezier(2, P2, Pright, PC, Pleft, P3);    //left
                Bezier(3, P3, Pdown, PC, Ptop, P0);    //up
                break;
            case 4:
                Bezier(0, P0, Pright, PC, Pleft, P1);    //right
                Bezier(1, P1, Pdown, PC, Ptop, P2);    //down
                Bezier(2, P2, Pleft, PC, Pright, P3);    //left
                Bezier(3, P3, Ptop, PC, Pdown, P0);    //up
                break;
            case 5:
                Bezier(0, P0, Pright, Pleft, P1);    //right
                Bezier(1, P1, Pdown, Ptop, P2);    //down
                Bezier(2, P2, Pleft, Pright, P3);    //left
                Bezier(3, P3, Ptop, Pdown, P0);    //up
                break;
            case 6:
                Bezier(0, P0, P2);    //right
                Bezier(1, P2, P3);    //down
                Bezier(2, P3, P1);    //left
                Bezier(3, P1, P0);    //up
                break;
            case 7:
                Bezier(0, Ptop, Pright);    //right
                Bezier(1, Pright, Pdown);    //down
                Bezier(2, Pdown, Pleft);    //left
                Bezier(3, Pleft, Ptop);    //up
                break;
            case 8:
                if (recs.length!=8) {
                    System.out.println("ERROR, number of rectangles must be 8");
                    System.out.println("switching to default animation...");
                    animation(0);
                    break;
                }
                //clock wise
                Bezier(0, P0, P1);    //right
                Bezier(1, P1, P2);    //down
                Bezier(2, P2, P3);    //left
                Bezier(3, P3, P0);    //up
                //diamond
                Bezier(4, Ptop, Pright);    //right
                Bezier(5, Pright, Pdown);    //down
                Bezier(6, Pdown, Pleft);    //left
                Bezier(7, Pleft, Ptop);    //up
                break;
            default:
                System.out.println("not a valid option!!!");
                System.out.println("switching to default animation");
                animation(0);
                break;
        }
    }
    
    //gets the Color from the string representation
    public Color colorDecoder(String clr) {
        Color c = Color.white;
        switch (clr) {
            case "r":
            case "red":
            case "Red":
            case "RED":
                c = Color.red;
                break;
            case "g":
            case "green":
            case "Green":
            case "GREEN":
                c = Color.green;
                break;
            case "b":
            case "blue":
            case "Blue":
            case "BLUE":
                c = Color.blue;
                break;
            case "y":
            case "yellow":
            case "Yellow":
            case "YELLOW":
                c = Color.yellow;
                break;
            case "c":
            case "cyan":
            case "Cyan":
            case "CYAN":
                c = Color.cyan;
                break;
            case "m":
            case "magenta":
            case "Magenta":
            case "MAGENTA":
                c = Color.magenta;
                break;
            case "w":
            case "white":
            case "White":
            case "WHITE":
                c = Color.white;
                break;
            case "gr":
            case "gray":
            case "Gray":
            case "GRAY":
                c = Color.gray;
                break;
            case "lgr":
            case "light gray":
            case "Light Gray":
            case "LIGHT GRAY":
                c = Color.lightGray;
                break;
            case "dgr":
            case "dark gray":
            case "Dark Gray":
            case "DARK GRAY":
                c = Color.darkGray;
                break;
            case "p":
            case "pink":
            case "Pink":
            case "PINK":
                c = Color.pink;
                break;
            case "o":
            case "orange":
            case "Orange":
            case "ORANGE":
                c = new Color(255, 96, 0);
                break;
            case "bl":
            case "black":
            case "Black":
            case "BLACK":
                c = Color.black;
                break;
        }
        return c;
    }
}