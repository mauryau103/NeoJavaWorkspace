package banking;

public class WithdrawThread extends Thread{
	BankAccount account;
	public WithdrawThread() {
		// TODO Auto-generated constructor stub
	}
	public WithdrawThread(BankAccount account){
		this.account=account;
	}
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" Thread started");
			// logic  // deposit is waiting till withdraw comes outs			
			for(int i=1;i<=2;i++) {
			   Thread.sleep(100);
				synchronized (account) { // account locked
				System.out.println("Balance before withdraw:"+account.getBalance());
				account.withdraw(6000) ;// method get auto synched
				System.out.println("Balance after withdraw:"+account.getBalance());			
				}// account unlocked
				 Thread.sleep(200);
			}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+" Thread ended");
	}
}