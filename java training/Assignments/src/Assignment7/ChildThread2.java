package Assignment7;


public class ChildThread2 extends Thread{
	
	TableClass tClass;
	 public ChildThread2(TableClass tClass) {
		 this.tClass=tClass;
	 }
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		tClass.printTable(8);
		
	}
}