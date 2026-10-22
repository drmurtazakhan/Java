import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
class DemonstratingMenus2 extends JFrame {
    private JMenuBar menuBar  = new JMenuBar();
    private JMenu fileMenu     = new JMenu("File");
    private JMenu colorMenu     = new JMenu("Color");

    private JMenuItem neW, opeN, closE, savE, prinT;
    private JMenuItem red,green,blue;
    private JMenuItem saveCurrent, saveAs, saveAll;
    
   
    DemonstratingMenus2(){
        super("Demonstrating Menus using Swing Components.");

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(colorMenu);

        fileMenu.setMnemonic('F');

        fileMenu.add(neW   = new JMenuItem ("New"));
        fileMenu.add(opeN  = new JMenuItem ("Open"));
        opeN.setMnemonic('o');
        fileMenu.add(savE = new JMenu ("Save"));

        savE.add(saveCurrent = new JMenuItem ("Save Current"));
        savE.add(saveAs      = new JMenuItem ("Save As"));
        savE.add(saveAll     = new JMenuItem ("Save All"));

        fileMenu.add(savE);

        fileMenu.add(prinT = new JCheckBoxMenuItem ("Print"));

        fileMenu.addSeparator();
        fileMenu.add("Quit");

		colorMenu.add(red = new JRadioButtonMenuItem("Red"));
		colorMenu.add(green = new JRadioButtonMenuItem("Green"));
		colorMenu.add(blue = new JRadioButtonMenuItem("Blue"));
		
		

        setSize(400,400);
        show();
    }
    public static void main(String args[]){
        new DemonstratingMenus2();
    }
}
/* Java generates events when the user selects a menu item, presses a key, pushes a command buttom, etc. 
*/
