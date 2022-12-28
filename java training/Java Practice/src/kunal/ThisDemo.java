package kunal;
class This{
	int id;
	String nameString;
	public This() {
		// TODO Auto-generated constructor stub
		this(23,"umesh");
		this.display();
		System.out.println("This is Default constructor");
		
	}
	public This(int id, String nameString) {
		//this();//calling default constructor in parametersied construdctor
		this.id = id;
		this.nameString = nameString;
	}
	void display() {
		System.out.println(id+" "+nameString);
	}
}
public class ThisDemo {
public static void main(String[] args) {
//	This this1 = new This(12, "umesh");
	This this2=new This();
//	this1.display();
}
}
