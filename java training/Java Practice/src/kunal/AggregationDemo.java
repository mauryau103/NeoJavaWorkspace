package kunal;


class Operation{
	
	int square(int n) {
		return n*n;
	}
	
}
class Circle1{
	Operation operation;
	double pi=3.14;
	
	double area(int radius) {
		operation = new Operation();
		int rsquare=operation.square(radius);
		return pi*rsquare;
	}
}
public class AggregationDemo {
	
public static void main(String[] args) {
	Circle1 circle =	new Circle1();
	double result=circle.area(12);
	System.out.println(result);
	
}
}
