package communication;
/*Thread Synchronization : If multiple threads are working on shared resources (it is must) then
 * at some situation, some operations on shared resources need to be synched among threads so that
 * if any thread is working in synchronized method/ block of that resource then, 
 * other thread will wait until that thread will come out of synchronized method/ block of same resource*/
public class CommunicationDemo {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		BankAccount account=new BankAccount(333333,1212,"Salary",0);
		DepositThread dthread=new DepositThread(account);
		dthread.setName("Deposit");
		dthread.start(); // call automatically goes to run of DepositThread
		
		WithdrawThread wThread=new WithdrawThread(account);
		wThread.setName("Withdraw");
		wThread.start(); // call automatically goes to run of WithdrawThread
		System.out.println("main is waiting till childs bcom dead");
		
		  try { 
			  dthread.join(); wThread.join();  /*join() : thread will wait untill other thread on which join called bcm dead
			   																	join(long ms) / join (long ms,int ns) then thread will wait until timer expires or other thread bcm dead*/
			  }
		  catch (InterruptedException e) {
		 e.printStackTrace(); }
		 
		System.out.println("main came out of waiting ");
		System.out.println("Main thread ended");
		/*currently parent thread is not waiting for childs to complete their execution
		 * solution : join method*/
		// if one thread wants to wait untill other thread completes it execution and bcm dead : join method
		
	}
}