import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonsTextFiled extends Frame implements ActionListener
{
  private static int size=5;	
  private static int noOfButtons=size*size;
  private Button buttons[][] = new Button[size][size];
  String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y"};
  private TextField jtf1 = new TextField(30);
  private Panel panel1  = new Panel();
  private Panel panel2 = new Panel();
  private static int c1,c2,c3,c4,sum;
  
  public ButtonsTextFiled()
  {    
    setTitle("ButtonsTextFiled--Designed by Murtaza Khan"); // Set the window title
    setSize(350,200); // setting width and height of frace
	
	panel1.setLayout(new GridLayout(5,5));
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
    show();
  }
  public static void main(String[] args)
  {
    new ButtonsTextFiled();    
  }

  public void actionPerformed(ActionEvent ae)
  {
  	Button b=(Button) ae.getSource();
  	b.setBackground(Color.pink);
  	jtf1.setText(jtf1.getText()+b.getLabel());  	
  }  
  public boolean checkAdjacent(Button bPress)
  {
  	boolean flag=false;
  	return flag;
  }
    
}
