import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class GameRule2 extends Frame implements ActionListener
{
  private static int size=4;	
  private static int noOfButtons=size*size;
  private Button buttons[][] = new Button[size][size];  
  private Button buttonsPressed[][] = new Button[size][size];  
  private Button current=null;  
  private TextField jtf1 = new TextField(30);
  private Panel panel1  = new Panel();
  private Panel panel2 = new Panel();
  
  private static int rowCurrent,colCurrent;
  public GameRule2()
  {    
    rowCurrent=colCurrent=-1;
    setTitle("Random Buttons -- Designed by Murtaza Khan"); // Set the window title
    setSize(350,200); // setting width and height of frace
	
	panel1.setLayout(new GridLayout(4,4));
	String[] strAry=randomString(noOfButtons);
	int count=0;
    for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		buttons[i][j] = new Button(strAry[count++]);
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
    new GameRule2();    
  }

  public void actionPerformed(ActionEvent ae)
  {
  	int rowCurrent=0;
  	int colCurrent=0;
  	
  	for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		if (ae.getSource() == buttons[i][j]){
    			rowCurrent=i;
    			colCurrent=j;
    			buttons[i][j].removeActionListener(this);
    		}
    	}
    }
    current=buttons[rowCurrent][colCurrent];  
    current.setBackground(Color.pink);
    jtf1.setText(jtf1.getText()+current.getLabel());  	    
  }    
  
  public String[] randomString(int n)
  {
  	String [] strAry1={"A","B","C","D","E","F","G","H","I","J","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  	String [] strAry2 = new String[n];
  	int [] a = new int[n];
  	Random generator = new Random();
  	for (int i = 0; i < a.length; i++)
  	{
  		a[i] = generator.nextInt(26);
  		strAry2[i]=strAry1[a[i]];
  		//System.out.print(strAry2[i]+"\t");
  	}  		  	
  	return strAry2;
  }
    
}

 
