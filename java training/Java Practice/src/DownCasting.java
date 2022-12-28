import org.w3c.dom.ls.LSOutput;

//Parent class
class Parent{
	
	String name;
	
	// A Method which prints the data of parent class
	void showMessage() {
		System.out.println("Parent method is called");
	}
	
}
//Child class
class Child extends Parent{
	
	int age;
	
	//Performing overriding
	
	@Override
	void showMessage() {
		System.out.println("Child Method is called");
	}
	
}
public class DownCasting{
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.name="ABC";
		
		
		
		
	}
}