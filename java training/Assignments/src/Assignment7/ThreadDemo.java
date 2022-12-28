package Assignment7;

public class ThreadDemo {
	public static void main(String args[]) {
		TableClass tableClass = new TableClass();
		ChildThread1 thread1 = new ChildThread1(tableClass);
		ChildThread2 thread2= new ChildThread2(tableClass);
		
		
		thread1.setName("Thread with minimum prority");
		thread2.setName("Thread wih maximum priority");
		
		thread1.setPriority(1);
		thread2.setPriority(10);
		
		thread1.start();
		thread2.start();
		
		
	}

}
