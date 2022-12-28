package kunal;

public class Main {
public static void main(String[] args) {
	Shapes shapes = new Shapes();
	Shapes circle =new Circle();
	Shapes square = new Square();
	
	String string=circle.strshapeString;
	
	Shapes.greetings();
	circle.greetings();
	Circle.greetings();

}
}
