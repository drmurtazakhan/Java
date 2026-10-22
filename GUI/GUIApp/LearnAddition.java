import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class LearnAddition extends JFrame implements ActionListener{
	private int ans=0;   
    private JTextField jtf1 = new JTextField(10);
    private JTextField jtf2 = new JTextField(10);
    private JTextField jtf3 = new JTextField(10);
    private JTextField jtf4 = new JTextField(10);
    private JButton ansButton  = new JButton("Check Answer");
    private JButton newNumbers  = new JButton("New Numbers");
    int n1,n2;
    Random generator = new Random();
    public LearnAddition(){
    	super("Learn Addition");
        setSize(500,150);
        Container cp = getContentPane();        
	    cp.setLayout(new FlowLayout());
        jtf1.setEditable(false);       
        jtf2.setEditable(false);       
        jtf4.setEditable(false);       
      	ansButton.addActionListener(this);
      	newNumbers.addActionListener(this);
      	
      	cp.add(jtf1);
      	cp.add(jtf2);
      	cp.add(jtf3);
      	cp.add(jtf4);
      	cp.add(ansButton);
      	cp.add(newNumbers);
      	n1=generator.nextInt(101);
        n2=generator.nextInt(101);
      	jtf1.setText(""+n1);
        jtf2.setText(""+n2);
      	show();
    }  
    public void actionPerformed( ActionEvent ae){
    	int ans;
      
        if(ae.getSource()==newNumbers)
        {
        	n1=generator.nextInt(100);
        	n2=generator.nextInt(100);
        	jtf1.setText(""+n1);
        	jtf2.setText(""+n2);
        }
        if(ae.getSource()==ansButton)
        {
        	ans=Integer.parseInt(jtf3.getText());
        	n1=Integer.parseInt(jtf1.getText());
        	n2=Integer.parseInt(jtf2.getText());
        	if(ans==n1+n2)
        	jtf4.setText("Right Answer");
        	else
        	jtf4.setText("Wrong Answer");
        }
   }
   public static void main(String args [] ) {
         new LearnAddition();
   }
}

