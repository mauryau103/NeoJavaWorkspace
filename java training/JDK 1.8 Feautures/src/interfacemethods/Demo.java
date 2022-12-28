package interfacemethods;

public class Demo {
public static void main(String[] args) {
	Test.test();
	Circle c=new Circle();
	c.myMethod1(); // default method of interface
	c.myMethod2();
	Sphere s=new Sphere();
	s.myMethod1(); // default method of interface
	c.myMethod2();
   
}
}