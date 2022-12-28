package communication;

public class BankAccount {
	private long accountNum;
	private int custId;
	private String type;
	private double balance;
	private boolean flag=false;
	
	public BankAccount() {
			accountNum=1111;
			custId=2222;
			type="Saving";
			balance=0;
	}
	
	public BankAccount(long accountNum, int custId, String type, double balance) {
		super();
		this.accountNum = accountNum;
		this.custId = custId;
		this.type = type;
		this.balance = balance;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", custId=" + custId + ", type=" + type + ", balance="
				+ balance + "]";
	}
	public   double deposit(double amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" checking flag value "+flag);
		if(flag==true) {
			System.out.println("waiting...");
			wait();
			System.out.println("out of waiting...");
		}
		System.out.println(Thread.currentThread().getName()+" entered in deposit");
		Thread.sleep(200);
		System.out.println(amount + " to deposit");
		balance=balance+amount;
		System.out.println(Thread.currentThread().getName()+" exited from deposit");
		flag=true;  // done with deposit
		notify();  // a thread who is in waiting state by calling wait();  // notifyAll
		return balance;
	}
	// locked
	public   double withdraw(double amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" checking flag value "+flag);
		if(flag==false)
		{
			System.out.println("waiting...");
			wait();   // resource will be unlocked
			System.out.println("out of waiting...");
		}
		System.out.println(Thread.currentThread().getName()+" entered in withdraw");
		System.out.println(amount + " to withdraw");
		balance=balance-amount;
		Thread.sleep(500);
		System.out.println(Thread.currentThread().getName()+" exited from withdraw");
		flag=false;
		notify();
		return balance;
		
	}
}