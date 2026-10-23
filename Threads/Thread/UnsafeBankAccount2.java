class BanckAccount extends Thread{ 
    private int balance; 
    public BanckAccount(int balance){ 
        this.balance = balance; 
    } 
     public void run(){ 
        depositWithdraw(10); 
        depositWithdraw(20); 
        depositWithdraw(30); 
     } 
     void depositWithdraw(int money){ 
     //synchronized void depositWithdraw(int money){ 
        try {
           balance += money; 
           Thread.sleep((long)(1000));
           balance -= money; 
        } catch(Exception e){}
    } 

     int get(){ 
     //synchronized int get(){ 
        return balance; 
    } 
}
public class UnsafeBankAccount2 { 
    BanckAccount ba; 
    public static void main( String[] args )
    {                 
        BanckAccount[] ba = new BanckAccount[8]; 
        for(int i=0; i<8; i++)
        {
        	ba[i] = new BanckAccount(0); 
        	ba[i].start(); 
        	System.out.println( ba[i].get() );
        }
        for(int i=0; i<8; i++)
        {
        	System.out.println( ba[i].get() );
        }
        
    } 
    
}
