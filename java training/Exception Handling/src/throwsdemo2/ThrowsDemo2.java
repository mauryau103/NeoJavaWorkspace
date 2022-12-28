package throwsdemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsDemo2 {
	MathOperation op;
	public ThrowsDemo2(MathOperation op) {
		this.op=op;
	}
    public void input()throws ArithmeticException,NumberFormatException,IOException {
    		System.out.println("input pushed on stack");
    	   BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
    	    System.out.println("Enter 2 nums for division");    
    	    int no1=Integer.parseInt(br.readLine()); // checked exception
    	    int no2=Integer.parseInt(br.readLine());
    	    op.divide(no1, no2); // call should be surrounded with try catch
    	    System.out.println("input popped from stack");
    }
    
    public static void main(String[] args) {
    	System.out.println("main pushed on stack");
    	MathOperation op=new MathOperation();
		ThrowsDemo2 td=new ThrowsDemo2(op);
			try {
				td.input();
			} catch (IOException | NumberFormatException | ArithmeticException e) {
				System.out.println("main caller");
				e.printStackTrace();
			}  // checked exception must be handled here
		System.out.println("main popped from stack");
	}
}