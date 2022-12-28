package kunal;

class Student{
	int id;
	String nameString;
	static String collString="Birla College"; //static variable
	
	//constructor
	public Student(int id, String nameString) {
		this.id = id;
		this.nameString = nameString;
	}
	
	void display() {
		System.out.println(id + " "+nameString+" "+collString);
	}
}
public class StaticVariable {
	public static void main(String[] args) {
		Student s1=new Student(123, "umesh");
		Student s2=new Student(345, "Akshat");
		s1.display();
		s2.display();
	}
	
	
	
	
	
}
