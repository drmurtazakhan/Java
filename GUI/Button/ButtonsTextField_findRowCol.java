// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonsTextField_findRowCol extends Frame implements ActionListener
{
  private static int size=5;	
  private static int noOfButtons=size*size;
  private Button buttons[][] = new Button[size][size];
  private Button previous=null;
  private Button current=null;
  String[] alphabet = {"A","B","C","D","E","F","G","H","I"};
  private TextField jtf1 = new TextField(30);
  private TextField jtf2 = new TextField(10);
  private Panel panel1  = new Panel();
  private Panel panel2 = new Panel();
  private Panel panel3 = new Panel(); 
  private static int rowCurrent,colCurrent;
  public ButtonsTextField_findRowCol()
  {    
    rowCurrent=colCurrent=-1;
    setTitle("ButtonsTextField_findRowCol -- Designed by Murtaza Khan"); // Set the window title
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
    panel3.setLayout(new FlowLayout());
    panel3.add(jtf2);
    add("South",panel3);
    
    show();
  }
  public static void main(String[] args)
  {
    new ButtonsTextField_findRowCol();    
  }

  public void actionPerformed(ActionEvent ae)
  {
  	int rowPrevious,colPrevious;
  	rowPrevious=rowCurrent;
  	colPrevious=colCurrent;
  	previous=current;
  	for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		if (ae.getSource() == buttons[i][j]){
    			rowCurrent=i;
    			colCurrent=j;
    		}
    	}
      }
    if (previous==null)  
    {
    	current=buttons[rowCurrent][colCurrent];  
    	current.setBackground(Color.pink);
    	jtf1.setText(jtf1.getText()+current.getLabel());  	
    	jtf2.setText("Legal Move");  	
    }
  	if (previous!=null)
  	{  		
  	    boolean flag=checkAdjacent(rowCurrent,rowPrevious,colCurrent,colPrevious);  	
  		if (flag)
  		{
  			current=buttons[rowCurrent][colCurrent];  
    		current.setBackground(Color.pink);
    		jtf1.setText(jtf1.getText()+current.getLabel());  	
    		jtf2.setText("Legal Move");  	
  		}
  		else
  		{
  			rowCurrent=rowPrevious;
  			colCurrent=colPrevious;
  			jtf2.setText("Illegal Move");  	
  		}
  	}
  }  
  public boolean checkAdjacent(int rowCurrent,int rowPrevious,int colCurrent,int colPrevious)
  {
  	boolean flag=false;
  	
  	if (rowCurrent==rowPrevious)
  	{
  		if (colCurrent==colPrevious-1 || colCurrent==colPrevious+1)
  		flag=true;
  	}
  	else if (rowCurrent==rowPrevious-1 || rowCurrent==rowPrevious+1 )
  	{
  		if (colCurrent==colPrevious-1 || colCurrent==colPrevious+1 || colCurrent==colPrevious )
  		flag=true; 
  	}
  	else
  	flag=false;
  	return flag;
  }
    
}
