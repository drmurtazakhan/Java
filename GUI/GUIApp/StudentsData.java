import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentsData extends JFrame
{
	private JMenuBar menuBar  = new JMenuBar();
    private JMenu sortMenu     = new JMenu("Sorting");
    private JMenu searchMenu     = new JMenu("Searching");
    private JMenuItem sortbyName, sortbyId, sortbyGpa;
    private JRadioButtonMenuItem searchbyName,searchbyId, searchbyGpa;;
    private JTextField jtf1 = new JTextField(10);
    private JTextField jtf2 = new JTextField(10);
    private JTextArea jta1 = new JTextArea(10,30);
    private JTextArea jta2 = new JTextArea(10,30);
    private String[] name = {"Ali","Nasir","Majed","Ali","Fahd","Abdallah"};
    private String[] nameDummy =name;
    private int[] id = {987566,995675,987690,987645,200124,976549};
    private int[] idDummay=id;
    private double[] gpa = {2.5,3.2,2.1,2.75,3.0,1.8};    
    int c;
    Container cp = getContentPane();
        
    StudentsData()
    {
    	
        cp.setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Students Records");
    
        setJMenuBar(menuBar);
        menuBar.add(sortMenu);
        //menuBar.add(searchMenu);

        sortMenu.add(sortbyName   = new JMenuItem ("By Name"));
        sortMenu.add(sortbyId  = new JMenuItem ("By ID"));
        sortMenu.add(sortbyGpa  = new JMenuItem ("By GPA"));
        
        //fileMenu.add(prinT = new JCheckBoxMenuItem ("Print"));
        searchMenu.add(searchbyName   = new JRadioButtonMenuItem("By Name"));
        searchMenu.add(searchbyId   = new JRadioButtonMenuItem("By ID"));
        searchMenu.add(searchbyGpa   = new JRadioButtonMenuItem("By GPA"));
        
        //cp.add(jtf1);
        //cp.add(jtf2);
        cp.add(jta1);
        cp.add(jta2);
        for (int i=0; i<name.length; i++)
        {
        	c++;
        	jta1.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        }
        
        show();
        sortbyName.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		jta2.setText("Sorted by Name"+"\n");
        		int currentID;
        		String currentName;
        		double currentGpa;
        		int j;
        		for (int i = 1; i < name.length; i++)
        		{
        			currentName = name[i];
        			currentID = id[i];
        			currentGpa = gpa[i];
        			for (j = i; j>0 && currentName.compareTo(name[j-1]) < 0 ; j--)
        			{
        				name[j]=name[j-1];        				
        				gpa[j]=gpa[j-1];
        				id[j] = id[j-1];
        			}
        			name[j] =currentName;
        			gpa[j]  = currentGpa;
        			id[j]   = currentID;
        		}
        		for (int i=0; i<name.length; i++)
        		{
        			c++;
        			jta2.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        		}
        	}
        });
        
        sortbyId.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		jta2.setText("Sorted by ID"+"\n");
        		
        		int currentID;
        		String currentName;
        		double currentGpa;
        		int j;
        		for (int i = 1; i < name.length; i++)
        		{
        			currentID = id[i];
        			currentName = name[i];
        			currentGpa = gpa[i];
        			for (j = i; j>0 && currentID < id[j-1]; j--)
        			{
        				id[j] = id[j-1];
        				name[j]=name[j-1];
        				gpa[j]=gpa[j-1];
        			}
        			id[j]   = currentID;
        			name[j] =currentName;
        			gpa[j]  = currentGpa;
        		}
        		for (int i=0; i<name.length; i++)
        		{
        			c++;
        			jta2.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        		}
        	}
        });
        
        sortbyGpa.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		jta2.setText("Sorted by GPA"+"\n");
        		int currentID;
        		String currentName;
        		double currentGpa;
        		int j;
        		for (int i = 1; i < name.length; i++)
        		{
        			currentID = id[i];
        			currentName = name[i];
        			currentGpa = gpa[i];
        			for (j = i; j>0 && currentGpa < gpa[j-1]; j--)
        			{
        				gpa[j]=gpa[j-1];
        				id[j] = id[j-1];
        				name[j]=name[j-1];        				
        			}
        			gpa[j]  = currentGpa;
        			id[j]   = currentID;
        			name[j] =currentName;
        		}
        		for (int i=0; i<name.length; i++)
        		{
        			c++;
        			jta2.append(c+"\t"+name[i]+"\t"+id[i]+"\t"+gpa[i]+"\n");
        		}
        	}
        });
        
        searchbyName.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		String input;
        		cp.add(jtf1);
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
        
                       
        
        } // end of constructor
        
        
        
        
        
        public static void main(String args[])
        {
        	StudentsData obj = new StudentsData();		
        }
}
