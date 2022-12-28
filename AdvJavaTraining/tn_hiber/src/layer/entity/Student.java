package layer.entity;
import javax.persistence.*;

@Entity
@Table(name="studentinfo")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String sname;
	private String course;
	private double average;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String course, double average) {
		this.sname = sname;
		this.course = course;
		this.average = average;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
}
