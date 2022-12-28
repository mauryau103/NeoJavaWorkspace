package producerconsumer;

public class ProducerThread extends Thread{
	Factory fact;
	public ProducerThread() {
		
	}
	public ProducerThread(Factory fact) {
		this.fact=fact;
		
	}
	@Override
	public void run() {
		
		while(true) {
			try {
				sleep(250);
				fact.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
