import java.awt.event.*;
  import javax.swing.*;
  class MenuTest extends JFrame {
      private JMenuBar menuBar  = new JMenuBar();
      protected JMenu fileMenu     = new JMenu("File");
      protected JMenuItem neW, open, quit, save, print;
      private JMenuItem saveCurrent, saveAs, saveAll;
      MenuTest(String title){
          super(title);
          setJMenuBar(menuBar);
          menuBar.add(fileMenu);
          fileMenu.setMnemonic('F');
          fileMenu.add(neW   = new JMenuItem ("New"));
          fileMenu.add(open  = new JMenuItem ("Open"));
          open.setMnemonic('o');
          fileMenu.add(save = new JMenu ("Save"));
          save.add(saveCurrent = new JMenuItem ("Save Current"));
          save.add(saveAs      = new JMenuItem ("Save As"));
          save.add(saveAll     = new JMenuItem ("Save All"));
          fileMenu.add(save);
          fileMenu.add(print = new JCheckBoxMenuItem ("Print"));
          fileMenu.addSeparator();
	    	fileMenu.add(quit = new JMenuItem("Quit"));
           quit.setMnemonic(KeyEvent.VK_Q);
          quit.setAccelerator(
           KeyStroke.getKeyStroke(KeyEvent.VK_Q,KeyEvent.CTRL_MASK));
          quit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             int result=JOptionPane.showConfirmDialog(MenuTest.this,
                              "Quit/Close Menu Demos Window?");
                 if (result == JOptionPane.YES_OPTION)
                         System.exit(0);
             }
          });
          setSize(300,300);
      }
      public static void main(String args[]){
          MenuTest t = new MenuTest("Menus Test");
          t.setVisible(true);
        }
    }