package throwsdemo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwsdemo1 {
	MathOperation op;
	public Throwsdemo1(MathOperation op) {
		this.op=op;
	}
    public void input()throws ArithmeticException,InputMismatchException {
    	System.out.println("input pushed on stack");
    	    Scanner sc=new Scanner(System.in);
    	    System.out.println("Enter 2 nums for division");
    	    int no1=sc.nextInt();
    	    int no2=sc.nextInt();
    	    op.divide(no1, no2); // call should be surrounded with try catch
    	    System.out.println("input popped from stack");
    }
    
    public static void main(String[] args) {
    	System.out.println("main pushed on stack");
    	MathOperation op=new MathOperation();
		Throwsdemo1 td=new Throwsdemo1(op);
		try {
			td.input();
		}
		catch (ArithmeticException e) {
			System.out.println("callee's exception handled in main caller");
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("callee's exception handled in main caller");
			e.printStackTrace();
		}
		System.out.println("main popped from stack");
	}
}