
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentDataSearch extends JFrame
{
	private JMenuBar menuBar  = new JMenuBar();
    private JMenu sortMenu     = new JMenu("Sorting");
    private JMenu searchMenu     = new JMenu("Searching");
    private JMenuItem searchbyName,searchbyId, searchbyGpa;;
    private JTextField jtf1 = new JTextField(30);
    private JTextArea jta1 = new JTextArea(10,30);
    private JTextArea jta2 = new JTextArea(10,30);
    private String[] name = {"Ali","Nasir","Majed","Ali","Fahd","Abdallah"};
    private int[] id = {987566,995675,987690,987645,200124,976549};
    private double[] gpa = {2.5,3.2,2.1,2.75,3.0,1.8};    
    int c;
    Container cp = getContentPane();
        
    StudentDataSearch()
    {
    	
        cp.setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Students Records");
    
        setJMenuBar(menuBar);
   
        menuBar.add(searchMenu);

        
        
        //fileMenu.add(prinT = new JCheckBoxMenuItem ("Print"));
        searchMenu.add(searchbyName   = new JMenuItem("By Name"));
        searchMenu.add(searchbyId   = new JMenuItem("By ID"));
        searchMenu.add(searchbyGpa   = new JMenuItem("By GPA"));
        
        cp.add(jta1);
        cp.add(jta2);
        cp.add(jtf1);
        for (int i=0; i<name.length; i++)
        {
        	c++;
        	jta1.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        }
        
        show();
        
        
        searchbyName.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		String input;
        	
        		jta2.setText("Searched by Name"+"\n");
        		input=jtf1.getText();
        		for (int i=0; i<name.length; i++)
        		{
        			if (input.equalsIgnoreCase(name[i]))
        			{
        				c++;
        				jta2.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        			}
        		}
        	}
        });
        
        searchbyId.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		int inputId;
        		
        		jta2.setText("Searched by id"+"\n");
        		inputId=Integer.parseInt( jtf1.getText() ) ;
        		for (int i=0; i<name.length; i++)
        		{
        			if (inputId==(id[i]))
        			{
        				c++;
        				jta2.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        			}
        		}
        	}
        });
                       
        
        searchbyGpa.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		double inputGpa;
        		
        		jta2.setText("Searched by GPA"+"\n");
        		inputGpa=Double.parseDouble( jtf1.getText() ) ;
        		for (int i=0; i<name.length; i++)
        		{
        			if (inputGpa==(gpa[i]))
        			{
        				c++;
        				jta2.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        			}
        		}
        	}
        });
        
        } // end of constructor
        
        
        
        
        
        public static void main(String args[])
        {
        	StudentDataSearch obj = new StudentDataSearch();		
        }
}
