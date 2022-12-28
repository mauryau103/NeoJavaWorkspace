package producerconsumer;

public class ConsumerThread extends Thread{
	Factory fact;
	public ConsumerThread() {
		
	}
	public ConsumerThread(Factory fact) {
		this.fact=fact;
		
	}
	@Override
	public void run() {
		
		while(true) {
			try {
				sleep(400);
				fact.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
