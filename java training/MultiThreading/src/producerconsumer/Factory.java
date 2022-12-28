package producerconsumer;

public class Factory {

	private volatile boolean flag=false;
	private int product=0;
	
	public synchronized void produce()throws InterruptedException{
		
		String name=Thread.currentThread().getName();
		
		if(flag==true) {
			wait();
		}
		product++;
		System.out.println("produced "+product);
		flag=true;
		notify();
		
	}
	public synchronized void consume()throws InterruptedException{
		
		String name=Thread.currentThread().getName();
		
		if(flag==false) {
			wait();
		}
		
		System.out.println("consumed "+product);
		flag=false;
		notify();
		
			
		}
}
