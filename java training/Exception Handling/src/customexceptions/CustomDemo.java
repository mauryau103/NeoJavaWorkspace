package customexceptions;

import java.util.Scanner;

public class CustomDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter voter age:");
		int age=sc.nextInt();
		Voter voter=new Voter();
		voter.checkAge(age);
		// put any other method calls
		System.out.println("Application ended here");
	}

}