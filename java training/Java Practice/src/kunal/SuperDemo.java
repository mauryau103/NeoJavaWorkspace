package kunal;

import org.w3c.dom.ls.LSOutput;

class Demo{
	String nameString="umesh";
	void display2() {
		System.out.println("I am in parent class method");
	}
	
}
public class SuperDemo extends Demo{
	
	String nameString="Vimlesh";
	void display(){
		System.out.println(super.nameString);
		super.display2();
	}
public static void main(String[] args) {
	SuperDemo superDemo = new SuperDemo();
	System.out.println(superDemo.nameString);
	superDemo.display();
}
}
