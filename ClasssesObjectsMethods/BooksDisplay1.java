import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import javax.swing.event.*;
 class BooksDisplay1 extends JFrame implements ActionListener{
	private Connection con=null;
   	private Statement selectStatement;
	private ResultSet selectResult;
	public void connectToDB(){
      	try{
			System.out.println("Loading the driver ...");
         	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         	System.out.println("Connecting to database ...");
			con = DriverManager.getConnection("jdbc:odbc:Library1");
			if(con!=null)
			System.out.println("Connected to database ...");
		}
		catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
		catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}
	}
	public void closeDB(){
		try {
			if(con != null)
			con.close();
		}
		catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
	}
	
	private JLabel numberLabel, authorLabel, titleLabel, borrowedLabel, borrowerLabel;
	private JTextField numberField, authorField, titleField, borrowedField, borrowerField;
	private JButton first, next, previous, last;

    BooksDisplay(String title) {
		super(title);
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
	   //}
	 
	   try{
			selectStatement = con.createStatement();
			System.out.println("Sending Query to database Table ...\n");
			selectResult = selectStatement.executeQuery(query);
			System.out.println("The Query  :  "+query+"\n");
			System.out.println("Query results\n");
         	while(selectResult.next()){
				System.out.println(selectResult.getString("IDNumber")+"\t"+selectResult.getString("Name")+"\t"+selectResult.getString("NumberOfBooks"));
          }
			selectResult.close();
	  
		catch(SQLException sqle){
         	System.out.println(sqle.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		BooksDisplay f = new BooksDisplay("Database File View System");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.show();
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==first){
    		numberField.setText(selectResult.first(selectResult.getString("author")));
    		authorField.setText(selectResult.first(selectResult.getString("bookNumber")));
    		titleField.setText(selectResult.first(selectResult.getString("title")));
    		borrowedField.setText(selectResult.first(selectResult.getString("borrowed")));
    		borrowerField.setText(selectResult.first(selectResult.getString("borrower")));
    	}
    }
}
