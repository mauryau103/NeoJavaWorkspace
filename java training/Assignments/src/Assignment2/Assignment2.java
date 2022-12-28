package Assignment2;


class Student{
	public int Sid;
	public String Sname;
	public String Scourse;
	public static int COUNT=1;
	public Student(int sid, String sname, String scourse) {
		super();
		Sid = COUNT;
		Sname = sname;
		Scourse = scourse;
		COUNT++;
	}
	@Override
	public String toString() {
		return "Student [Sid=CS-" + Sid + ", Sname=" + Sname + ", Scourse=" + Scourse + "]";
	}
	
	
	
}
public class Assignment2{
	public static void main(String[] args) {
		
		Student s1=new Student(Student.COUNT, "Lokesh", "Java");
		Student s2=new Student(Student.COUNT, "Rahul", "PHP");
		Student s3=new Student(Student.COUNT, "Siddhesh","JavaScript");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}
}