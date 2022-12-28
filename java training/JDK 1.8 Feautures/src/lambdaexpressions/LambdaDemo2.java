package lambdaexpressions;

class ChildWork{
	
	public static void loop(){
		for(int k=10;k<=20;k++) {
			System.out.println(k);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}




public class LambdaDemo2 {
public static void main(String[] args) {
	
	//1. Runnable obj
	//2. Thread obj
	//3. start a thread
	/*
	Runnable r=()-> {
		System.out.println("Child 1 started executing");
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread=new Thread(r);
	thread.start();
	Runnable r1=()-> {
		System.out.println("Child 2 started executing");
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread1=new Thread(r1);
	thread1.start();
	Runnable r2=()-> System.out.println("Child started executing");
	Thread thread2=new Thread(r2);
	thread2.start();
	
*/
	Runnable r3=ChildWork::loop;
	Thread t3=new Thread(r3);
	t3.start();
	
	
	
	
	
}
}