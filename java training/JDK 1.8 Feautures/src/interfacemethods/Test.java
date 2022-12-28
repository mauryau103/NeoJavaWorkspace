package interfacemethods;

public interface Test {
	double pie=3.142;
	double getArea();  // public abstract
	 static void test() {
		System.out.println("Common bevaviour given to multiple classes implementing interface");
	}
	 default void myMethod1() {
		System.out.println("any default behvaiour needed for classes implementing interface");
		myPrivateMethod();
	}
	
	 default void myMethod2() {
		System.out.println("any default behvaiour needed for classes implementing interface");
		myPrivateMethod();
	}
	
	private void myPrivateMethod() {
		System.out.println("any private logic");
	}
}