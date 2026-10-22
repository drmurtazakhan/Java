public class Account{
	private int balance;	
	public Account(int qty)  {
		balance = qty;
	}
	public void withDraw(Customer customer)  {
		if ( balance > 0){
			balance -= 50;
			customer.tellResult("Thanks for your custom-- " +"come back soon.");
		}
		else
		customer.tellResult("Sorry -- your balance is nil."+" Want to depositing money?");
	}
	public void deposit(Customer customer)  {
		balance += 50;
		customer.tellResult("Thanks for depositing in our bank.");
	}
	public int getBalance( )  {
		return balance;
	}
}
