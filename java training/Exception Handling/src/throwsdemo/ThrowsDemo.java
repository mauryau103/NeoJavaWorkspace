package throwsdemo;

import java.util.Scanner;

public class ThrowsDemo {
	MathOperation op;
	public ThrowsDemo(MathOperation op) {
		this.op=op;
	}
    public void input() {
    	System.out.println("input pushed on stack");
    	    Scanner sc=new Scanner(System.in);
    	    try {
    	    System.out.println("Enter 2 nums for division");
    	    int no1=sc.nextInt();
    	    int no2=sc.nextInt();
    	    op.divide(no1, no2);
    	    }
    	    catch (ArithmeticException ae) {
    	    	System.out.println("callee's exception handled in caller");
			ae.printStackTrace();
			}
    	    System.out.println("input popped from stack");
    }
    
    public static void main(String[] args) {
    	System.out.println("main pushed on stack");
    	MathOperation op=new MathOperation();
		ThrowsDemo td=new ThrowsDemo(op);
		td.input();
		System.out.println("main popped from stack");
	}
}