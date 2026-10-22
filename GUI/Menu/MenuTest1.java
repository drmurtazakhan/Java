import javax.swing.*;
import java.awt.*;
public class MenuTest1 extends JFrame{
	JMenuBar mb = new JMenuBar();
    
    JMenu fileMenu = new JMenu("File");
    JMenu helpMenu = new JMenu("Help");
    JMenu softwareHelpSubMenu = new JMenu("Software");
	JMenu hardwareHelpSubMenu = new JMenu("Hardware");
    
    MenuTest1(){
        
        setJMenuBar(mb);               
        mb.add(fileMenu);
        mb.add(helpMenu);
        
        fileMenu.add(new JMenuItem("new")); // anonymous object
        fileMenu.add(new JMenuItem("open"));
        fileMenu.add(new JMenuItem("save"));
        fileMenu.addSeparator();
        fileMenu.add(new JCheckBoxMenuItem ("print"));
        
        JRadioButtonMenuItem jrb_autobackup = new JRadioButtonMenuItem("auto backup");
        fileMenu.add(jrb_autobackup); // object with reference
        jrb_autobackup.setSelected(true);
        
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("exit"));
                
		helpMenu.add(softwareHelpSubMenu);
		helpMenu.add(hardwareHelpSubMenu);
		softwareHelpSubMenu.add(new JMenuItem("Unix"));
		softwareHelpSubMenu.add(new JMenuItem("NT"));
		softwareHelpSubMenu.add(new JMenuItem("Win95"));

        
        setTitle("Menu");
        setSize(400,400);
        show();
    }
    public static void main(String args[]){
        new MenuTest1();
    }
}
