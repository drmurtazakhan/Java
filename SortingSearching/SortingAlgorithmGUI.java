import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SortingAlgorithmGUI extends JFrame
{
	private JMenuBar menuBar  = new JMenuBar();
    private JMenu sortMenu     = new JMenu("Sorting");
   
    private JMenuItem selectionSort, insertionSort, quickSort,mergeSort;
   
     private JTextArea jta1 = new JTextArea(10,30);
    private JTextArea jta2 = new JTextArea(10,30);
    
    private int[] data = {98,56,87,76,20,65};
    
    int c;
    Container cp = getContentPane();
        
    SortingAlgorithmGUI()
    {
    	
        cp.setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Sorting Algorithm");
    
        setJMenuBar(menuBar);
        menuBar.add(sortMenu);
        

        sortMenu.add(selectionSort   = new JMenuItem ("Selection Sort"));
        sortMenu.add(insertionSort  = new JMenuItem ("Insertion Sort"));
        sortMenu.add(quickSort  = new JMenuItem ("Quick Sort"));
        sortMenu.add(mergeSort  = new JMenuItem ("Merge Sort"));
        
        cp.add(jta1);
        cp.add(jta2);
        for (int i=0; i<data.length; i++)
        {
        	c++;
        	jta1.append(" "+data[i]);
        }
        
        show();
        selectionSort.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		jta2.setText("Selection Sort"+"\n");
        		Arrays.sort(name);
        		for (int i=0; i<data.length; i++)
        		{
        			c++;
        			jta2.append(data[i]);
        		}
        	}
        });
        insertionSort.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		jta2.setText("Insertion Sort"+"\n");
        		for (int i=0; i<data.length; i++)
        		{
        			c++;
        			jta2.append(data[i]);
        		}
        	}
        });
        
        quickSort.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		jta2.setText("Quick Sort"+"\n");
        		
        		for (int i=0; i<name.length; i++)
        		{
        			c++;
        			jta2.append(data[i]);
        		}
        	}
        });
        
        mergeSort.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		c=0;
        		jta2.setText("Merge Sort"+"\n");
        		
        		for (int i=0; i<name.length; i++)
        		{
        			c++;
        			jta2.append(data[i]);
        		}
        	}
        });
                       
        
        } // end of constructor
        
        
        
        
        
        public static void main(String args[])
        {
        	SortingAlgorithmGUI obj = new SortingAlgorithmGUI();		
        }
}
