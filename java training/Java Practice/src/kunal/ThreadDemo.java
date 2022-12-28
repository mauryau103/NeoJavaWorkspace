package kunal;

class Table{
	int x;
	void printTable(int n) {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		}
	}
		
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	
	public void run() {
		// TODO Auto-generated method 
		synchronized(t) {
			
		}
	
	t.printTable(5);
	}
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	public void run() {
		// TODO Auto-generated method stub
	t.printTable(100);
	}
}
public class ThreadDemo{
	
	
public static void main(String[] args) {
	final Table obj=new Table();
	Table obj1=new Table();
	MyThread1 thread1=new MyThread1(obj);
	MyThread2 thread2=new MyThread2(obj);
	thread1.start();
	thread2.start();
	
}
}
