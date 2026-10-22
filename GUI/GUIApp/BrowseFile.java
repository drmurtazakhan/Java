//BrowseFile.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class BrowseFile extends JFrame //implements ActionListener
{	
	private File currDir=null;
	private String fname="";
	static boolean fileoflg=false;  // file open flag	
	
	private JButton browseJB;	
	private JPanel southPanel;
	static Container cp;
	
	public BrowseFile() 
	{
		cp = getContentPane();		
		cp.setLayout(new BorderLayout());	
		setTitle("Pie Chart Control Tool");	
		setSize(500,100);		
		browseJB = new JButton("Browse");
		browseJB.addActionListener(new browseJBHandler() );		
		
		southPanel=new JPanel();
		southPanel.add(browseJB);	
				
		cp.add("South",southPanel);			
		show();
		//pack();
	}	
	
    
    class browseJBHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent e )
    	{
  	  	    JFileChooser chooser;
	      	if (currDir!=null)
	      		chooser = new JFileChooser(currDir);
	      	else
	      		chooser = new JFileChooser();
	      		
	        int option = chooser.showOpenDialog(BrowseFile.this);
	        if (option == JFileChooser.APPROVE_OPTION)
	        {
	        	if (chooser.getSelectedFile()!=null)
	        	{
	        		
	        		String nameF=chooser.getSelectedFile().getName();
	        		currDir=chooser.getCurrentDirectory(); // File currdir
	        		String nameD=currDir.getAbsolutePath();	        		
	        		fname=nameD+File.separator+nameF;	        		
					//pieAry=PieData.ReadFromFile(fname);			
					setTitle(fname);
	        		fileoflg=true; // file has been opened
	        		setVisible(true);
	        	}
	        }
    	}
    } //end of inner class browseJBHandler
    
    /** returns name of browsed file */    	
    public String getfname()
    {
    	return fname;
    }
    public static void main(String args[]) throws IOException
    {
    	new BrowseFile();    	
    }
}
