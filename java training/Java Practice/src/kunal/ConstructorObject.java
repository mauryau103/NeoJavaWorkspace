package kunal;

public class ConstructorObject {

	int id;
	String nameString;
	
	public ConstructorObject(int id, String nameString) {
		
		this.id = id;
		this.nameString = nameString;
	}
	
	public ConstructorObject(ConstructorObject obj) {
		id=obj.id;
		nameString=obj.nameString;
		
	}
	
	void display() {
		System.out.println(id+" "+nameString);
	}
	public static void main(String[] args) {
		ConstructorObject c1=new ConstructorObject(23,"Umesh");
		ConstructorObject c2=new ConstructorObject(c1);	
		c1.display();
		c2.display();
	}
}
