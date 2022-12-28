package kunal;

interface printable{
	void display();
	int s=5;
}
public class ImplementDemo implements printable {
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am interface method");
		System.out.println(s);
	}

	public static void main(String[] args) {
		ImplementDemo implementDemo = new ImplementDemo();
		implementDemo.display();
		System.out.println(s);
		printable printable1=new ImplementDemo();
		printable1.display();
	}

	
	
}
