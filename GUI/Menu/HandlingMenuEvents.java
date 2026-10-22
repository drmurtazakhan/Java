import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandlingMenuEvents extends JFrame {
    private JMenuBar menuBar  = new JMenuBar();
    private JMenu fileMenu     = new JMenu("File");

    private JMenuItem neW, opeN, closE, savE, prinT, quiT;
    private JMenuItem saveCurrent, saveAs, saveAll;
    private JTextField jtxf;

    HandlingMenuEvents(){
        super("Demonstrating Menus using Swing Components.");

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);

        fileMenu.setMnemonic('F');

        fileMenu.add(neW   = new JMenuItem ("New"));
        fileMenu.add(opeN  = new JMenuItem ("Open"));
        opeN.setMnemonic('o');
        fileMenu.add(savE = new JMenu ("Save"));

        savE.add(saveCurrent = new JMenuItem ("Save Current"));
        savE.add(saveAs      = new JMenuItem ("Save As"));
        savE.add(saveAll     = new JMenuItem ("Save All"));
       
        fileMenu.add(prinT = new JCheckBoxMenuItem ("Print"));

        fileMenu.addSeparator();
        fileMenu.add(quiT = new JMenuItem("Quit"));
        quiT.setMnemonic('q');

        prinT.addActionListener( new ActionListener() {
           public void actionPerformed(ActionEvent e ) {
              JFrame fp = new JFrame("Printing Assistant");
              JPanel f = new JPanel();
              Container cp = fp.getContentPane();
              cp.setLayout(new FlowLayout());
              f.add(jtxf = new JTextField(23));
              jtxf.setText("Sorry, no printer.");
              cp.add(f);
              fp.setSize(400,400);
              fp.show();
           }
          });

        opeN.addActionListener( new ActionListener() {
           public void actionPerformed( ActionEvent e ) {
              JFrame f = new JFrame();
              FileDialog fd = new FileDialog(f, "Select File To Open.");
              fd.show();
           }
          });

        quiT.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                       System.exit(0);
                    }});

        setSize(400,400);
        show();
    }
    public static void main(String args[]){
        new HandlingMenuEvents();
    }
}
/* Java generates events when the user selects a menu item, presses a key, pushes a command buttom, etc. 
*/
