
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

class SelectColorByMouseClick extends JFrame implements ActionListener, MouseListener {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    private JMenuBar menuBar;
    private JPopupMenu colorMenu;
    private JMenu controlMenu;
    private static final Color bgColor = Color.white;
    private static final Color[] colors
            = {Color.blue, Color.green, Color.gray, Color.red, Color.yellow};

    private static final String[] colorNames
            = {"Blue", "Green", "Gray", "Red", "Yellow"};

    private static final String[] controls = {"Restore", "Exit"};

    public static void main(String[] args) {
        new SelectColorByMouseClick();
    }

    /**
     * Consturctor
     */
    public SelectColorByMouseClick() {

        super("Select Colors By MouseClick");
        setSize(WIDTH, HEIGHT);

        menuBar = new JMenuBar();
        controlMenu = new JMenu("Control");
        initMenu(controlMenu, controls);

        colorMenu = new JPopupMenu("Colors");
        colorMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        initMenu(colorMenu, colorNames);

        menuBar.add(controlMenu);
        setJMenuBar(menuBar);

        addMouseListener(this);
        getContentPane().setBackground(bgColor);
        setVisible(true);
    }

    private void initMenu(JComponent menu, String[] items) {
        for (int i = 0; i < items.length; i++) {
            JMenuItem item = new JMenuItem(items[i]);
            item.addActionListener(this);
            menu.add(item);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();        
        if (s.equals("Exit")) {
            System.exit(0);
        } else if (s.equals("Restore")) {
            getContentPane().setBackground(bgColor);
        } else {
            setColorBG(s);
        }
    }

    private void setColorBG(String s) {
        int i = 0;
        while (i < colorNames.length) {
            if (s.equals(colorNames[i])) {
                getContentPane().setBackground(colors[i]);
                break;
            } else {
                i++;
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        /**
         * public boolean isPopupTrigger() returns whether or not this mouse
         * event is the popup menu trigger event for the platform.
         */
        if (e.isPopupTrigger()) {
            colorMenu.show(this, e.getX(), e.getY());
        }

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

}
