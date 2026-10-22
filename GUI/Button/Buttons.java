import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends Frame implements ActionListener
{
  private JButton buttons[]= new JButton[4];    
  String[] alphabet = {"A","B","C","D"};  
  public Buttons()
  {     
    setTitle("Buttons -- Designed by Murtaza Khan"); // Set the window title
    setSize(500,400); // setting width and height of frace
    //Container cp = getContentPane();
    //cp.setLayout(new FlowLayout());
    setLayout(new FlowLayout());
	
	for (int j=0; j<buttons.length; j++){
    		buttons[j] = new JButton(alphabet[j]);
    		//cp.add(buttons[j]);
    		add(buttons[j]);
    		buttons[j].addActionListener(this);
    		buttons[j].setToolTipText(buttons[j].getText()); //buttons[j].getLabel()
    }    
    show();
    repaint();
  }
  
  public void paint(Graphics g) // override paint of java.awt.Container
  {	    Graphics2D g2 = (Graphics2D)g;				
  		buttons[0].setLocation(80,30) ;
  		buttons[1].setLocation(20,30) ;
  		buttons[2].setLocation(25,30) ;
  		buttons[3].setLocation(40,60) ;
  }
  
  public static void main(String[] args)
  {
    new Buttons();    
  }
  public void actionPerformed(ActionEvent ae)
  {  	
  	for (int i=0; i<buttons.length; i++){
    	if (ae.getSource() == buttons[i]){
    		System.out.println(buttons[i].getText());
    			
    	} // if   
    } // for     
  } // actionPeformed  
    
} // Buttons
