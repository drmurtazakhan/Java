import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.event.*;

public class BooksDisplay extends JFrame implements ActionListener{
	
	private JLabel numberLabel, authorLabel, titleLabel, borrowedLabel, borrowerLabel;
	private JTextField numberField, authorField, titleField, borrowedField, borrowerField;
	private JButton first, next, previous, last;
    private Statement selectStatement;
	private ResultSet selectResult;

	public BooksDisplay() {
		super("Database File View System");
		setSize(500, 300);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(5,1));
		labelPanel.add(numberLabel= new JLabel("Book Number:"));
		numberLabel.setBorder(new EmptyBorder(10,0,5,10));
		labelPanel.add(authorLabel = new JLabel("Book Author :"));
		labelPanel.add(titleLabel = new JLabel("Book Title  :"));
		labelPanel.add(borrowedLabel = new JLabel("Book Status :"));
		labelPanel.add(borrowerLabel = new JLabel("Borrower    :"));
		
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(new GridLayout(5,1));
		fieldPanel.add(numberField = new JTextField(30));
		Border border = numberField.getBorder();
		Border margin = new EmptyBorder(10,0,5,10);
		numberField.setBorder(new CompoundBorder(border, margin));
		
		fieldPanel.add(authorField = new JTextField(30));
		fieldPanel.add(titleField = new JTextField(30));
		fieldPanel.add(borrowedField = new JTextField(30));
		fieldPanel.add(borrowerField = new JTextField(30));
		
		JPanel mainPanel = new JPanel();
		mainPanel.add(labelPanel);
		mainPanel.add(fieldPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(first = new JButton("First"));		
		buttonPanel.add(next = new JButton("Next"));		
		buttonPanel.add(previous = new JButton("Previous"));		
		buttonPanel.add(last = new JButton("Last"));
				
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(mainPanel, BorderLayout.NORTH);
		cp.add(buttonPanel, BorderLayout.SOUTH);
		
		first.addActionListener(this);
		next.addActionListener(this);
	    previous.addActionListener(this);
	    last.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==first)
		    {
		   	numberField.setText(selectResult.getString("author"));
    		authorField.setText(selectResult.getString("bookNumber"));
    		titleField.setText(selectResult.getString("title"));
    		borrowedField.setText(selectResult.getString("borrowed"));
    		//borrowerField.setText(selectResult.getString("borrower"));
    	}
    	else if(e.getSource()==next)
    	{
    		selectResult.next();
    		numberField.setText(selectResult.getString("author"));
    		authorField.setText(selectResult.getString("bookNumber"));
    		titleField.setText(selectResult.getString("title"));
    		borrowedField.setText(selectResult.getString("borrowed"));
        }	


	 }	  
	public static void main(String[] args) {
		BooksDisplay f = new BooksDisplay();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.show();
    }
	
}
		
		