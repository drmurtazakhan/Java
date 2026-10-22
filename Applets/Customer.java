import  java.applet.*;
import  java.awt.*;
import  java.awt.event.*;

public class Customer extends Applet implements ActionListener{

	private final static int INITIAL_BAL = 500;
	private Button theWithDrawButton;
	private Button theDepositButton;
	private TextField theBalance;
	private TextField theMessage;
	private Account  account = new Account ( INITIAL_BAL );
	public void init( ){

		setLayout( new GridLayout(3, 1));
		theWithDrawButton = new Button( "Withdraw" );
		theDepositButton  = new Button( "Deposit" );
		theBalance    = new TextField( 10 );
		theMessage    = new TextField( 64 );
		Panel north = new Panel( );
		north.setLayout(new FlowLayout( ));
		north.add(theWithDrawButton);
		north.add(theDepositButton);
		add(north);

		Panel center = new Panel( );
		center.setLayout(new FlowLayout( ));
		center.add(new Label("Your Balance: "));
		center.add(theBalance);
		theBalance.setText(new String(new Integer(INITIAL_BAL).toString()));
		add(center);

		Panel south = new Panel( );
		south.setLayout(new FlowLayout( ));
		south.add(new Label("Message: "));
		south.add(theMessage);
		add(south);

		theWithDrawButton.addActionListener(this);
		theDepositButton.addActionListener(this);
	}
	public void actionPerformed( ActionEvent ae )
	{
		Object source = ae.getSource( );

		if (source == theWithDrawButton){
			account.withDraw(this);
			theBalance.setText("" +new String(new Integer(account.getBalance()).toString()));
		}
		else if (source == theDepositButton){
			account.deposit(this);
			theBalance.setText(""+new String(new Integer(account.getBalance()).toString()));
		}	
	}
	public void tellResult(String msg){
		theMessage.setText(msg);
	}
}

