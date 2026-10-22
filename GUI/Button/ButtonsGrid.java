import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonsGrid extends Frame implements ActionListener
{
  private static int size=3;	  
  private Button buttons[][] = new Button[size][size];  
  private Button current=null;
  String[] alphabet = {"A","B","C","D","E","F","G","H","I"};
  private TextField jtf1 = new TextField(30);
  private TextField jtf2 = new TextField(30);
  private Panel panel1  = new Panel();
  private Panel panel2 = new Panel();  
  private Panel panel3 = new Panel();  
  private static int rowCurrent,colCurrent;
  public ButtonsGrid()
  {     
    setTitle("Buttons Gridlayout -- Designed by Murtaza Khan"); // Set the window title
    setSize(350,200); // setting width and height of frace
	
	panel1.setLayout(new GridLayout(size,size));
	int count=0;
    for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		buttons[i][j] = new Button(alphabet[count++]);
    		panel1.add(buttons[i][j]);
    		buttons[i][j].addActionListener(this);
    	}
      }
    add("Center", panel1);    
    panel2.setLayout(new FlowLayout());
    panel2.add(jtf1);
    add("North",panel2);    
    panel3.setLayout(new FlowLayout());
    panel3.add(jtf2);
    add("South",panel3);    
    show();
  }
  public static void main(String[] args)
  {
    new ButtonsGrid();    
  }

  public void actionPerformed(ActionEvent ae)
  {  	
  	for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		if (ae.getSource() == buttons[i][j]){
    			rowCurrent=i;
    			colCurrent=j;
    		}
    	}
    }
    jtf1.setText("Row= "+rowCurrent+" "+"Col="+colCurrent);  
    jtf2.setText(jtf2.getText()+buttons[rowCurrent][colCurrent].getLabel());
  }  
    
}
