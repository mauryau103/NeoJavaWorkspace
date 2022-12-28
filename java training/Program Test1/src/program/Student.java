package program;
public class Student{
	private int id;
	private String name;
	private float marks;
	String grade;
	public double percentage;
	
	public Student(int id, String name, float marks,String grade,double percentage) {
		//super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade=grade;
		this.percentage=percentage;
		
	}
	
	

	public Student() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	

	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public double getPercentage() {
		return percentage;
	}



	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", grade=" + grade + ", percentage="
				+ percentage + "]";
	}



	
	
	
	
}