package program;

import java.util.Iterator;
import java.util.Scanner;

public class Methods{

		Student s[];
		public static int i=0;
		
		public Methods() {
			s=new Student[5];
		}
	public boolean adddetails(Student student) {
		
		if(student!=null) {
			s[i]=student;
			i++;
			System.out.println("Student Details Added till previous index of :" +i);
			return true;
			
		}
		else
		return false;
	}
	public void display() {
		for(Student stu:s)
			System.out.println(stu);
	}
	public Student  searchStudent(int studentId) {
		Student searchedStudent=null;
		for(int j=0;j<i;j++) {
			Student stu=s[j];
			if(stu!=null&&stu.getId()==studentId) {
				searchedStudent=stu;
				break;
			}
		}
		return searchedStudent;
	}
	public double percentage(float total) {
		double percentage;
		percentage = (total/500.0)*100;
		return percentage;
	}


	public String grade(double per) {
		String grade;
		if(per>=90) {
		     grade ="A";
		    
		}
		else if(per>=75){
			grade ="B";
			
		}
		else if (per>=60) {
			grade="C";
			
		}else {
			grade="D";
		}
		
		return grade;
		
	}

	
	public Student searchStudentString(String studentString) {
		Student searchedStudentString=null;
		for(int k=0;k<i;k++) {
			Student stu=s[k];
			if(stu!=null && stu.getName().contains(studentString)) {
				searchedStudentString=stu;
			
			}
		}
		return searchedStudentString;
	}
	public Student searchStudentPercentage(Double percentage) {
		Student searchedStudentPercentage=null;
		for(int j=0;j<i;j++) {
			Student stu=s[j];
			if(stu!=null && stu.getPercentage()==percentage) {
				searchedStudentPercentage=stu;
			
			}
		}// ended
		return searchedStudentPercentage;  // null will returned if no book found
	}
	public Student searchStuentGrade(String grade) {
		Student searchedStudentGrade=null;
		for(int j=0;j<i;j++) {
			Student stu=s[j];
			if(stu!=null && stu.getGrade().equals(grade)) {
				searchedStudentGrade=stu;
				
			}
		}// ended
		return searchedStudentGrade;  // null will returned if no book found
	}

}