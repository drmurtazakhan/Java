import javax.swing.*;
class DemonstratingMenus extends JFrame {
    private JMenuBar menuBar  = new JMenuBar();
    private JMenu fileMenu     = new JMenu("File");

    private JMenuItem neW, opeN, closE, savE, prinT;
    private JMenuItem saveCurrent, saveAs, saveAll,openFile;

    DemonstratingMenus(){
        super("Demonstrating Menus using Swing Components.");

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);

        fileMenu.setMnemonic('F');

        fileMenu.add(neW   = new JMenuItem ("New"));
        fileMenu.add(opeN  = new JMenuItem ("Open"));
        opeN.setMnemonic('O');
                
        fileMenu.add(savE = new JMenu ("Save"));
		savE.setMnemonic('S');
        savE.add(saveCurrent = new JMenu ("Save Current"));
        savE.add(saveAs      = new JMenuItem ("Save As"));
        savE.add(saveAll     = new JMenuItem ("Save All"));
        saveCurrent.add(openFile= new JMenuItem ("Save abc"));
        
        fileMenu.add(prinT = new JCheckBoxMenuItem ("Print"));

        fileMenu.addSeparator();
        fileMenu.add("Quit");

        setSize(400,400);
        show();
    }
    public static void main(String args[]){
        new DemonstratingMenus();
    }
}
/* Java generates events when the user selects a menu item, presses a key, pushes a command buttom, etc. 
*/
