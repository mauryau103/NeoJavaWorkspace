package MethodReference;

import java.util.Scanner;
import java.util.function.Predicate;

public class ReferenceDemo {
public static void main(String[] args) {
	Voter vote=new Voter();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age to check for voting");
	int age=sc.nextInt();
	
	Predicate< Integer> pred=new Predicate<Integer>() {
		@Override
		public boolean test(Integer a) {
			/*
			 * if(a>=18) return true; else return false;
			 */		
			return vote.checkAge(age);
		}
	};
	boolean b=pred.test(age);
	System.out.println(b);
	
	Predicate<Integer> pred1=a->a>=18;
	boolean b1=pred1.test(age);
	System.out.println(b1);
	
	Predicate<Integer> pred2=vote::checkAge;
	boolean b2=pred2.test(age);
	System.out.println(b2);
	
	/*if u want to refer static method then put classname instead of object
	 * Voter::abc
	 * */
	
	
	
}
}