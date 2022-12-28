package throwsdemo2;

public class MathOperation {
	public double divide(int num1, int num2)throws ArithmeticException {
		System.out.println("divide pushed on stack");
		double div=num1/num2;
		System.out.println("divide popped from stack");
		return div;
	}
}