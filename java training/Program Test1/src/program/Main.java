package program;

import java.util.Iterator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Methods methods=new Methods();
		
		int ch=0;
		int id=0;
		String name=null;
		double per=0.0;
		String gDE=null;
				
		
		Student[] s=new Student[3];
		
		do {
			System.out.println("1: Enter Details \n 2:Search Student by Id \n3: Search by String\n 4: SEARCH by Percentage\n 5: Search By Grade\n 6:BACK");
			ch=scanner.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter your Id:");
				id=scanner.nextInt();
				System.out.println("Enter your Name:");
				name=scanner.next();
				int[] marks=new int[5];
				int total=0;
				System.out.println("Enter your marks for five subjects:");
				for(int i=0;i<5;i++) {
					 marks[i] = scanner.nextInt();
				 }
				 
				 for(int i=0;i<5;i++) {
					 total = total + marks[i];
				 }
				
				
				per= methods.percentage(total);
				gDE= methods.grade(per);
				
				Student student = new Student(id,name,total,gDE,per);
				
				boolean b=methods.adddetails(student);
				
				if(b)
					System.out.println("Deatils Added Successfully");
				else {
					System.out.println("Details Insertion Failed");
				}			
				break;
			case 2:
				Student searchedStudent=methods.searchStudent(id);
				System.out.println("Search Student bY Id:");
				id=scanner.nextInt();
				searchedStudent=methods.searchStudent(id);
				if(searchedStudent!=null) {
					System.out.println(searchedStudent);
					
				}
				else {
					System.out.println("student not Found");
				}
				break;
			case 3:
				
				Student searchedStudentString=methods.searchStudentString(name);
				System.out.println("Search by String Name");
				name=scanner.next();
				searchedStudentString=methods.searchStudentString(name);
				if(searchedStudentString!=null) {
					System.out.println(searchedStudentString);
				}
				else {
					System.out.println("Student not Found");
				}
				break;
			case 4:
				System.out.println("Search by Percentage");
				per = scanner.nextDouble();
				Student searchedStudentPercentage=methods.searchStudentPercentage(per);
				 if(searchedStudentPercentage!=null)
					 System.out.println(searchedStudentPercentage);
				 else
					 System.out.println("Student Not Found");
				break;
				
			case 5:
				System.out.println("Search by Grade");
				
				gDE = scanner.next();
				Student searchedStudentGrade=methods.searchStuentGrade(gDE);
				 if(searchedStudentGrade!=null)
					 System.out.println(searchedStudentGrade);
				 else
					 System.out.println("Student Not Found");
				break;
			case 6:
				methods.display();
				break;
			default:
				System.out.println("Wrong Details");
				break;
			}
		}while(ch!=6);
	}
}