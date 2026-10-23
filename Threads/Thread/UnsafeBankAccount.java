class BanckAccount{ 
    private int balance; 
    public BanckAccount(int balance){ 
        this.balance = balance; 
    } 
     void doNothing(){ 
        depositWithdraw(50); 
        depositWithdraw(20); 
        depositWithdraw(10); 
    } 
    // void depositWithdraw(int money){ 
     synchronized void depositWithdraw(int money){ 
        try {
           balance += money; 
           Thread.sleep((long)(Math.random()*500));
           balance -= money; 
        } catch(Exception e){}
    } 

    // int get(){ 
     synchronized int get(){ 
        return balance; 
    } 
}
public class UnsafeBankAccount extends Thread{ 
    BanckAccount ba; 
    public static void main( String[] args ){ 
        BanckAccount ba = new BanckAccount(0); 
        for(int i=0; i<8; i++)
           new UnsafeBankAccount(ba).start(); 
    } 
    public UnsafeBankAccount(BanckAccount ba){ 
        this.ba = ba;
        System.out.println("MAKING " + getName()); 
    } 
    public  void run(){ 
        doWork(); 
    } 
    public void doWork(){ 
  
    	System.out.println(getName()+" get balance: "+ba.get());         
    	ba.doNothing(); 
        System.out.println(getName()+" got balance: "+ba.get());         
    }     
   
}
