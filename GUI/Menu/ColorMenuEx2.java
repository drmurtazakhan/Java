import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
class ColorMenuEx2 extends JFrame implements 
                           ActionListener, MouseListener {
   public ColorMenuEx2() {
      menuBar = new JMenuBar();
      colorMenu = new JPopupMenu( "Colors" );
      controlMenu = new JMenu( "Control" );
      init();
      setSize( 300, 150 );
      getContentPane().setBackground( orig );
      addMouseListener( this );
      setVisible( true );
   }
   public void actionPerformed( ActionEvent e ) {
      String s = e.getActionCommand();
      if ( s.equals( "Exit" ) )
        System.exit( 0 ); 
      else if ( s.equals( "Restore" ) )
        getContentPane().setBackground( orig );
      else 
        setColor( s );
   }
   public void mousePressed( MouseEvent e ) { checkTrigger( e ); }
   public void mouseClicked( MouseEvent e ) { checkTrigger( e ); }
   public void mouseEntered( MouseEvent e ) { checkTrigger( e ); }
   public void mouseExited( MouseEvent e ) { checkTrigger( e ); }
   public void mouseReleased( MouseEvent e ) { checkTrigger( e ); }
   private void checkTrigger( MouseEvent e ) {
      if ( e.isPopupTrigger() ) 
        colorMenu.show( this, e.getX(), e.getY() );
   }
   private void init() {
      colorMenu.setBorder( new BevelBorder( BevelBorder.RAISED ) );
      initMenu( colorMenu, colorNames ); 
      initMenu( controlMenu, controls );
      menuBar.add( controlMenu );
      setJMenuBar( menuBar );
   }
   private void initMenu( JComponent menu, String[ ] items ) {
      for ( int i = 0; i < items.length; i++ ) {
        JMenuItem item = new JMenuItem( items[ i ] );
        item.addActionListener( this );
        menu.add( item );
      }         
   }
   private void setColor( String c ) {
      int i = 0;
      while ( i < colorNames.length ) 
        if ( c.equals( colorNames[ i ] ) ) {
          getContentPane().setBackground( colors[ i ] );
          break;
        }
        else
          i++;
   }
   private JMenuBar menuBar;
   private JPopupMenu colorMenu;
   private JMenu controlMenu;
   private static final Color orig = Color.white;
   private static final String[ ] colorNames = 
      { "Blue", "Cyan", "Gray", "Orange", "Pink" };
   private static final Color[ ] colors =
      { Color.blue, Color.cyan, Color.gray, Color.orange, Color.pink };
   private static final String[ ] controls = { "Restore", "Exit" };
   
   public static void main(String[] args) {
   	 new ColorMenuEx2();
   } 
}

