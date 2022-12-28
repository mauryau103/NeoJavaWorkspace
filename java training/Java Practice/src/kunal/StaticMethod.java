package kunal;

import org.w3c.dom.ls.LSOutput;

class Student1{
	int rollno;
	String nameString;
	static String  college="Birla";
	
	static {
		System.out.println("Hello i am in student 1 class static bllock");
	}

	
	static void change(){
		college="Kalani collge";
	}

	public Student1(int rollno, String nameString) {
		this.rollno = rollno;
		this.nameString = nameString;
	}
	void display() {
		System.out.println(rollno+ " "+nameString+" "+college);
	}
}
public class StaticMethod {
	
static {
	System.out.println("Hello i am in main class static block");
}
	public static void main(String[] args) {
		Student1 s1=new Student1(34,"umesh");
		Student1 s2=new Student1(34,"um");
		s1.display();
		s2.display();
	}
}
