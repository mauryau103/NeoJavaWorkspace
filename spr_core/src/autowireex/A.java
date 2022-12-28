package autowireex;



public class A {
	
	B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	
	
	public A(B b) {
		super();
		this.b = b;
		System.out.println("inside A constructor");
	}

	public void printing() {
		System.out.println("hello A");
	}
	
	public void display() {
		
		printing();
		b.printing();
		System.out.println("Display in A class");
	}
}
