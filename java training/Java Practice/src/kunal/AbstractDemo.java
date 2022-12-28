package kunal;

interface B{
	void display3();
}
abstract class A implements B{
	abstract void printStatue();
	static void display() {
		System.out.println("i am in class A as a method");
	}
	//no method body and abstarct.
}
interface D extends B{
	void display4();
}
public class AbstractDemo extends A {

	@Override
	void printStatue() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method");
		
	}
	static void display() {
		System.out.println("Hello");
	}
public static void main(String[] args) {
	AbstractDemo abstractDemo=new AbstractDemo();
	abstractDemo.printStatue();
	abstractDemo.display();
}
@Override
public void display3() {
	// TODO Auto-generated method stub
	
}
}
