// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ

import java.util.StringTokenizer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MergeSortArrayofIntegersGUI extends JFrame implements ActionListener {
	
   private JTextField jtfMsg = new JTextField(30);
   private JTextField jtf1 = new JTextField(30);
   private JTextField jtf2 = new JTextField(30);
   
   private JPanel panel1 = new JPanel();      
   private JButton sortBt = new JButton("Sort");   
       
   public MergeSortArrayofIntegersGUI() {  
      super("GUI Mergesort Array of Integers");
      setSize(450,150);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      sortBt.addActionListener(this);
      panel1.setLayout(new GridLayout(3,1));
      
      panel1.add(jtfMsg);	
      jtfMsg.setText("Enter integers seprated by spaces in the text field below");
      	
      panel1.add(jtf1);
      panel1.add(jtf2);      
      
      cp.add(panel1);
      cp.add(sortBt);
      jtf2.setEditable(false);
      show();
   } 
   public void actionPerformed( ActionEvent ae){   	       	    
   	    
   	    jtf2.setText("");
	    String s=jtf1.getText();
	    StringTokenizer tokenizer= new StringTokenizer (s);
	    int count=tokenizer.countTokens();
	    int a[] = new int[count];   	    
	    int i=0;
	    while( tokenizer.hasMoreTokens( ) )
	    {
	    	a[i]=Integer.parseInt( tokenizer.nextToken() );
	    	i++;
	    }	    
	    MergeSort.sort(a);
	    for (int k=0; k<a.length; k++)
	    {
	    	jtf2.setText(jtf2.getText()+a[k]+" ");	    
	    }	    
   }
   public static void main(String args [] ) {
         new SortArrayofIntegers();
   }
}

class MergeSort
{
	public static void merge(int[] a,  int from,  int mid, int to)
	{
		int n = to - from + 1;
		int[] b = new int[n];
		int i1 = from;
		int i2 = mid + 1;
		int j = 0;  // next open position in b
		while (i1 <= mid && i2 <= to)
		{
			if (a[i1] < a[i2])
			{
				b[j] = a[i1];
				i1++;
			}
			else
			{
				b[j] = a[i2];
				i2++;
			}
			j++;
		}
		while (i1 <= mid)
		{
			b[j] = a[i1];
			i1++;
			j++;
		}
		while (i2 <= to)
		{
			b[j] = a[i2];
			i2++;
			j++;
		}
		for (j = 0; j < n; j++)
		a[from + j] = b[j];
	}
	public static void mergeSort(int[] a, int from, int to)
	{	if (from == to) return;
		int mid = (from + to) / 2;		
		mergeSort(a, from, mid);		
		mergeSort(a, mid + 1, to);
		merge(a, from, mid, to);
	}
	public static void sort(int[] a)
	{
		mergeSort(a, 0, a.length - 1);
	}
} 

