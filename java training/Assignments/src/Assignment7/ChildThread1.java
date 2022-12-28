package Assignment7;


public class ChildThread1 extends Thread{

	 TableClass tClass;
	 public ChildThread1(TableClass tClass) {
		 this.tClass=tClass;
	 }
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		tClass.printTable(4);
		
	}
}
